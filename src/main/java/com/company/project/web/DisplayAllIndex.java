/**
 * 
 */
package com.company.project.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.HttpClientUtils;
import com.company.project.model.AllIndexSimple;
import com.company.project.model.Mulihe;
import com.company.project.model.Yuegangao;
import com.company.project.service.AllIndexSimpleService;
import com.company.project.service.MuliheService;
import com.company.project.service.YuegangaoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import tk.mybatis.mapper.entity.Condition;


/**
 * @author dell
 *
 */
@Controller
public class DisplayAllIndex {
	
	@Resource
    private AllIndexSimpleService allIndexSimpleService;
	
	@Resource
    private MuliheService muliheService;
	
	@RequestMapping("allIndex")
	public String allIndex(Model m,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, @RequestParam(defaultValue = "psr") String orderBy) {
		PageHelper.startPage(page, size);		
		Condition c=new Condition(AllIndexSimple.class);
		c.orderBy(orderBy);
		
		ArrayList<AllIndexSimple> list=(ArrayList<AllIndexSimple>) allIndexSimpleService.findByCondition(c);
		
		PageInfo<AllIndexSimple> pageInfo = new PageInfo<AllIndexSimple>(list);
		
		m.addAttribute("pageInfo", pageInfo);
		m.addAttribute("list", list);
		return "allIndex";
	}
	
	@RequestMapping("mulihe")
	public String mulihe(Model m,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(defaultValue = "id") String orderBy) {
		PageHelper.startPage(page, size);		
		Condition c=new Condition(Mulihe.class);
		c.orderBy(orderBy);
		
		ArrayList<Mulihe> list=(ArrayList<Mulihe>) muliheService.findByCondition(c);
		
		PageInfo<Mulihe> pageInfo = new PageInfo<Mulihe>(list);
		m.addAttribute("pageInfo", pageInfo);
		m.addAttribute("list", list);
		return "mulihe";
	}
	
	@RequestMapping("modifyMulihe")
	public String modifyMulihe(Model m,@RequestParam Integer id) {
		Mulihe mulihe=muliheService.findById(id);
		m.addAttribute("mulihe", mulihe);
		
		return "modifyMulihe";
	}
	
	@RequestMapping("saveMulihe")
	public String saveMulihe(Model m,@ModelAttribute Mulihe mulihe) {
		muliheService.update(mulihe);
		
		ArrayList<Mulihe> list=(ArrayList<Mulihe>) muliheService.findAll();
		PageInfo<Mulihe> pageInfo = new PageInfo<Mulihe>(list);
		
		m.addAttribute("pageInfo", pageInfo);
		m.addAttribute("list", list);
		return "mulihe";
	}
	
	@RequestMapping("echarts")
	public String echart(Model m) {
		return "echarts";
	}

	@RequestMapping(value = "/EchartsShow")
    @ResponseBody
    public List<Mulihe> findById(Model model) {
        Condition c=new Condition(Mulihe.class);
        c.and().andEqualTo("unit", "%").andIsNotNull("data2018");
        List<Mulihe> list = (ArrayList<Mulihe>) muliheService.findByCondition(c);  
		
        return list;
    }

    @RequestMapping(value = "aa")
	public String aa(Model m){
		List list= muliheService.findQualified();
		m.addAttribute("a",list);

		return "aa";
	}
}

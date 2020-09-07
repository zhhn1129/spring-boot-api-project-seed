/**
 * 
 */
package com.company.project.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.HttpClientUtils;
import com.company.project.model.Yuegangao;
import com.company.project.service.YuegangaoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;


/**
 * @author dell
 *
 */
@Controller
public class DisplayController {
	
	@Resource
    private YuegangaoService yuegangaoService;

	@RequestMapping("yuegangao")
	public String yuegangao(Model m,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
		PageHelper.startPage(page, size);		
		ArrayList<Yuegangao> list=(ArrayList<Yuegangao>) yuegangaoService.findAll();
		PageInfo pageInfo = new PageInfo(list);
		m.addAttribute("pageInfo", pageInfo);
		m.addAttribute("list", list);
		return "yuegangao";
	}
	
	@RequestMapping("pdca")
	public String pdca(Model m) {
		return "pdca";
	}

	@RequestMapping("mousescroll")
	public String mousescroll(Model m) {


		return "mousescroll";
	}
	
}

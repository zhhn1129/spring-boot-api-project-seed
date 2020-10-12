package com.company.project.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.company.project.model.Assessmentresult2019;
import com.company.project.model.Mulihe;
import com.company.project.service.Assessmentresult2019Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.project.model.Yuegangao;
import com.company.project.service.YuegangaoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Condition;

/**
 * @author dell
 *
 */
@Controller
public class DisplayController {

    @Resource
    private YuegangaoService yuegangaoService;

    @Resource
    private Assessmentresult2019Service assessmentresult2019Service;

    @RequestMapping("yuegangao")
    public String yuegangao(Model m, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        Condition c=new Condition(Yuegangao.class);
        c.orderBy("id");
        ArrayList<Yuegangao> list = (ArrayList<Yuegangao>) yuegangaoService.findByCondition(c);
//        System.out.println(list.get(1).getSecondindex());
        PageInfo pageInfo = new PageInfo(list);
        m.addAttribute("pageInfo", pageInfo);
        m.addAttribute("list", list);
        return "yuegangao";
    }

    @RequestMapping("assessmentResult_2019")
    public String assessmentResult_2019(Model m, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        ArrayList<Assessmentresult2019> list = (ArrayList<Assessmentresult2019>) assessmentresult2019Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
        m.addAttribute("pageInfo", pageInfo);
        m.addAttribute("list", list);
        return "assessmentResult_2019";
    }

    @RequestMapping(value = "/EchartsShow")
    @ResponseBody
    public List<Assessmentresult2019> findById(Model model) {
        Condition c=new Condition(Assessmentresult2019.class);
        c.or().orLike("secondindex", "不透水面%")
                .orLike("secondindex","单位GDP%")
                .orLike("secondindex","单位地区生产%")
                .orLike("secondindex","景观多样%")
                .orLike("secondindex","森林覆盖%")
                .orLike("secondindex","空气质量%");
        c.orderBy("id");
        List<Assessmentresult2019> list = (ArrayList<Assessmentresult2019>) assessmentresult2019Service.findByCondition(c);
        return list;
    }

    @RequestMapping("pdca/plan")
    public String plan(Model m) {
        return "pdca/plan";
    }

    @RequestMapping("/")
    public String index(Model m) {
        return "index";
    }

    @RequestMapping("pdca/doAndCheck")
    public String doAndCheck(Model m) {
        return "pdca/doAndCheck";
    }

    @RequestMapping("pdca/action")
    public String action(Model m) {
        return "pdca/action";
    }

    @RequestMapping("meliorize")
    public String meliorize(Model m) {
        return "meliorize";
    }

}

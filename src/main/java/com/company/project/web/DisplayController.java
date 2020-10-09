package com.company.project.web;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.project.model.Yuegangao;
import com.company.project.service.YuegangaoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * @author dell
 *
 */
@Controller
public class DisplayController {

    @Resource
    private YuegangaoService yuegangaoService;

    @RequestMapping("yuegangao")
    public String yuegangao(Model m, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        ArrayList<Yuegangao> list = (ArrayList<Yuegangao>) yuegangaoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        m.addAttribute("pageInfo", pageInfo);
        m.addAttribute("list", list);
        return "yuegangao";
    }

    @RequestMapping("pdca/plan")
    public String plan(Model m) {
        return "pdca/plan";
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

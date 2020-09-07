package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AllIndexSimple;
import com.company.project.service.AllIndexSimpleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/08/31.
*/
@RestController
@RequestMapping("/all/index/simple")
public class AllIndexSimpleController {
    @Resource
    private AllIndexSimpleService allIndexSimpleService;

    @PostMapping("/add")
    public Result add(AllIndexSimple allIndexSimple) {
        allIndexSimpleService.save(allIndexSimple);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        allIndexSimpleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(AllIndexSimple allIndexSimple) {
        allIndexSimpleService.update(allIndexSimple);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        AllIndexSimple allIndexSimple = allIndexSimpleService.findById(id);
        return ResultGenerator.genSuccessResult(allIndexSimple);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AllIndexSimple> list = allIndexSimpleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

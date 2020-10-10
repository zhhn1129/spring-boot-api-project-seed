package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Assessmentresult2019;
import com.company.project.service.Assessmentresult2019Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/10/09.
*/
@RestController
@RequestMapping("/assessmentresult2019")
public class Assessmentresult2019Controller {
    @Resource
    private Assessmentresult2019Service assessmentresult2019Service;

    @PostMapping("/add")
    public Result add(Assessmentresult2019 assessmentresult2019) {
        assessmentresult2019Service.save(assessmentresult2019);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        assessmentresult2019Service.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Assessmentresult2019 assessmentresult2019) {
        assessmentresult2019Service.update(assessmentresult2019);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Assessmentresult2019 assessmentresult2019 = assessmentresult2019Service.findById(id);
        return ResultGenerator.genSuccessResult(assessmentresult2019);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Assessmentresult2019> list = assessmentresult2019Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

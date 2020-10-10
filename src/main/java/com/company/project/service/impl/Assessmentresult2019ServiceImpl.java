package com.company.project.service.impl;

import com.company.project.dao.Assessmentresult2019Mapper;
import com.company.project.model.Assessmentresult2019;
import com.company.project.service.Assessmentresult2019Service;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/10/09.
 */
@Service
@Transactional
public class Assessmentresult2019ServiceImpl extends AbstractService<Assessmentresult2019> implements Assessmentresult2019Service {
    @Resource
    private Assessmentresult2019Mapper assessmentresult2019Mapper;

}

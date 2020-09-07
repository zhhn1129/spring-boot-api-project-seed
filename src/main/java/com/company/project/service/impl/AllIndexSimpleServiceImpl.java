package com.company.project.service.impl;

import com.company.project.dao.AllIndexSimpleMapper;
import com.company.project.model.AllIndexSimple;
import com.company.project.service.AllIndexSimpleService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/08/31.
 */
@Service
@Transactional
public class AllIndexSimpleServiceImpl extends AbstractService<AllIndexSimple> implements AllIndexSimpleService {
    @Resource
    private AllIndexSimpleMapper allIndexSimpleMapper;

}

package com.company.project.service.impl;

import com.company.project.dao.MuliheMapper;
import com.company.project.model.Mulihe;
import com.company.project.service.MuliheService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/09/02.
 */
@Service
@Transactional
public class MuliheServiceImpl extends AbstractService<Mulihe> implements MuliheService {
    @Resource
    private MuliheMapper muliheMapper;

    @Override
    public List<Mulihe> findQualified() {
        List<Mulihe> list= muliheMapper.findQualified();

        return list;
    }
}

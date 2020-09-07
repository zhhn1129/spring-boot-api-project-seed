package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Mulihe;

import java.util.List;

public interface MuliheMapper extends Mapper<Mulihe> {

    List<Mulihe> findQualified();


}

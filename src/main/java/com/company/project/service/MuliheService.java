package com.company.project.service;
import com.company.project.model.Mulihe;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/09/02.
 */
public interface MuliheService extends Service<Mulihe> {
    List<Mulihe> findQualified();


}

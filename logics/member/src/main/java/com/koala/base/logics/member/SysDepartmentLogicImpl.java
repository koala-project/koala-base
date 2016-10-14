package com.koala.base.logics.member;

import com.koala.base.entities.member.SysDepartment;
import com.koala.base.logics.common.AbstractCommonLogicImpl;
import com.koala.base.repositories.member.SysDepartmentMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class SysDepartmentLogicImpl extends AbstractCommonLogicImpl<SysDepartmentMapper, SysDepartment, Long> implements SysDepartmentLogic {
    
	@Resource
    SysDepartmentMapper sysDepartmentMapper;

    protected SysDepartmentMapper getMapper() {
        return sysDepartmentMapper;
    }
}
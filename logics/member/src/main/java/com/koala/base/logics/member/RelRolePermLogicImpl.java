package com.koala.base.logics.member;

import com.koala.base.repositories.member.RelRolePermMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class RelRolePermLogicImpl implements RelRolePermLogic {
    
	@Resource
    RelRolePermMapper relRolePermMapper;

    protected RelRolePermMapper getMapper() {
        return relRolePermMapper;
    }
}

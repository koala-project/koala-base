package com.koala.base.logics.member;

import com.koala.base.repositories.member.RelUserRoleMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RelUserRoleLogicImpl implements RelUserRoleLogic {
    
	@Resource
    RelUserRoleMapper relUserRoleMapper;

    protected RelUserRoleMapper getMapper() {
        return relUserRoleMapper;
    }
}

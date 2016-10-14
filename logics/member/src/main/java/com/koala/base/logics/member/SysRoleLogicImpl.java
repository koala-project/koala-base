package com.koala.base.logics.member;

import com.koala.base.entities.member.SysRole;
import com.koala.base.logics.common.AbstractCommonLogicImpl;
import com.koala.base.repositories.member.SysRoleMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class SysRoleLogicImpl extends AbstractCommonLogicImpl<SysRoleMapper, SysRole, Long> implements SysRoleLogic {
    
	@Resource
    SysRoleMapper sysRoleMapper;

    protected SysRoleMapper getMapper() {
        return sysRoleMapper;
    }
}
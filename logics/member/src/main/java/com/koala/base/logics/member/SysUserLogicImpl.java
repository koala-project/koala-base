package com.koala.base.logics.member;

import com.koala.base.entities.member.RelUserRole;
import com.koala.base.entities.member.SysUser;
import com.koala.base.logics.common.AbstractCommonLogicImpl;
import com.koala.base.repositories.member.SysUserMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SysUserLogicImpl extends AbstractCommonLogicImpl<SysUserMapper, SysUser, Long> implements SysUserLogic {
    
	@Resource
    SysUserMapper sysUserMapper;

    protected SysUserMapper getMapper() {
        return sysUserMapper;
    }

    @Override
    public SysUser selectUserRole(Long id) {
        return sysUserMapper.selectUserRole(id);
    }

    @Override
    public int saveRelUserRole(RelUserRole userRole) {
        return sysUserMapper.saveRelUserRole(userRole);
    }
}

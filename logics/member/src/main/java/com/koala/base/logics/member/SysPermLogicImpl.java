package com.koala.base.logics.member;

import com.koala.base.entities.member.SysPerm;
import com.koala.base.logics.common.AbstractCommonLogicImpl;
import com.koala.base.repositories.member.SysPermMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class SysPermLogicImpl extends AbstractCommonLogicImpl<SysPermMapper, SysPerm, Long> implements SysPermLogic {
    
	@Resource
    SysPermMapper sysPermMapper;

    protected SysPermMapper getMapper() {
        return sysPermMapper;
    }
}
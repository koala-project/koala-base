package com.koala.base.logics.member;

import com.koala.base.entities.member.KlUser;
import com.koala.base.logics.common.AbstractCommonLogicImpl;
import com.koala.base.repositories.member.KlUserMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class KlUserLogicImpl extends AbstractCommonLogicImpl<KlUserMapper, KlUser, Long> implements KlUserLogic {
    
	@Resource
    KlUserMapper klUserMapper;

    protected KlUserMapper getMapper() {
        return klUserMapper;
    }
}
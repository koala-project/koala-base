package com.koala.base.logics.member;

import com.koala.base.entities.member.KlGroup;
import com.koala.base.logics.common.AbstractCommonLogicImpl;
import com.koala.base.repositories.member.KlGroupMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class KlGroupLogicImpl extends AbstractCommonLogicImpl<KlGroupMapper, KlGroup, Long> implements KlGroupLogic {
    
	@Resource
    KlGroupMapper klGroupMapper;

    protected KlGroupMapper getMapper() {
        return klGroupMapper;
    }
}
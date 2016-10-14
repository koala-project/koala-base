package com.koala.base.logics.member;

import com.koala.base.entities.member.RelUserRole;
import com.koala.base.entities.member.SysUser;
import com.koala.base.logics.common.CommonLogic;

import java.util.List;

public interface SysUserLogic extends CommonLogic<SysUser, Long> {

    SysUser selectUserRole(Long id);

    int saveRelUserRole(RelUserRole userRole);

}

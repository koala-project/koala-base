package com.koala.base.repositories.member;

import com.koala.base.entities.member.RelUserRole;
import com.koala.base.entities.member.SysUser;
import com.koala.base.repositories.common.Mapper;

import java.util.List;

public interface SysUserMapper extends Mapper<SysUser, Long> {

    SysUser selectUserRole(Long id);

    int saveRelUserRole(RelUserRole userRole);
}

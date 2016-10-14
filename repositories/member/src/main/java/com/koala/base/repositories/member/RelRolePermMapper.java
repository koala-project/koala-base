package com.koala.base.repositories.member;

import com.koala.base.entities.member.RelRolePerm;
import com.koala.base.entities.member.RelRolePermCriteria;
import java.util.List;

import com.koala.base.repositories.common.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RelRolePermMapper extends Mapper {
    int countByExample(RelRolePermCriteria example);

    int deleteByExample(RelRolePermCriteria example);

    int insert(RelRolePerm record);

    int insertSelective(RelRolePerm record);

    List<RelRolePerm> selectByExampleWithRowbounds(RelRolePermCriteria example, RowBounds rowBounds);

    List<RelRolePerm> selectByExample(RelRolePermCriteria example);

    int updateByExample(@Param("record") RelRolePerm record, @Param("example") RelRolePermCriteria example);
}

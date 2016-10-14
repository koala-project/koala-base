package com.koala.base.repositories.member;

import com.koala.base.entities.member.RelUserRole;
import com.koala.base.entities.member.RelUserRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RelUserRoleMapper {
    int countByExample(RelUserRoleCriteria example);

    int deleteByExample(RelUserRoleCriteria example);

    int insert(RelUserRole record);

    int insertSelective(RelUserRole record);

    List<RelUserRole> selectByExampleWithRowbounds(RelUserRoleCriteria example, RowBounds rowBounds);

    List<RelUserRole> selectByExample(RelUserRoleCriteria example);

    int updateByExample(@Param("record") RelUserRole record, @Param("example") RelUserRoleCriteria example);
}
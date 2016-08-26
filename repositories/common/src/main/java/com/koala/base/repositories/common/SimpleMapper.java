package com.koala.base.repositories.common;

import com.koala.base.entities.common.BaseCriteria;
import com.koala.base.entities.common.SimpleDataEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.List;

/**
 * Created by truck on 2016/1/7.
 */
public interface SimpleMapper<T extends SimpleDataEntity<PK>,PK extends Serializable> {
    int countByExample(BaseCriteria criteria);

    int deleteByExample(BaseCriteria criteria);

    int deleteByPrimaryKey(PK id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExampleWithRowbounds(BaseCriteria criteria, RowBounds rowBounds);

    List<T> selectByExample(BaseCriteria criteria);

    <T extends SimpleDataEntity<PK>> T selectByPrimaryKey(PK id);

    List<T> selectByExampleWithBLOBs(BaseCriteria criteria, RowBounds rowBounds);

    List<T> selectByExampleWithBLOBs(BaseCriteria criteria);

    int updateByExampleSelective(@Param("record") T record, @Param("example") BaseCriteria criteria);

    int updateByExample(@Param("record") T record, @Param("example") BaseCriteria criteria);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}

package com.koala.base.logics.common;

import com.koala.base.entities.common.BaseCriteria;
import com.koala.base.entities.common.SimpleDataEntity;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.List;

/**
 * Created by truck on 2016/1/7.
 */
public interface SimpleCommonLogic<T extends SimpleDataEntity<PK>,PK extends Serializable>  {
    int insert(T entity);

    int insertSelective(T entity);

    int count(BaseCriteria criteria);

    int deleteAll(BaseCriteria example);

    int delete(PK id);

    List<T> list(BaseCriteria criteria);

    List<T> list(BaseCriteria criteria, RowBounds rowBounds);

    List<T> listWithBLOBs(BaseCriteria criteria);

    List<T> listWithBLOBs(BaseCriteria criteria, RowBounds rowBounds);

    T get(PK id);

    int updateSelective(T entity);

    int update(T entity);
}

package com.koala.base.logics.common;

import com.koala.base.entities.common.BaseCriteria;
import com.koala.base.entities.common.SimpleDataEntity;
import com.koala.base.repositories.common.SimpleMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by truck on 2016/1/7.
 */
public abstract class SimpleAbstractCommonLogicImpl<D extends SimpleMapper, T extends SimpleDataEntity<PK>, PK extends Serializable> implements SimpleCommonLogic<T, PK>  {
    protected abstract D getMapper();

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int insert(T entity) {
        return getMapper().insert(entity);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int insertSelective(T entity) {
        return getMapper().insertSelective(entity);
    }

    @Override
    public int count(BaseCriteria criteria) {
        return getMapper().countByExample(criteria);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int deleteAll(BaseCriteria example) {
        List<T> entities = getMapper().selectByExample(example);
        int result = 0;
        for (T entity : entities) {
            result += getMapper().updateByPrimaryKeySelective(entity);
        }
        return result;
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int delete(PK id) {
        SimpleDataEntity entity = getMapper().selectByPrimaryKey(id);
        if (entity == null) return 0;
        BaseCriteria criteria = new BaseCriteria();
        criteria.createBaseCriteria().andIdEqualTo(id);
        return getMapper().updateByExampleSelective(entity, criteria);
    }

    @Override
    public List<T> list(BaseCriteria criteria) {
        return getMapper().selectByExample(criteria);
    }

    @Override
    public List<T> list(BaseCriteria criteria, RowBounds rowBounds) {
        return getMapper().selectByExampleWithRowbounds(criteria, rowBounds);
    }

    @Override
    public List<T> listWithBLOBs(BaseCriteria criteria) {
        return getMapper().selectByExampleWithBLOBs(criteria);
    }

    @Override
    public List<T> listWithBLOBs(BaseCriteria criteria, RowBounds rowBounds) {
        return getMapper().selectByExampleWithBLOBs(criteria, rowBounds);
    }

    @Override
    public T get(PK id) {
        return (T) getMapper().selectByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int updateSelective(T entity) {
        BaseCriteria criteria = new BaseCriteria();
        criteria.createBaseCriteria().andIdEqualTo(entity.getId());
        return getMapper().updateByExampleSelective(entity, criteria);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int update(T entity) {
        BaseCriteria criteria = new BaseCriteria();
        criteria.createBaseCriteria().andIdEqualTo(entity.getId());
        return getMapper().updateByExample(entity, criteria);
    }
}

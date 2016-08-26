package com.koala.base.logics.common;


import com.koala.base.entities.common.BaseCriteria;
import com.koala.base.entities.common.DataEntity;
import com.koala.base.repositories.common.Mapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional(readOnly = true)
public abstract class AbstractCommonLogicImpl<D extends Mapper, T extends DataEntity<PK>, PK extends Serializable> implements CommonLogic<T, PK> {

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
            entity.setIsDelete(DataEntity.DELETE);
            entity.setVersion(entity.getVersion() + 1);
            result += getMapper().updateByPrimaryKeySelective(entity);
        }
        return result;
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int delete(PK id) {
        DataEntity entity = getMapper().selectByPrimaryKey(id);
        if (entity == null) return 0;
        BaseCriteria criteria = new BaseCriteria();
        criteria.createBaseCriteria().andIdEqualTo(id).andVersionLessThan(entity.getVersion() + 1);

        entity.setIsDelete(T.DELETE);
        entity.setVersion(entity.getVersion() + 1);

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
        criteria.createBaseCriteria().andIdEqualTo(entity.getId()).andVersionLessThan(entity.getVersion() + 1);
        return getMapper().updateByExampleSelective(entity, criteria);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int update(T entity) {
        BaseCriteria criteria = new BaseCriteria();
        criteria.createBaseCriteria().andIdEqualTo(entity.getId()).andVersionLessThan(entity.getVersion() + 1);
        return getMapper().updateByExample(entity, criteria);
    }
}

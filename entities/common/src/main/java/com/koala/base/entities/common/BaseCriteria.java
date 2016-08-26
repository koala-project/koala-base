package com.koala.base.entities.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public  class BaseCriteria<PK extends Serializable> {

    protected String orderByClause;

    protected boolean distinct;

    protected List<InternelCriteria> oredCriteria;

    public BaseCriteria() {
        oredCriteria = new ArrayList<InternelCriteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<InternelCriteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(InternelCriteria criteria) {
        oredCriteria.add(criteria);
    }

    public InternelCriteria baseOr() {
        InternelCriteria criteria = createBaseCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public InternelCriteria createBaseCriteria() {
        InternelCriteria criteria = createBaseCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected InternelCriteria createBaseCriteriaInternal() {
        InternelCriteria criteria = new InternelCriteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected static class BaseGeneratedCriteria<PK>{
        protected List<Criterion> criteria;

        protected BaseGeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public InternelCriteria andIdIsNull() {
            addCriterion("id is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdEqualTo(PK value) {
            addCriterion("id =", value, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdNotEqualTo(PK value) {
            addCriterion("id <>", value, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdGreaterThan(PK value) {
            addCriterion("id >", value, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdGreaterThanOrEqualTo(PK value) {
            addCriterion("id >=", value, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdLessThan(PK value) {
            addCriterion("id <", value, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdLessThanOrEqualTo(PK value) {
            addCriterion("id <=", value, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdIn(List<PK> values) {
            addCriterion("id in", values, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdNotIn(List<PK> values) {
            addCriterion("id not in", values, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdBetween(PK value1, PK value2) {
            addCriterion("id between", value1, value2, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIdNotBetween(PK value1, PK value2) {
            addCriterion("id not between", value1, value2, "id");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortIsNull() {
            addCriterion("sort is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusIsNull() {
            addCriterion("status is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierEqualTo(Integer value) {
            addCriterion("modifier =", value, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierNotEqualTo(Integer value) {
            addCriterion("modifier <>", value, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierGreaterThan(Integer value) {
            addCriterion("modifier >", value, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifier >=", value, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierLessThan(Integer value) {
            addCriterion("modifier <", value, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierLessThanOrEqualTo(Integer value) {
            addCriterion("modifier <=", value, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierIn(List<Integer> values) {
            addCriterion("modifier in", values, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierNotIn(List<Integer> values) {
            addCriterion("modifier not in", values, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierBetween(Integer value1, Integer value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifierNotBetween(Integer value1, Integer value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionIsNull() {
            addCriterion("version is null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (InternelCriteria) this;
        }

        public InternelCriteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (InternelCriteria) this;
        }
    }

    public static class InternelCriteria extends BaseGeneratedCriteria {

        public InternelCriteria() {
            super();
        }
    }


}

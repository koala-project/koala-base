package com.koala.base.entities.common;

import java.util.Date;


public class DataEntity<PK> extends IdEntity<PK> {

    /**已删除*/
    public final static Integer DELETE = 1;
    /**未删除*/
    public final static Integer NORMAL = 0;

    protected Integer sort;
    protected Integer status;
    protected Integer isDelete;
    protected Integer version;
    protected Integer creator;
    protected Integer modifier;
    protected Date createTime;
    protected Date modifyTime;

    public DataEntity(){
        this.isDelete = NORMAL;
        this.status = NORMAL;
    }

    public DataEntity(PK id){
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}

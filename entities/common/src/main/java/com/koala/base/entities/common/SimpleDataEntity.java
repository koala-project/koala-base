package com.koala.base.entities.common;


public class SimpleDataEntity<PK> extends IdEntity<PK> {

    /**已删除*/
    public final static Integer DELETE = 0;
    /**未删除*/
    public final static Integer NORMAL = 1;

    /**
     * 创建人
     *//*
    protected String createdBy;
    *//**
     * 修改人
     *//*
    protected String modifiedBy;
    *//**
     * 创建时间
     *//*
    protected Date createdTime;
    *//**
     * 修改时间
     *//*
    protected Date modifiedTime;
    *//**
     * 是否有效
     *//*
    protected Integer isValid;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }*/
}

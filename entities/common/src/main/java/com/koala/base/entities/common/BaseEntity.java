package com.koala.base.entities.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {

    protected int offset = 0;
    protected int limit = Integer.MAX_VALUE;

    @JsonIgnore
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @JsonIgnore
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

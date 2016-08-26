package com.koala.base.entities.common;

import java.io.Serializable;

public class IdEntity<PK> extends BaseEntity implements Serializable{

    protected PK id;

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }
}

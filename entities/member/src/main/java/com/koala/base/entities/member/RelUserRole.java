package com.koala.base.entities.member;

import java.io.Serializable;

public class RelUserRole implements Serializable {
    private SysUser user;

    private SysRole role;

    private static final long serialVersionUID = 1L;

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }
}

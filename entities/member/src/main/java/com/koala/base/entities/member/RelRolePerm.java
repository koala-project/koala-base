package com.koala.base.entities.member;

import java.io.Serializable;

public class RelRolePerm implements Serializable {
    private SysRole role;

    private SysPerm perm;

    private static final long serialVersionUID = 1L;

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }

    public SysPerm getPerm() {
        return perm;
    }

    public void setPerm(SysPerm perm) {
        this.perm = perm;
    }
}

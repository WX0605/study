package com.torres.study.access_authority;

import com.torres.study.access_authority.other_package.C;

public abstract class B extends C {
    private String private_b;
    String defaule_b;
    public String public_b;
    protected String protected_b;

    public String getPrivate_b() {
        return private_b;
    }

    public void setPrivate_b(String private_b) {
        this.private_b = private_b;
    }

    public String getDefaule_b() {
        return defaule_b;
    }

    public void setDefaule_b(String defaule_b) {
        this.defaule_b = defaule_b;
    }

    public String getPublic_b() {
        return public_b;
    }

    public void setPublic_b(String public_b) {
        this.public_b = public_b;
    }

    public String getProtected_b() {
        return protected_b;
    }

    public void setProtected_b(String protected_b) {
        this.protected_b = protected_b;
    }
}

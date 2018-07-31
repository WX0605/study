package com.torres.study.access_authority.other_package;

public abstract class C {
    private String private_c;
    String defaule_c;
    public String public_c;
    protected String protected_c;

    public String getPrivate_c() {
        return private_c;
    }

    public void setPrivate_c(String private_c) {
        this.private_c = private_c;
    }

    public String getDefaule_c() {
        return defaule_c;
    }

    public void setDefaule_c(String defaule_c) {
        this.defaule_c = defaule_c;
    }

    public String getPublic_c() {
        return public_c;
    }

    public void setPublic_c(String public_c) {
        this.public_c = public_c;
    }

    public String getProtected_c() {
        return protected_c;
    }

    public void setProtected_c(String protected_c) {
        this.protected_c = protected_c;
    }
}

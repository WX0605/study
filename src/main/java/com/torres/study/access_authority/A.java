package com.torres.study.access_authority;

import com.torres.study.access_authority.other_package.E;

/**
 *java 访问权限
 */
public  class A extends B{
    private String private_a;
    String defaule_a;
    public String public_a;
    protected String protected_a;

    public String getPrivate_a() {
        return private_a;
    }

    public void setPrivate_a(String private_a) {
        this.private_a = private_a;
    }

    public String getDefaule_a() {
        return defaule_a;
    }

    public void setDefaule_a(String defaule_a) {
        this.defaule_a = defaule_a;
    }

    public String getPublic_a() {
        return public_a;
    }

    public void setPublic_a(String public_a) {
        this.public_a = public_a;
    }

    public String getProtected_a() {
        return protected_a;
    }

    public void setProtected_a(String protected_a) {
        this.protected_a = protected_a;
    }

    public static void main(String[] args) {
        A a = new A();
        //类内
        a.private_a=null;
        a.defaule_a=null;
        a.protected_a=null;
        a.public_a =null;


        //同包 子类
        //this.private_b
        a.defaule_b=null;
        a.protected_b=null;
        a.public_b=null;

        //同包非子类
        D d = new D();
        //d.private_d
        d.defaule_d=null;
        d.protected_d=null;
        d.public_d =null;


        //不同包 子类
        //this.private_c
        //this.defaule_c
        a.protected_c=null;
        a.public_c=null;

        //不同包 非子类
        E e = new E();
        //e.private_e=null;
        //e.defaule_e=null;
        //e.protected_e=null;
        e.public_e=null;
    }

}

package com.torres.study.multi_Extends.example1;

public interface Example1A {
    default String say(String name) {
        return "hello " + name;
    }

    //静态方法
    static String hello(String name){
        return "hello";
    }

}

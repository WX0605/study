package com.torres.study.multi_Extends.example1;

public interface Example1B {
    default String say(String name) {
        return "hi " + name;
    }
}

package com.torres.study.multiExtends.example1;

public interface Example1A {
    default String say(String name) {
        return "hello " + name;
    }
}

package com.torres.study.multiExtends.example1;

public interface Example1B {
    default String say(String name) {
        return "hi " + name;
    }
}

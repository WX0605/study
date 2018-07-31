package com.torres.study.multiExtends.example3;

public interface Example3A {
    default void say(int a) {
        System.out.println("A");
    }
}

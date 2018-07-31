package com.torres.study.multiExtends.example3;

public interface Example3B {
    default void say(short a) {
        System.out.println("B");
    }
}

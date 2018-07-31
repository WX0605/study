package com.torres.study.multi_Extends.example4;

public interface Example4A {
    default void hello() {
        System.out.println("from A");
    }
}

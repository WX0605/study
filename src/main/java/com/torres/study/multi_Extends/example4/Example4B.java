package com.torres.study.multi_Extends.example4;

public interface Example4B extends Example4A{
    default void hello() {
        System.out.println("from B");
    }
}

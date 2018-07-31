package com.torres.study.multi_Extends.example4;

public class Example4C implements Example4A, Example4B {
    public static void main(String[] args) {
        new Example4C().hello();//打印B
    }
}

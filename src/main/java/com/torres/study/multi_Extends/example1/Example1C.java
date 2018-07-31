package com.torres.study.multi_Extends.example1;

/**
 * 如果继承的接口中方法签名一致，则子类中必须重写该方法
 * 方法签名：方法名+参数（不包括返回类型）
 */
public interface Example1C extends Example1A,Example1B {
    @Override
    default String say(String name) {
        return null;
    }
}

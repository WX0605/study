package com.torres.study.multi_Extends.example1;

/**
 * jdk1.8  接口的默认实现方法，和静态方法使用
 * 如果继承的接口中方法签名一致，则子类中必须重写该方法
 * 方法签名：方法名+参数（不包括返回类型）
 *
 * 三条原则:
 *
 * 1.类中的方法优先级最高
 *
 * 2.如果无法一句第一条进行判断,那么子接口的优先级更高:函数签名相同时,优先选择拥有最具体实现的默认方法的接口,即如果B继承了A,那么B就比A更加具体
 *
 * 3.最后,如果还是无法判断,继承了多个接口的类必须通过显示覆盖和调用期望的方法,显示地选择使用哪一个默认方法的实现
 */
public interface Example1C extends Example1A,Example1B {
    @Override
    default String say(String name) {
        return null;
    }
}

package com.torres.study.multi_Extends.example3;


/**
 * 实现类继承接口，父类接口中存在默认实现的，子类可以隐式继承
 * 否则，子类需要必须实现子类。
 */
public class Example3D implements Example3C,Example3E{

    @Override
    public void hello() {
        System.out.println(" from Example3E");
    }
}

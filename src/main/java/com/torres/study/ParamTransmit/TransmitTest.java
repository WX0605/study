package com.torres.study.ParamTransmit;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/8/21
 *
 * 值传递   是传递基础类型的一个copy
 * 引用传递 是传递引用的地址
 * final 修饰参数的作用：防止引用类型被重新 赋给新的引用地址（重新new）
 */
public class TransmitTest {
    public static void main(String[] args) {
        ParamBean paramBean = new ParamBean();
        paramBean.setId(1);
        paramBean.setName("torres");
        paramBean.setAge(20);

        int param = 0;
        //引用传递
        updateParambean(paramBean);

        System.out.println(paramBean.toString());

        //值传递
        updateParambean(param);

        System.out.println("值传递之后："+param);

    }

    private static void updateParambean(final ParamBean paramBean){
        paramBean.setId(2);
        paramBean.setName("qingbaoyuan");
         paramBean.setAge(25);
    }


    private static void updateParambean(int param){
        System.out.println("值传递参数，运算操作前："+param);
        param=99+param;
        System.out.println("值传递参数，运算操作后："+param);

    }

}

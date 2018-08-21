package com.torres.study.TestContinue;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/8/14
 */
public class Main {

    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            if (i==2){
                //继续改循环，之后逻辑的不执行
                continue;
                //终端循环，之后逻辑不执行
                //break;
            }
            System.out.println("i="+i);


        }
    }


}

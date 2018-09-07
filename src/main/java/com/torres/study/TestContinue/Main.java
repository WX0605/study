package com.torres.study.TestContinue;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/8/14
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("07a696ef4af442d4b026512acc056da6".equals("07a696ef4af442d4b026512acc056da6"));


        test();

        try {
            testThrowCase();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testThrowCase() throws Exception {

        if(true){
           throw new Exception("数组越界");
        }

        System.out.println("异常后");
    }


    private static boolean test(){
        for (int i=0;i<10;i++){
            if (i==2){
                //继续改循环，之后逻辑的不执行
                continue;
                //终端循环，之后逻辑不执行
                //break;
            }

            if (i==3){
                return true;
            }
            System.out.println("i="+i);

        }
        return false;
    }



}

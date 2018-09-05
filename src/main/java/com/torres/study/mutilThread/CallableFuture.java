package com.torres.study.mutilThread;

import javafx.concurrent.Task;

import java.util.concurrent.*;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/9/4
 */
public class CallableFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        MyTask task = new MyTask();
        Future<Integer> result = executor.submit(task);
        executor.shutdown();
        //executor.shutdownNow();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try {
            System.out.println("task运行结果" + result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }
}




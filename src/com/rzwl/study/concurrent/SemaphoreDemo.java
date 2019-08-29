package com.rzwl.study.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author : championjing
 * @ClassName: SemaphoreDemo
 * @Description: 旨在控制并发数
 * @Date: 8/29/2019 10:02 AM
 */
public class SemaphoreDemo {


    public static void main(String[] args) {
        //定义信号量个数
        final Semaphore semaphore = new Semaphore(2);
        ExecutorService executor = Executors.newCachedThreadPool() ;
        //模拟20个人买票
        for (int i=0; i<20 ;i++) {
            executor.execute( new MyRunnable(semaphore,i+1) );
        }
        executor.shutdown();
    }
}

class MyRunnable implements Runnable{
    private Semaphore semaphore; //信号
    private int user; //第几个用户

    public MyRunnable(Semaphore semaphore,int user){
        this.semaphore = semaphore;
        this.user = user;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire(); //获取信号量许可
            System.out.println("用户："+user +"进入窗口");
            Thread.sleep((long) Math.random() * 1000);
            System.out.println("用户:"+user+"购买完成");
            Thread.sleep((long) Math.random() * 1000);
            System.out.println("用户:"+user+"离开");
            //释放许可
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

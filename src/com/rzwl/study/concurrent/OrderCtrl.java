package com.rzwl.study.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author : championjing
 * @ClassName: OrderCtrl
 * @Description:
 * @Date: 9/5/2019 11:40 AM
 */
public class OrderCtrl {
    public static void main(String[] args) {
        // r4 -> r3 -> r2 -> r1
        Runnable r4= ()->{
            System.out.println("in r4");
            System.out.println("----- r   4");
        };
        Thread t4 = new Thread( r4 );
        
        Runnable r3= ()->{
            System.out.println("in r3");
            try {
                t4.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---- r  3");
        };
        Thread t3 = new Thread( r3 );
        
        Runnable r2= ()->{
            System.out.println("in r2");
            try {
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---- r 2");
        };
        Thread t2 = new Thread( r2 );
        
        Runnable r1= ()->{
            System.out.println("in r1");
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---- r1");
        };
        Thread t1 = new Thread( r1 );
        //ExecutorService executor = Executors.newCachedThreadPool();
        //executor.execute( t4 );
        //executor.execute( t3 );
        //executor.execute( t2 );
        //executor.execute( t1 );
        t2.start();
        t4.start();
        t3.start();
        t1.start();
        System.out.println("添加结束");
    }
}

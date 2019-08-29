package com.rzwl.study.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : championjing
 * @ClassName: CyclicBarrierTest
 * @Description: 可循环的同步屏障
 * @Date: 8/29/2019 11:10 AM
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3);
        ExecutorService threadPool = Executors.newCachedThreadPool();
        
        for (int i=0;i<3; i++){
            final int userN = i+1;
            System.out.println("生成用户:"+userN);
            Runnable runnable = ()->{
                try {
                    //模拟每个人来的时间各不相同
                    Thread.sleep((long) Math.random() * 1000);
                    System.out.println( userN + "到达地点" +"当前等待认数:"+cb.getNumberWaiting() );
                    cb.await(); //阻塞点
                    System.out.println( "人员全部到达，开始吃饭,总人数:" + cb.getNumberWaiting() );
                    Thread.sleep((long) Math.random() * 1000);
                    System.out.println("吃完饭回家");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            };
            threadPool.execute( runnable );
        }
        threadPool.shutdown();
    }
}

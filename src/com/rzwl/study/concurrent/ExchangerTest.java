package com.rzwl.study.concurrent;

import java.util.concurrent.*;

/**
 * @author : championjing
 * @ClassName: ExchangerTest
 * @Description:
 * @Date: 8/29/2019 11:41 AM
 */
public class ExchangerTest {
    
    public static void main(String[] args) {
        //交换器
        Exchanger<String> exchanger = new Exchanger<>();
        ExecutorService threadPool = Executors.newCachedThreadPool();
        threadPool.execute( ()->{
            try {
                //把大桥交换
                String s = exchanger.exchange("大桥");
                System.out.println("张三用大桥交换回:"+s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } );
        
        threadPool.execute( ()->{
            try {
                //把钱交出去
                String s = exchanger.exchange("1000 万");
                System.out.println("大桥家属使用1000 W:"+s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } );
        
        threadPool.shutdown();
    }
}

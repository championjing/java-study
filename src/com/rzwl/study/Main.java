package com.rzwl.study;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author : championjing
 * @ClassName: Main
 * @Description:
 * @Date: 7/30/2019 6:32 PM
 */
public class Main {
    
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //double n1 = 3.5;
        //BigDecimal b = new BigDecimal("3.5");
        //BigDecimal b2 = new BigDecimal("2.87");
        //double n2 = 2.87;
        //System.out.println( b.subtract(b2));
        //HashMap map = new HashMap();
        Map<String,Object> map = new HashMap<>();
        map.put("num",123);
        Integer num = (Integer) map.get("num");
        if (num != 1 ) {
            System.out.println("NO");
        }
        Callable cc = ()->{
            int n = (int) (Math.random()*10);
            return n;
        };
        LinkedBlockingQueue queue = new LinkedBlockingQueue();
        ExecutorService executor = new ThreadPoolExecutor(1,1,10L,TimeUnit.SECONDS,queue);
        Future future = executor.submit(cc);
        System.out.println((Integer) future.get());
        String str = new String("1");
        str.intern();
        
    }
}

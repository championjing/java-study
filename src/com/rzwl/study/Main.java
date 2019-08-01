package com.rzwl.study;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * @author : championjing
 * @ClassName: Main
 * @Description:
 * @Date: 7/30/2019 6:32 PM
 */
public class Main {
    
    public static void main(String[] args) {
        double n1 = 3.5;
        BigDecimal b = new BigDecimal("3.5");
        BigDecimal b2 = new BigDecimal("2.87");
        double n2 = 2.87;
        System.out.println( b.subtract(b2));
        HashMap map = new HashMap();
    }
}

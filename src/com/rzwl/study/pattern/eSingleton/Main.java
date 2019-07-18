package com.rzwl.study.pattern.eSingleton;

/**
 * @author : championjing
 * @ClassName: Main
 * @Description:
 * @Date: 7/18/2019 3:20 PM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start. ");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if( obj1 == obj2 ) {
            System.out.println("obj1与 obj2是相同的实例");
        } else {
            System.out.println("obj1与 obj2是不同的实例");
        }
        System.out.println("End.");
    }
}

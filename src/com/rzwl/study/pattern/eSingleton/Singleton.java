package com.rzwl.study.pattern.eSingleton;

/**
 * @author : championjing
 * @ClassName: Singleton
 * @Description:
 * @Date: 7/18/2019 3:19 PM
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}

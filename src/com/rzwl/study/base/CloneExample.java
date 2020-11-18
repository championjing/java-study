package com.rzwl.study.base;

/**
 * @author : championjing
 * @version V1.0
 * @Description:
 * @date Date : 2020年11月18日 9:17
 */
public class CloneExample implements Cloneable {
    private int a;
    private int b;

    @Override
    protected CloneExample clone() throws CloneNotSupportedException {

        return (CloneExample) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneExample e1 = new CloneExample();
        e1.a = 10;
        CloneExample e2 = e1.clone();
        System.out.println( e1 );
        System.out.println( e1.a );
        System.out.println( e2 );
        System.out.println( e2.a );
    }
}

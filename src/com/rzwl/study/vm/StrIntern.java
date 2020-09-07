package com.rzwl.study.vm;

/**
 * @author : champion
 * @version V1.0
 * @Description:
 * @date Date : 2020年09月07日 14:33
 */
public class StrIntern {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("编程").toString();
        System.out.println( str1.intern() == str1 );
        //1 true
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println( str2.intern() == str2 );
        //2 false
        String str3 = "java";
        System.out.println( str3.intern() == str3 );
        //3 true
        String str4 = new String("java");
        System.out.println( str4 == str2 );
        //4 false
        System.out.println( str4.intern() == str3 );
        //5 true
    }
}

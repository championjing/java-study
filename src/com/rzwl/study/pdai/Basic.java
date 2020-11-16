package com.rzwl.study.pdai;

import org.junit.Test;

/**
 * @author : championjing
 * @version V1.0
 * @Description: 对该文章中Java基础中的知识点进行实验
 * @date Date : 2020年11月07日 15:03
 */
public class Basic {

    @Test
    public void testString(){
        //引用静态区的字符串字面量
        String str = "hello";
        //引用堆上的字符串对象
        String str2 = new String("hello");
        System.out.println( str == str2 );
        str.length();
        /*
        连接两个字符串。那么与+有什么区别呢，
        concat 只能连接字符串，步骤如下
        1. 把调用对象的值首先复制到总长的字符数组中char buf[]=Arrays.copyOf(value, len + otherLen);
        2. 把参数对象放入到buf， str.getChars(buf, len);
        3. 使用这个buf创建新的String， new String(buf, true)

        而+，则可以把很多类型都连接起来
         */
        String concat = str.concat("123");
        System.out.println(str);
        System.out.println(concat);
    }
//    http://eachieve.ctrdc.com/login/loginByEmail?email=(加密后的邮箱)

    class InnerClass{
        InnerClass() {
            System.out.println("-------内部类");
        }
    }
    static class InnerClass2{
        InnerClass2(){
            System.out.println("-------静态内部类");
        }
    }

    public static void main(String[] args) {
        Basic basic = new Basic();
        //普通内部类,使用只能通过外部类的对象去创建
        InnerClass innerClass = basic.new InnerClass();
        //静态内部类，可以直接使用
        InnerClass2 ic2 = new Basic.InnerClass2();
    }
}

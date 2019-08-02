package com.rzwl.study.java8.lambda;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * @author : championjing
 * @ClassName: TestMethodRef
 * @Description:
 *  方法引用：若Lambda体中的内容有方法已经实现了，我们可以使用“方法引用” 
 *      (可以理解为方法引用是Lambda表达式的另外一种表达形式)
 *  主要有三种语法格式
 *  对象::实例方法名 参数列表与返回值类型要保持一致
 *  类::静态方法名
 *  类::实例方法名
 * @Date: 8/2/2019 11:31 AM
 */
public class TestMethodRef {

    //类::实例方法名
    @Test
    public void test4(){
        BiPredicate<String,String> bp = (x,y)->x.equals(y);
        BiPredicate<String,String> bp1 = String::equals;
    }
    
    //类::静态方法名
    @Test
    public void test2(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        Comparator<Integer> com1 = Integer::compare;
    }
    
    //对象::实例方法名
    @Test
    public void test1(){
        Consumer<String> con = x-> System.out.println(x);
        con.accept("aaa");
        PrintStream ps = System.out;
        Consumer<String> con1 = ps::println;
        con1.accept( "abc" );
    }
}

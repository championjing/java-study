package com.rzwl.study.java8.lambda;

import com.rzwl.study.entity.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author : championjing
 * @ClassName: TestMethodRef
 * @Description:
 *  一、方法引用：若Lambda体中的内容有方法已经实现了，我们可以使用“方法引用” 
 *      (可以理解为方法引用是Lambda表达式的另外一种表达形式)
 *  主要有三种语法格式
 *  对象::实例方法名 参数列表与返回值类型要保持一致
 *  类::静态方法名
 *  类::实例方法名
 *  Tips:
 *      1. Lambda体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的函数列表和返回值类型保持一致！
 *      2. 若Lambda参数列表中的第一参数是实例方法的调用者，而第二个参数是实例方法的参数时，可以使用ClassName::method
 *      
 *   二、构造器引用
 *      格式：ClassName::constructor
 *   Tips:
 *      需要调用的构造器参数列表要与函数式接口中抽象方法的参数列表保持一致
 *   三： 数组引用
 *      Type::new
 * @Date: 8/2/2019 11:31 AM
 */
public class TestMethodRef {
    
    //数组引用
    @Test
    public void test7(){
        Function<Integer,String[]> fun = (x) -> new String[x];
        String[] strs = fun.apply(2);
        System.out.println(strs.length);

        Function<Integer,String[]> fun2 = String[]::new;
        String[] strings = fun2.apply(20);
        System.out.println( strings.length );
    }
    
    //构造器引用2
    @Test
    public void test6(){
        Function<Integer,Employee> fun = (x) -> new Employee(x);
        Employee employee1 = fun.apply(26);
        System.out.println(employee1);

        Function<Integer,Employee> fun2 = Employee::new;
        Employee employee = fun2.apply(20);
        System.out.println( employee );
    }
    
    //构造器引用
    @Test
    public void test5(){
        Supplier<Employee> sup = ()->new Employee();
        sup.get();
        //新方式
        Supplier<Employee> sup2 = Employee::new;
        Employee employee = sup2.get();
        System.out.println( employee );
    }
    
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

package com.rzwl.study.java8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author : championjing
 * @ClassName: Main 
 * @Description:
 * 语法：Java8中引入新的操作符“->” 称为箭头操作符或者Lambda操作符
 * 操作符分为两部分，左侧和右侧
 * 左侧：Lambda表达式的参数列表，对应interface中抽象方法的参数列表
 * 右侧：Lambda表达式中所需执行的功能，即Lambda体，对应interface中抽象方法的方法体
 * 
 * 只有一个抽象方法的接口，称为函数式接口
 * 
 * 语法格式 1：无参，无返回值
 *          () -> System.out.println("Hello Lambda")
 * 语法格式 2：有一个参数，并且无返回值， 如果只有一个参数，左侧小括号可以省略
 * 
 * 语法格式 3：有两个以上参数，并且Lambda体中有多条语句,右侧需要使用大括号
 * 语法格式 4：如果有返回值，且右侧只有一条语句，那么大括号和关键字“return”都可省略
 * 语法格式 5：Lambda表达式的参数列表的数据类型可以省略不屑，因为JVM编译器通过上下文推断出数据类型，即“类型推断”
 * 
 * 原则：
 * 上联：左右遇一括号者
 * 下联：左侧推断类型者
 * 横批：能省则省
 * 
 * 二、 Lambda表达式需要“函数式接口”的支持
 *  定义：接口中只有一个抽象方法的接口，称为函数式接口，可以使用注解@FunctionalInterface 修饰后可以检查该接口是否时函数式接口
 * @Date: 7/23/2019 10:14 AM
 */
public class Main {
    public static void main(String[] args) {
        GreetingService greetingService = (String str) -> {
            str = str+" hello";
            System.out.println(str);
        };
        greetingService.say("one");
    }
    
    interface GreetingService{
        default void top(){
            System.out.println("start");
        }
        void say(String message);
    }
    
    @Test
    public void test(){
        int num = 0; 
        // jdk1.7前，如果想在匿名内部类中使用同级别变量，
        // 那么该变量必须为final，1.8后不必显式声明final，但是不能进行操作，底层同样是final
        
        //演示无参无返回值情况
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello old world"+num);
            }
        };
        r.run();
        System.out.println("--------------");
        Runnable r1 = () -> System.out.println("Hello new Lambda");
        r1.run();
    }
    
    @Test
    public void test2(){
        
    }
    @Test
    public void test3(){
        Comparator comparator = (x,y) -> {
            System.out.println("函数式接口");
            return 0;
        };
        int compare = comparator.compare(1, 2);
        System.out.println(compare);
    }
    @Test
    public void test5(){
        Comparator<Integer> comparator = (Integer x,Integer y) -> {
            System.out.println("函数式接口");
            return 0;
        };
        int compare = comparator.compare(1, 2);
        System.out.println(compare);
    }
    @Test
    public void test6(){
        //类型推断常见场景
        String[] strs = {"a","b"}; //可行
        //String[] strs1;
        //strs1 = {"a","b"}; //不可行
        //jdk1.7后集合类型可写成下面形式,后面省略了类型
        List<String> list = new ArrayList<>();
    }
    
}

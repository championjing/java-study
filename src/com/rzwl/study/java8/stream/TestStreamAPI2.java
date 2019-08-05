package com.rzwl.study.java8.stream;

import com.rzwl.study.entity.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : championjing
 * @ClassName: TestStreamAPI1
 * @Description:
 * 一、Stream的三个操作步骤：
 *  1. 创建Stream
 *  2. 中间操作
 *  3. 终止操作（终端操作）
 * 
 * @Date: 8/5/2019 12:17 PM
 */
public class TestStreamAPI2 {
    List<Employee> employees = Arrays.asList(
            new Employee("张三",18,999),
            new Employee("李四",58,555),
            new Employee("王五",26,333),
            new Employee("赵六",36,666),
            new Employee("田七",12,888)
    );
    //中间操作 
    /*
    筛选与切片
    filter - 接收Lambda, 从流中排除某些元素。
    limit - 截断流，使其元素不超过给定数量
    skip(n) - 跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit(n)互补
    distinct - 筛选，通过流所生成元素的hashCode() 和 equals()去除重复元素
     */
    @Test
    public void test1(){
        //中间操作不会执行任何操作
        Stream<Employee> stream = employees.stream().filter(e -> {
            System.out.println("中间操作");
            return e.getAge() > 35;
        });
        //终止操作：一次性执行全部内容，即“惰性求值”
        stream.forEach( System.out::println );
    }
    
    @Test
    public void test3(){
        employees.stream().filter(e -> {
            System.out.println("测试短路");
            return e.getAge() > 35;
        }).limit(2);
        
    }

    /**
     * 映射
     * map - 接收Lambda，将元素转换成其他形式或提取信息，接收一个函数作为参数，该函数回呗应用到没个元素上，
     *  并将其映射成一个flatMap - 接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
     */
    @Test
    public void test5(){
        List<String> list = Arrays.asList(  "aa","bb","cc" ,"ddd","eee" );
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        System.out.println("-------------");
        employees.stream().map(Employee::getName).forEach( System.out::println );
    }
}

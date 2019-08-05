package com.rzwl.study.java8.stream;

import com.rzwl.study.entity.Employee;
import org.junit.Test;

import java.sql.SQLOutput;
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
public class TestStreamAPI1 {
    //创建Stream
    @Test
    public void test1(){
        // 1. 可以通过Collection 系列集合提供的stream()或parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        // 2. 通过Arrays中的静态方法stream()获取数组流
        Employee[] employees = new Employee[0];
        Stream<Employee> stream2 = Arrays.stream(employees);
        // 3. 通过Stream类中的静态方法of()
        Stream<String> stream3 = Stream.of( "aa","bb","cc" );
        // 4.1 创建无限流 迭代
        Stream<Integer> stream4 = Stream.iterate( 0, x->x+2 );
        stream4.limit(10).forEach(System.out::println);
        // 4.2 生成
        Stream.generate( ()->Math.random() ).limit(10).forEach( System.out::println );
    }
}

package com.rzwl.study.java8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author : championjing
 * @ClassName: LambdaFuncs
 * @Description: 
 * Java8内置四大内置函数式接口
 * 一： Consumer<T>:消费性接口 void accept(T t);
 * 二： Supplier<T>:供给型接口 T get();
 * 三： Function<T,R>：函数型接口： R apply(T t);
 * 四： Predicate<T>:判断型接口：做判断操作 boolean test(T t);
 * @Date: 8/2/2019 9:43 AM
 */
public class LambdaFuncs {
    
    //Predicate<T> 断言型接口：
    @Test
    public void test4(){
        List<String> list = Arrays.asList("Hello","atgu","Lambda","www","ik");
        List<String> filterStr = filterStr(list, s -> s.length() > 3);
        filterStr.stream().forEach(str-> System.out.println(str));
    }
    
    //需求：将满足条件的字符串添加到集合中
    public List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> strList = new ArrayList<>();
        for (String str:list) {
            if (pre.test( str )){
                strList.add( str );
            }
        }
        return strList;
    }
    
    //Function<T,R> 函数型接口
    @Test
    public void test3(){
        String string = "\t\t\t 威武 ";
        String newStr = strHandler(string, str -> str.trim());
        System.out.println(newStr);
        String handler = strHandler(string, str -> str.substring(2, 7));
        System.out.println(handler);
    }
    
    //用于处理字符串
    public String strHandler(String str, Function<String,String> func){
        return func.apply( str );
    }
    
    //Supplier<T> 供给型接口：
    @Test
    public void test2(){
        List<Integer> numList = getNumList( 10, () -> (int)( Math.random() * 100 ));
        numList.stream().forEach( n -> System.out.println("，"+ n) );
    }
    //需求：产生指定个数的整数，并放入集合
    public List<Integer> getNumList(int num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<num; i++){
            Integer integer = sup.get();
            list.add( integer );
        }
        return list;
    }
    
    //Consumer<T>
    @Test
    public void test1(){
        happy(1000, m -> System.out.println("每次消费："+m) );
    }
    public void happy(double money, Consumer<Double> con){
        con.accept( money );
    }
}

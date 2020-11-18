package com.rzwl.study.base;

import com.rzwl.study.entity.Person;
import org.junit.Test;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : championjing
 * @version V1.0
 * @Description: 基本数据类型的缓冲池
 * @date Date : 2020年11月18日 11:10
 */
public class BaseTypeCache {

    @Test
    public void testIntegerCache(){
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        Integer z = Integer.valueOf(123);
        Integer n = Integer.valueOf(123); //Integer中的静态类IntegerCache有一个cache数组new Integer[(high - low) + 1];
        System.out.println( x==y ); //false
        System.out.println( x==z ); //f
        System.out.println( y==z ); //f
        System.out.println(z == n); //t
        Boolean.valueOf(false); // 获取Boolean中的常量值
        Character.valueOf('c'); //Character中的静态类CharacterCache中有一个new Character[127 + 1]数组作为缓存
        short a = 1;
        Short.valueOf(a); //ShortCache.cache
        Float.valueOf(1f); //没有缓存
        Long.valueOf(1l); //LongCache.cache

        List<Person> list = new ArrayList<>();
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };
        Person[] pp = new Person[list.size()];
        Arrays.sort( list.toArray(pp), comparator);
    }
}

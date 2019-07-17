package com.rzwl.study.pattern.aIterator;

/**
 * @author : championjing
 * @ClassName: MyIterator
 * @Description:
 * @Date: 7/17/2019 1:10 PM
 */
public interface MyIterator <E>{
    boolean hasNext();
    E next();
}

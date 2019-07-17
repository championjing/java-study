package com.rzwl.study.pattern;

/**
 * @author : championjing
 * @ClassName: Book
 * @Description:
 * @Date: 7/17/2019 1:14 PM
 */
public class Book {
    public String name;

    public Book(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.rzwl.study.pattern.cTemplate;

/**
 * @author : championjing
 * @ClassName: AbstractDisplay
 * @Description:
 * @Date: 7/18/2019 11:14 AM
 */
public abstract class AbstractDisplay {
    public void display(){
        open();
        for (int i=0;i<5;i++){
            print();
        }
        close();
    }
    public abstract void open();
    public abstract void print();
    public abstract void close();
}

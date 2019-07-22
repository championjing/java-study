package com.rzwl.study.pattern.iBridge;

/**
 * @author : championjing
 * @ClassName: Display
 * @Description: 功能层次
 * @Date: 7/22/2019 10:44 AM
 */
public class Display {
    private DisplayImpl impl;
    
    public Display(DisplayImpl impl){
        this.impl = impl;
    }
    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }
}

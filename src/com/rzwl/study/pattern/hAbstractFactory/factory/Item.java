package com.rzwl.study.pattern.hAbstractFactory.factory;

/**
 * @author : championjing
 * @ClassName: Item
 * @Description: 抽象的零件
 * @Date: 7/19/2019 10:28 AM
 */
public abstract class Item {
    
    protected String caption;
    
    public Item(String caption){
        this.caption = caption;
    }
    
    public abstract String makeHTML();
}

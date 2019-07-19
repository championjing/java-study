package com.rzwl.study.pattern.hAbstractFactory.factory;

/**
 * @author : championjing
 * @ClassName: Link
 * @Description: 抽象的一种零件
 * @Date: 7/19/2019 10:30 AM
 */
public abstract class Link extends Item {
    protected String url;
    
    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}

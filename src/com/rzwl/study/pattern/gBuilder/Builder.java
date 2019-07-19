package com.rzwl.study.pattern.gBuilder;

/**
 * @author : championjing
 * @ClassName: Builder
 * @Description:
 * @Date: 7/19/2019 9:26 AM
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}

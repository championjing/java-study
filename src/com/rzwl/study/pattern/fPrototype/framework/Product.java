package com.rzwl.study.pattern.fPrototype.framework;

/**
 * @author : championjing
 * @ClassName: Product
 * @Description:
 * @Date: 7/18/2019 3:51 PM
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}

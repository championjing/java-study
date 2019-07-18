package com.rzwl.study.pattern.dFactory.framework;

/**
 * @author : championjing
 * @ClassName: Factory
 * @Description:
 * @Date: 7/18/2019 12:42 PM
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    
    protected abstract Product createProduct(String owner);
    
    protected abstract void registerProduct(Product product);
}

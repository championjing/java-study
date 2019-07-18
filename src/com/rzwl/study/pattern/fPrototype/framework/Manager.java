package com.rzwl.study.pattern.fPrototype.framework;

import java.util.HashMap;

/**
 * @author : championjing
 * @ClassName: Manager
 * @Description:
 * @Date: 7/18/2019 3:53 PM
 */
public class Manager {
    private HashMap showcase = new HashMap();
    
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }
    public Product create(String protoname){
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}

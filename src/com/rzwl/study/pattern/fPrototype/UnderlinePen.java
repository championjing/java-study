package com.rzwl.study.pattern.fPrototype;

import com.rzwl.study.pattern.fPrototype.framework.Product;

/**
 * @author : championjing
 * @ClassName: UnderlinePen
 * @Description:
 * @Date: 7/18/2019 3:59 PM
 */
public class UnderlinePen implements Product {
    private char ulchar;
    
    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }
    
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""+s+"\"");
        System.out.println(" ");
        for (int i=0;i<length;i++){
            System.out.println(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}

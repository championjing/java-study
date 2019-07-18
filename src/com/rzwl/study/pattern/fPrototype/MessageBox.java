package com.rzwl.study.pattern.fPrototype;

import com.rzwl.study.pattern.fPrototype.framework.Product;
import jdk.nashorn.internal.runtime.PropertyDescriptor;

/**
 * @author : championjing
 * @ClassName: MessageBox
 * @Description:
 * @Date: 7/18/2019 3:56 PM
 */
public class MessageBox implements Product {
    private char decochar;
    
    public MessageBox(char decochar){
        this.decochar = decochar;
    }
    
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i=0; i<length+4; i++){
            System.out.println( decochar );
        }
        System.out.println("");
        System.out.println(decochar + " "+s +" "+decochar);
        for (int i=0; i<length+4; i++){
            System.out.println( decochar );
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

package com.rzwl.study.pattern.dFactory.idcard;

import com.rzwl.study.pattern.dFactory.framework.Product;

/**
 * @author : championjing
 * @ClassName: IDCard
 * @Description:
 * @Date: 7/18/2019 12:45 PM
 */
public class IDCard extends Product {
    private String owner;
    
    IDCard(String owner) {
        System.out.println("制作 "+owner+"的ID卡");
        this.owner = owner;
    }
    
    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }
    public String getOwner(){
        return owner;
    }
}

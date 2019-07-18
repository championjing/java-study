package com.rzwl.study.pattern.dFactory.idcard;

import com.rzwl.study.pattern.dFactory.framework.Factory;
import com.rzwl.study.pattern.dFactory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : championjing
 * @ClassName: IDCardFactory
 * @Description:
 * @Date: 7/18/2019 12:48 PM
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add( ( (IDCard) product).getOwner() );
    }
    
    public List getOwners(){
        return owners;
    }
}

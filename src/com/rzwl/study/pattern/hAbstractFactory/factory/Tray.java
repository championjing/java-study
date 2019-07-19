package com.rzwl.study.pattern.hAbstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : championjing
 * @ClassName: Tray
 * @Description: 抽象的另一种零件
 * @Date: 7/19/2019 10:32 AM
 */
public abstract class Tray extends Item {
    protected List<Item> tray = new ArrayList();
    
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        tray.add( item );
    }
}

package com.rzwl.study.pattern.hAbstractFactory.listfactory;

import com.rzwl.study.pattern.hAbstractFactory.factory.Factory;
import com.rzwl.study.pattern.hAbstractFactory.factory.Link;
import com.rzwl.study.pattern.hAbstractFactory.factory.Page;
import com.rzwl.study.pattern.hAbstractFactory.factory.Tray;

/**
 * @author : championjing
 * @ClassName: ListFactory
 * @Description:
 * @Date: 7/19/2019 3:11 PM
 */
public class ListFactory extends Factory {
    
    @Override
    public Link createLink(String caption, String url) {
        return null;
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }
}

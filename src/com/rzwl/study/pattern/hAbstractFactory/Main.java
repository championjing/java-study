package com.rzwl.study.pattern.hAbstractFactory;

import com.rzwl.study.pattern.hAbstractFactory.factory.Factory;
import com.rzwl.study.pattern.hAbstractFactory.factory.Link;
import com.rzwl.study.pattern.hAbstractFactory.factory.Page;
import com.rzwl.study.pattern.hAbstractFactory.factory.Tray;

/**
 * @author : championjing
 * @ClassName: Main
 * @Description:
 * @Date: 7/19/2019 3:06 PM
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory( args[0] );
        Link people = factory.createLink( "人民日报","http://www.people.com.cn/" );

        Tray tray = factory.createTray("日报");
        
        tray.add(people);
        
        Page page = factory.createPage("LinkPage","杨");
        page.add( tray );
        page.output();
    }
}

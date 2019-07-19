package com.rzwl.study.pattern.hAbstractFactory.listfactory;

import com.rzwl.study.pattern.hAbstractFactory.factory.Item;
import com.rzwl.study.pattern.hAbstractFactory.factory.Tray;

/**
 * @author : championjing
 * @ClassName: ListTray
 * @Description:
 * @Date: 7/19/2019 3:14 PM
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");
        for(Item item:super.tray ){
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        
        return buffer.toString();
    }
}

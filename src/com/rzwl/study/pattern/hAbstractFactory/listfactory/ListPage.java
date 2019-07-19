package com.rzwl.study.pattern.hAbstractFactory.listfactory;

import com.rzwl.study.pattern.hAbstractFactory.factory.Item;
import com.rzwl.study.pattern.hAbstractFactory.factory.Page;
import com.sun.corba.se.impl.ior.IORTemplateImpl;

/**
 * @author : championjing
 * @ClassName: ListPage
 * @Description:
 * @Date: 7/19/2019 3:17 PM
 */
public class ListPage extends Page {
    
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append( "<html><head><title>"+title+"</title></head>\n" );
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        for (Item item:super.content){
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>\n");
        
        return buffer.toString();
    }
}

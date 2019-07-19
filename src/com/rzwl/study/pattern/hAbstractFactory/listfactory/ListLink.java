package com.rzwl.study.pattern.hAbstractFactory.listfactory;

import com.rzwl.study.pattern.hAbstractFactory.factory.Link;

/**
 * @author : championjing
 * @ClassName: ListLink
 * @Description:
 * @Date: 7/19/2019 3:11 PM
 */
public class ListLink extends Link {


    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href='"+url+"'>"+caption+"</a></li>\n";
    }
}

package com.rzwl.study.pattern.dFactory;

import com.rzwl.study.pattern.dFactory.framework.Factory;
import com.rzwl.study.pattern.dFactory.framework.Product;
import com.rzwl.study.pattern.dFactory.idcard.IDCardFactory;

/**
 * @author : championjing
 * @ClassName: Main
 * @Description:
 * @Date: 7/18/2019 12:52 PM
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}

package com.rzwl.study.pattern.cTemplate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author : championjing
 * @ClassName: Main
 * @Description:
 * @Date: 7/18/2019 11:14 AM
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello world");
        AbstractDisplay d3 = new StringDisplay("你好");
        d1.display();
        d2.display();
        d3.display();
    }
    public static void see() throws FileNotFoundException {
        java.io.InputStream is = new FileInputStream("");
    }
}

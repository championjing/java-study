package com.rzwl.study.pattern.bAdapter;

/**
 * @author : championjing
 * @ClassName: Main
 * @Description:
 * @Date: 7/17/2019 5:07 PM
 */
public class Main {
    public static void main(String[] args) {
        Printer p= new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

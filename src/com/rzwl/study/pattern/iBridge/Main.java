package com.rzwl.study.pattern.iBridge;

/**
 * @author : championjing
 * @ClassName: Main
 * @Description:
 * @Date: 7/22/2019 11:01 AM
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello, China."));
        Display d2 = new Display(new StringDisplayImpl("hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello, Universe."));
        
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}

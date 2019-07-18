package com.rzwl.study.pattern.cTemplate;

/**
 * @author : championjing
 * @ClassName: CharDisplay
 * @Description:
 * @Date: 7/18/2019 11:14 AM
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;
    public CharDisplay(char ch){
        this.ch = ch;
    }
    
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}

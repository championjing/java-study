package com.rzwl.study.pattern.bAdapter;

/**
 * @author : championjing
 * @ClassName: Banner
 * @Description:
 * @Date: 7/17/2019 5:03 PM
 */
public class Banner {
    private String string;
    
    public Banner(String string){
        this.string = string;
    }
    
    public void showWithParen(){
        System.out.println("("+string+")");
    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}

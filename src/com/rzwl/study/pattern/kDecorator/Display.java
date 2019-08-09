package com.rzwl.study.pattern.kDecorator;

/**
 * @author : championjing
 * @ClassName: Display
 * @Description:
 * @Date: 8/6/2019 10:18 AM
 */
public abstract class Display {
    public abstract int getColumns(); //获取横向字符数
    public abstract int getRows(); //获取纵向行数
    public abstract String getRowText(int row); //获取第row行的字符串
    
    public final void show(){ //全部显示
        for (int i=0; i<getRows() ; i++) {
            System.out.println(getRowText(i));
        }
    }
}

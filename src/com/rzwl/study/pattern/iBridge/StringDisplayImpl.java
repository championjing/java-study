package com.rzwl.study.pattern.iBridge;

/**
 * @author : championjing
 * @ClassName: StringDisplayImpl
 * @Description: 实现层次
 * @Date: 7/22/2019 10:56 AM
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string; //要显示的字符串
    private int width; //以字节单位计算出字符串的宽度
    
    public StringDisplayImpl(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }
    
    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+string+"|"); //前后加上 | 显示
    }

    @Override
    public void rawClose() {
        printLine();
    }
    
    private void printLine(){
        System.out.print("+");
        for (int i=0;i<width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}

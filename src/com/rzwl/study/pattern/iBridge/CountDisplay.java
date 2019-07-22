package com.rzwl.study.pattern.iBridge;

/**
 * @author : championjing
 * @ClassName: CountDisplay
 * @Description: 功能层次
 * @Date: 7/22/2019 10:46 AM
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    
    public void multiDisplay(int times){
        open();
        for (int i=0;i<times;i++){
            print();
        }
        close();
    }
}

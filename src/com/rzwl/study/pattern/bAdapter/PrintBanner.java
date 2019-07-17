package com.rzwl.study.pattern.bAdapter;

/**
 * @author : championjing
 * @ClassName: PrintBanner
 * @Description:
 * @Date: 7/17/2019 5:05 PM
 */
public class PrintBanner extends Banner implements Printer{
    public PrintBanner(String string){
        super(string);
    }
    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}

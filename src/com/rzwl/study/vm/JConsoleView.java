package com.rzwl.study.vm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : champion
 * @version V1.0
 * @Description: 为查看jconsole的功能
 * @date Date : 2020年09月03日 19:35
 */
public class JConsoleView {

    static class OOMObject {
        public byte[] placeholder = new byte[64*1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i=0; i<num ;i++) {
            //稍作延时，令监视曲线的变化更加明显
            Thread.sleep(100);
            list.add( new OOMObject() );
        }
        System.gc();
    }

    /**
     *  -Xms100m -Xmx100m -XX:+UseSerialGC
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}

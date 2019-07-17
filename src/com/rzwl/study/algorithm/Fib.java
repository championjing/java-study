package com.rzwl.study.algorithm;

/**
 * @author : championjing
 * @ClassName: Fib
 * @Description:
 * @Date: 2019/7/17 22:13
 */
public class Fib {
    public static void main(String[] args) {
        System.out.println( dp(6) );
    }

    /**
     * 使用动态规划的思想实现斐波那契数列
     * @param n
     * @return
     */
    public static int dp(int n){
        int res = 0,pp=1,p=1;
        for( int i=3;i<=n;i++ ){
            res=pp+p;
            p=pp;
            pp = res;
        }
        return res;
    }
}

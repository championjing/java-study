package com.rzwl.study.leetcode.string;

import org.junit.Test;

import java.util.*;

/**
 * @author : champion
 * @version V1.0
 * @Description: 初级算法题 类 字符串
 * @date Date : 2020年09月09日 15:41
 */
public class Junior {

    @Test
    public void testfirstUniqChar(){
        System.out.println( uniqueChar("leetcode") );
    }

    public int uniqueChar(String s) {
        //定义过一个26个字母的标识数组
        int[] result = new int[26];
        //遍历字符串，并在标识数组中统计字母出现的次数，
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            if (result[s.charAt(i) -'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 字符串中的第一个唯一字符
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> con = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for ( int i=0; i<chars.length; i++ ) {
            Integer integer = con.get(chars[i]);
            if (integer == null) {
                con.put(chars[i],1);
            } else {
                con.put( chars[i], integer+1 );
            }
        }

        for (Map.Entry<Character, Integer> entry:con.entrySet()) {
            Integer value = entry.getValue();
            if (value  == 1) {
                return s.indexOf( entry.getKey() );
            }
        }
        return -1;
    }

    @Test
    public void test(){
        int num = 1980;
        System.out.println( reverse(num) );
    }

    /**
     * 整数反转
     * @param x
     * @return
     */
    public int reverse(int x) {
        long result = 0;
        while ( x!=0 ) {
            result = result * 10 + x%10;
            x = x/10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ) {
            return 0;
        }
        return (int)result;
    }
}

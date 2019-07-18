package com.rzwl.study.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : championjing
 * @ClassName: WordBreak
 * @Description:
 * @Date: 7/18/2019 5:07 PM
 */
public class WordBreak {

    public static void main(String[] args) {
        String s = "leetcode";
        String[] wordDict = {"leet", "code"};
        List<String> strings = Arrays.asList(wordDict);
        System.out.println(wordB(s,strings));
    }
    
    public static boolean wordB(String s, List<String> wordDict){
        boolean[] dp = new boolean[s.length()+1];
        Set<String> set = new HashSet<>();
        
        dp[0] = true;
        for (int i=1; i<=s.length(); i++){
            for (int j=0; j<i ;++j){
                if (dp[j] && wordDict.contains( s.substring(j,i) )){
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[s.length()] ;
    } 
    
}

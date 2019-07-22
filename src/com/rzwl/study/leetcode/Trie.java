package com.rzwl.study.leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author : championjing
 * @ClassName: Trie
 * @Description:
 * @Date: 7/22/2019 11:37 AM
 */
class Trie {
    private String node="";
    private Set<Trie> childs = new HashSet<Trie>();

    /** Initialize your data structure here. */
    public Trie() {
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        int depth = word.length();
        if( depth == 0 ) {
            return;
        }
        word = word.toLowerCase();
        Set<Trie> cc = this.childs;
        for ( int i=0;i<depth; i++){
            
            String temp = "";
            if( i == depth-1 ){
                temp = word;
            } else {
                temp = word.substring( 0,i+1 );
            }
            Trie now = new Trie();
            now.node = temp;
            if( cc.size() == 0 ) {
                cc.add( now );
                cc = now.childs;
            } else {
                boolean flag = false;
                for( Trie t:cc ){
                    if ( t.node.equals( temp ) ){
                        cc = t.childs;
                        flag = true;
                        break;
                    }
                }
                if( !flag ) {
                    cc.add(now);
                    cc = now.childs;
                }
            }
            
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int length = word.length();
        if( length == 0 ) {
            return false;
        }
        word = word.toLowerCase();
        Set<Trie> set = this.childs;
        for (int i=0;i<length;i++){
            String target = "";
            if( i == length-1 ){
                target = word;
            } else {
                target = word.substring( 0,i+1 );
            }
            for (Trie t:set){
                if( target.equals( t.node ) ){
                    if( target.equals( word ) ) {
                        return true;
                    } else {
                        set = t.childs;
                        break;
                    }
                }
            }
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int length = prefix.length();
        if( length == 0 ) {
            return false;
        }
        prefix = prefix.toLowerCase();
        Set<Trie> set = this.childs;
        for (int i=0;i<length;i++){
            String target = "";
            if( i == length-1 ){
                target = prefix;
            } else {
                target = prefix.substring( 0,i+1 );
            }
            for (Trie t:set){
                if( target.equals( t.node ) ){
                    if( target.equals( prefix ) ) {
                        return true;
                    } else {
                        set = t.childs;
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Trie trie = (Trie) o;
        return Objects.equals(node, trie.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node);
    }

    public static void main(String[] args) {
        Trie t = new Trie();
        String[] words = {"Trie","insert","search","search","startsWith","insert","search"};
        for (int i=0;i<words.length;i++){
            t.insert(words[i]);
        }
        t.search( "search" );
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

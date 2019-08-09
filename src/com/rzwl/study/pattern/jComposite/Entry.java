package com.rzwl.study.pattern.jComposite;

/**
 * @author : championjing
 * @ClassName: Entry
 * @Description:
 * @Date: 8/6/2019 9:54 AM
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    
    public Entry add(Entry entry) throws Exception{
        throw new Exception();
    }
    
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);
    
    @Override
    public String toString(){
        return getName() + "("+getSize()+")";
    }
}

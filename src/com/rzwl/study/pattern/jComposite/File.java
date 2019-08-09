package com.rzwl.study.pattern.jComposite;

/**
 * @author : championjing
 * @ClassName: File
 * @Description:
 * @Date: 8/6/2019 9:57 AM
 */
public class File extends Entry {
    
    private String name;
    private int size;
    
    public File(String name,int size){
        this.name = name;
        this.size = size;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix +"/"+this);
    }
}

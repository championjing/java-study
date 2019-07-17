package com.rzwl.study.pattern.aIterator;

/**
 * @author : championjing
 * @ClassName: BookShelfIterator
 * @Description:
 * @Date: 7/17/2019 1:13 PM
 */
public class BookShelfIterator implements MyIterator{
    private BookShelf bookShelf;
    private int index;
    
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    
    @Override
    public boolean hasNext() {
        if (index<bookShelf.length()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}

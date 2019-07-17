package com.rzwl.study.pattern.aIterator;

/**
 * @author : championjing
 * @ClassName: BookShelf
 * @Description:
 * @Date: 7/17/2019 1:11 PM
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last=0;
    
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }
    
    public Book getBookAt(int index){
        return books[index];
    }
    
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    
    public int length(){
        return last;
    }
    
    @Override
    public MyIterator iterator() {
        return new BookShelfIterator(this);
    }
}

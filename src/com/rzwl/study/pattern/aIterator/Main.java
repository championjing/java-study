package com.rzwl.study.pattern.aIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook( new Book("Around the World in 80 Days") );
        bookShelf.appendBook( new Book("Bible") );
        bookShelf.appendBook( new Book("Cinderella") );
        bookShelf.appendBook( new Book("Daddy-Long-Legs") );
        MyIterator it = bookShelf.iterator();
        while( it.hasNext() ){
            Book book = (Book) it.next();
            System.out.println( book.getName() );
        }
    }
    
    public static void seeIterator(){
        List<Integer> list = new ArrayList();
        Iterator<Integer> iterator = list.iterator();
    }
}

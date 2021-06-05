package day50_inheritance;

import day50_inheritance.Book;

public class AudioBook extends Book {
    double length;
    String narrator;

    public void listen(){
        System.out.println("listening audio book");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("narrator = " + narrator);
        System.out.println("length = " + length);
    }
}

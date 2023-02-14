package com.studentbook.demo2.Services;

import java.util.ArrayList;

public class BookServices {
    
    private static List<Book> list=new ArrayList<>();


    static{
        list.add(new Book(12,"Java complete Reference","XYZ"));
        list.add(new Book(36,"Head first to Java","ABC"));
        list.add(new Book(895,"JAVA ITT IZZ","KMN"));
        
    }

//get all books
    public List<Book> getAllBooks(){
        return list;
    }

    //get single book by id
    public Book getBookById(int id){
        Book book =null;
        list.stream().filter(e->getId()==id).firstFirst().get();
        return book;

    }

}

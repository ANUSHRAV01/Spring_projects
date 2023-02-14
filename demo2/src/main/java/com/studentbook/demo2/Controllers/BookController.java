package com.studentbook.demo2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

// import java.lang.reflect.Method;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentbook.demo2.Entities.Book;
import com.studentbook.demo2.Services.BookServices;

@RestController
public class BookController {
    
    @Autowired
    private BookServices bookServices;
    // @RequestMapping(value= "/books", method= RequestMethod.GET)
    // @ResponseBody
    @GetMapping("\books")
    public List<Book> getBooks(){

    return this.bookServices.getAllBooks();
    }
}


// @Autowired
// private BookServices bookServices;
// // @RequestMapping(value= "/books", method= RequestMethod.GET)
// // @ResponseBody
// @GetMapping("\books")
// public List<Book> getBooks(){

// return this.bookServices.getAllBooks()k;
// }

package com.sbcompany.demo.controllers;

import com.sbcompany.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book/saveRandom")
    public void saveRandomBook() {
        bookService.saveRandomBook();
    }

    @GetMapping("/book/removeRandom")
    public void removeRandomBook() {
        bookService.removeRandomBook();
    }
}

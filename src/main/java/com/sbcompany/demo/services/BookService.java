package com.sbcompany.demo.services;

import com.sbcompany.demo.models.Author;
import com.sbcompany.demo.models.Book;
import com.sbcompany.demo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void saveRandomBook() {
        Book book = Book.builder()
                .id(new Random().nextInt(100000))
                .isbn(new Random().nextInt(999) + "-" + new Random().nextInt(999))
                .title("Mali princ")
                .author(Author.builder()
                        .firstName("Pero" + new Random().nextInt(999))
                        .lastName("Peric" + new Random().nextInt(999))
                        .build())
                .build();

        bookRepository.save(book);
    }

    public void removeRandomBook() {
        bookRepository.delete(Book.builder().id(1).build());
    }
}

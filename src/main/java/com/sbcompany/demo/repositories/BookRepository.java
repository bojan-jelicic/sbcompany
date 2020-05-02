package com.sbcompany.demo.repositories;

import com.sbcompany.demo.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}

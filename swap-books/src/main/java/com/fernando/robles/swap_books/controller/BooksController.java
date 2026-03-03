package com.fernando.robles.swap_books.controller;

import com.fernando.robles.swap_books.repository.BookRepository;
import com.fernando.robles.swap_books.model.Books;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BooksController {

    private final BookRepository repository;


    public BooksController(BookRepository repository) {
        this.repository = repository;
    }

    @QueryMapping
    public List<Books> getAll() {
        return repository.findAll();
    }

    @QueryMapping
    public Books getByISBN(@Argument Long isbn) {
        return repository.findById(isbn).orElse(null);
    }
}

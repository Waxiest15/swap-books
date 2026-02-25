package com.fernando.robles.swap_books;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BooksMockDataLoader implements CommandLineRunner {

    @Autowired
    BookRepository repository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Testing connection to the database...");
        repository.findAll().forEach(it -> log.info(it.toString()));
    }
}

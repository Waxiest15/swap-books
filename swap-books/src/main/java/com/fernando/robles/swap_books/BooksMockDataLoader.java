package com.fernando.robles.swap_books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


public class BooksMockDataLoader {

    @Autowired
    BookRepository repository;

    @Bean    CommandLineRunner loadData(BookRepository repository) {
        return args -> {
            repository.findAll().forEach(System.out::println);

            System.out.printf("\nGet by id [9780134685991]: \n%s", repository.findByISBN(9780134685991L));
            repository.findByGenre("Programming").forEach(System.out::println);
            updateAll();
        };
    }

    public void updateAll(){
        String newCategory = "Very hard";
        var list = repository.findByTags("advanced");
        list.forEach(book -> {
            book.setGenres(List.of(newCategory));
            repository.save(book);
        });

        var updatedList = repository.saveAll(list);
        if(updatedList != null){
            System.out.printf("Successfully updated %s items \n", updatedList.size());
        }
    }
}

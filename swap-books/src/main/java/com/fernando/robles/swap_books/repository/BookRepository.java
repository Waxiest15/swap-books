package com.fernando.robles.swap_books.repository;

import com.fernando.robles.swap_books.model.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Books, Long> {

    @Query("{ '_id': ?0 }")
    Books findByISBN(Long ISBN);

    @Query("{ 'title': ?0 }")
    Books findByTitle(String title);

    @Query("{ 'genres': ?0 }")
    List<Books> findByGenre(String category);

    @Query("{ 'tags': ?0 }")
    List<Books> findByTags(String category);
}

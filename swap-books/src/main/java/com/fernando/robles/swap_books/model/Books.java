package com.fernando.robles.swap_books.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    @Id
    private Long isbn;
    private String title;
    private String author;
    private List<String> genres;
    private List<String> tags;
    private int pages;
    private String publisher;
    private String publicationDate;
    private String condition;
    private String conditionDescription;
    private String description;
}

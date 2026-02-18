package com.fernando.robles.swap_books.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Books {
    @Id
    @Column(name = "ISBN", nullable = false, unique = true)
    private Long ISBN;
    private String title;
    private String author;
    private String tags;
    private String genre;
    private Date publicationDate;
    private String publisher; //possible object
    private int pages;
    private String language;
    private String description;
    private String condition;
    private String conditionDetails;
}

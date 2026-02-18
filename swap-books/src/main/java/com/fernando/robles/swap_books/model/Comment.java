package com.fernando.robles.swap_books.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Comment {
    private Long id;
    private Long ownerId;
    private Long post;
    private String content;
    //timestamps
}

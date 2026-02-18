package com.fernando.robles.swap_books.model;

import com.fernando.robles.swap_books.model.enums.Status;
import com.fernando.robles.swap_books.model.enums.Type;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Post {
    private Long id;
    private User user;
    private String title;
    private Status status; //enum
    private Type type; //enum
    private List<String> hashtags;
    private String description;
    //timestamps
    /**
     * Plausible properties
     */
}

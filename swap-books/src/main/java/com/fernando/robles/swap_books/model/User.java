package com.fernando.robles.swap_books.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String authorities; //possible object
}

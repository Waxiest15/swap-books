package com.fernando.robles.swap_books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SwapBooksApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwapBooksApplication.class, args);
	}

}

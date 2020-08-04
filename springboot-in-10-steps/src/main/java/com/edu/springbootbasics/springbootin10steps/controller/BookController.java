package com.edu.springbootbasics.springbootin10steps.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.springbootbasics.springbootin10steps.domain.Book;

@RestController
public class BookController {

	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		
		return Arrays.asList(new Book(11, "living by the book", "jared chidane"));
		
		
	}
}

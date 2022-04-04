package com.book.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.book.entities.Book;
import com.book.book.services.BookService;

@RestController

public class BookController {
	
	@Autowired
	private BookService bookService;
	

	@GetMapping("/books")
	public List<Book> getBooks(){
		return this.bookService.getBooks();
		
	}
	@GetMapping("/books/{booksId}")
	public Book getBook(@PathVariable String booksId) {
		return this.bookService.getBook(Long.parseLong(booksId));
	}
	
	
	@PostMapping(path="/books",consumes="application/json")
	public Book addBooks(@RequestBody Book book) {
		return this.bookService.addBooks(book);
	}
	
	@PutMapping("/books")
	public Book updateBooks(@RequestBody Book book) {
		return this.bookService.updateBooks(book);
	}
	@DeleteMapping("/books/{booksId}")
	public  ResponseEntity<HttpStatus> deleteBook(@PathVariable String booksId){
		try {
			this.bookService.deleteBook(Long.parseLong(booksId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
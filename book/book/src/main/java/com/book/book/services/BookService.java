package com.book.book.services;

import java.util.List;

import com.book.book.entities.Book;

public interface BookService {
	
	public List<Book> getBooks();
	public Book getBook(long booksId);
	
	public Book addBooks(Book book);
	
	public Book updateBooks(Book book);
	public void deleteBook(long parseLong);

}
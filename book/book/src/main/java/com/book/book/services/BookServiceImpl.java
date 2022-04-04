package com.book.book.services;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.book.dao.BookDao;
import com.book.book.entities.Book;




@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
	//List<Books> list;
	public BookServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Books(145,"java","dinesh"));
//		list.add(new Books(146,"c","John"));
	}
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}
	@Override
	public Book getBook(long booksId) {
		// TODO Auto-generated method stub


//	Books b =null;
//	for(Books book :list) {
//		if(book.getId()==booksId) {
//			b=book;
//			break;
//		}
//	}
	return bookDao.getOne(booksId); 
}
	@Override
	public Book addBooks(Book book) {
		// TODO Auto-generated method stub
		
		
		bookDao.save(book);
		
		//list.add(book);
		return book;
	}
	@Override
	public Book updateBooks(Book book) {
		// TODO Auto-generated method stub
		
//		list.forEach(e->{
//			if(e.getId()==book.getId()) {
//				e.setName(book.getName());
//				e.setAuthor(book.getAuthor());
//				
//			}
//			
//		});
//		
		bookDao.save(book);
		return book;
		
		
	}
	@Override
	public void deleteBook(long parseLong) {
		// TODO Auto-generated method stub
		Book entity=bookDao.getOne(parseLong);
		bookDao.delete(entity);
		
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}
	



}
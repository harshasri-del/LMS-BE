package com.book.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.book.entities.Book;

public interface BookDao extends JpaRepository<Book, Long>{

}
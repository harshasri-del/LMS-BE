
package com.book.book.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private long id;

	private String name;
	private String author;
	private String description;
	private Boolean available;

	public Book(long id, String name, String author,String description, Boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.description = description;
		this.available = available;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", description=" + description
				+ ", available=" + available + "]";
	}
	
	
	

}

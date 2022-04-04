package com.user.user.entities;


import java.util.Date;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private boolean isAdmin;
	private Date barrowdate;
	public User(int id, String name, boolean isAdmin, Date barrowdate) {
		super();
		this.id = id;
		this.name = name;
		this.isAdmin = isAdmin;
		this.barrowdate = barrowdate;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public Date getBarrowdate() {
		return barrowdate;
	}
	public void setBarrowdate(Date barrowdate) {
		this.barrowdate = barrowdate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", isAdmin=" + isAdmin + ", barrowdate=" + barrowdate + "]";
	}
	
	
}
	
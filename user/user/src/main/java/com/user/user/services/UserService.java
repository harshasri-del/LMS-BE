
package com.user.user.services;

import java.util.List;


import com.user.user.entities.User;

public interface UserService {
	
	public List<User> getUsers();
	public User getUser(long userId);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	public void deleteUser(long parseLong);
	

}
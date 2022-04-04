package com.user.user.services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user.dao.UserDao;
import com.user.user.entities.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	//List<User> list;
	public UserServiceImpl() {
//		list=new ArrayList<>();
//
//		list.add(new User(146,"John"));
//		list.add(new User(147,"John1"));
//		list.add(new User(148,"John2"));
		
	}
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	@Override
	public User getUser(long userId) {
		// TODO Auto-generated method stub


//	User b =null;
//	for(User user :list) {
//		if(user.getId()==userId) {
//			b=user;
//			break;
//		}
//	}
	return userDao.getOne(userId); 

	

}
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
		userDao.save(user);
		//list.add(user);
		return user;
		
	}
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		
//		list.forEach(e->{
//			if(e.getId()==user.getId()) {
//				e.setName(user.getName());
//				
//				
//			}
//			
//		});
		
		userDao.save(user);
		
		return user;
	}
	@Override
	public void deleteUser(long parseLong) {
		User entity=userDao.getOne(parseLong);
		userDao.delete(entity);
		// TODO Auto-generated method stub
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}


	
	
}
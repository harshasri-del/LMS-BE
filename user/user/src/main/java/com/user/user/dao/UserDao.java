package com.user.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.user.entities.User;

public interface UserDao extends JpaRepository<User, Long>{

}
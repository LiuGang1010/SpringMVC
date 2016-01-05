package com.lg.dao;

import org.springframework.stereotype.Repository;

import com.lg.model.User;

@Repository
public class UserDao {
	
	public User selectByUsername(String username){
		
		if("admin".equals(username)){
			User user=new User();
			user.setUserName(username);
			user.setPassword("123");
			return user;
		}
		
		
		return null;
	}

}

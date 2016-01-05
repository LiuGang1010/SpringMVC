package com.lg.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lg.dao.UserDao;
import com.lg.model.User;

@Service
public class LoginService {
	
	@Resource
	UserDao dao;

	public User doLogin(String userName, String password) throws Exception {
		
		//用于验证 还有判断用户名和密码是否为空
		User user = dao.selectByUsername(userName);
		
		if(user==null){
			//System.out.println("用户名不存在");
			//return null;
			throw new Exception("用户名不存在");
		}
		if(!user.getPassword().equals(password)){
			//System.out.println("密码不对");
			//return null;
			throw new Exception("密码不对");
		}
		return user;
	}
}

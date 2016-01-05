package com.lg.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lg.constant.Global;
import com.lg.exception.MyException;
import com.lg.model.User;
import com.lg.service.LoginService;

@Controller
public class LoginController extends BaseController {
	
	@Resource
	LoginService service;
	
	@Resource
	HttpServletRequest request;
	
	@RequestMapping("/exception")
	public void exception() throws Exception{
		throw new MyException("触发异常测试");
	}
	
	@RequestMapping("/loginpage")
	public String toLoginPage(){
		return "/WEB-INF/jsp/login.jsp";
	}
	@RequestMapping("/user/home")
	public String toUserHome(){
		return "/WEB-INF/jsp/userhome.jsp";
	}
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	public String doLogin(@RequestParam String userName,@RequestParam String password){
		
		try {
			User user=service.doLogin(userName,password);
			request.getSession().setAttribute(Global.USER_SESSION_KEY, user);
			if(user!=null){
				return "/WEB-INF/jsp/userhome.jsp";
			}
			return "/WEB-INF/jsp/login.jsp";
		} catch (Exception e) {
			return "/WEB-INF/jsp/login.jsp";
		}
		
		
	}

}

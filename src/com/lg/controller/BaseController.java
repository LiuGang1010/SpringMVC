package com.lg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lg.exception.MyException;

public class BaseController {
	
	@ExceptionHandler(MyException.class)
	public String handleException(Exception ex,HttpServletRequest request){
		request.setAttribute("error", ex.getMessage());
		return "/WEB-INF/jsp/exception.jsp";
	}

}

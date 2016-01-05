package com.lg.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lg.constant.Global;
import com.lg.model.User;

public class LoginInterceptor implements HandlerInterceptor {
	
	//检测用户在访问用户中心时，是否已经登陆了账号，如果没有登录调回登录页面
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		System.out.println("preHandle");
		Object user = request.getSession().getAttribute(Global.USER_SESSION_KEY);
		if(user==null){
			System.out.println("尚未登录");
		    response.sendRedirect("/SpringMVC4/loginpage.html"); 
		    return false;
		}
		return true;
	}
	
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("postHandle");
	}

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion");
	}

	



}

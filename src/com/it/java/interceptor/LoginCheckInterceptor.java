package com.it.java.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 登录校验拦截器
 * @author hasee
 *
 */

public class LoginCheckInterceptor implements HandlerInterceptor{
	
	
	//处理请求完成之前执行
	 public boolean preHandle(HttpServletRequest request,    
	            HttpServletResponse response, Object handler) throws Exception 
	 
	 {
		 String requestURI = request.getRequestURI();
		 //登录放行
		 if(!requestURI.contains("/login")){
			//获得session中user的数据
			Object attribute = request.getSession().getAttribute("user");
			 
			 //判断session是否存在
			if (attribute != null) {
				//=>存在放行 执行下一个拦截器
				return true;
			} else {
				//=>不存在重定向到登录页面
//				response.sendRedirect("login.jsp");
				request.setAttribute("path", "login.jsp");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return false;
			}
		 }else{
			 return true;
		 }
	 }

	@Override
	//之后
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	//页面渲染后
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
}

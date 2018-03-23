package com.it.java.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.VoiceStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.it.java.pojo.User;
import com.it.java.service.UserService;
import com.it.java.service.impl.UserServiceImpl;

/**
 * 用户
 * @author hasee
 *
 */
@Controller

public class UserController {
	@Autowired
	private UserService service;

	
	//登录
	@RequestMapping("/login.action")
	public void login(User user, Model model, HttpSession session,HttpServletResponse response) throws ServletException, IOException {
		System.out.println(user);
		User user1 = service.login(user);
		System.out.println(user1);
		if (user1 != null) {
			User user2 = service.findById(user.getAccount());
			session.setAttribute("user", user2);
			response.sendRedirect("/xinjava-ssm/main.jsp");
		} else {
			model.addAttribute("message", "账号或密码错误");
		}
	}
	
	//查找所有用户
	@RequestMapping(value = "/findUser.action")
	public ModelAndView FindUser(){
		
		List<User> list = service.FindUser();
		
		for (User user : list) {
			System.out.println(user);
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userList", list);
		mav.setViewName("bodyDelectUser");
		
		return mav;
	}
	
	//删除用户
	@RequestMapping(value = "/deletUser.action")
	public String DeletUser(int id){
		
		service.DeletUser(id);
		
		
		return "success";
	}
	
	
	@RequestMapping("/register.action")
	public String register(User user, Integer type) {
		
		User user1 = service.findById(user.getAccount());
		System.err.println("type="+type);
		String uri = null;
		if (user1 == null) {
			if (type == 2) {
				user.setPosition(User.STUDENT);
				System.out.println(user);
				service.add(user);
				uri = "login";
			}
			if (type == 1) {
				user.setPosition(User.TEACHER);
				service.add(user);
				uri="success";
			}
		} else if(user1!=null) {
			if (type == 2) {
				uri = "register";
			}
			if (type == 1) {
				uri = "addteacher";
			}
		}
		return uri;
	}
	  @RequestMapping("/exit.action")
	public void exit(HttpSession session,HttpServletResponse response) throws IOException{
		 session.removeAttribute("user");
		 
		 response.sendRedirect("login.jsp");
		 
	}
}

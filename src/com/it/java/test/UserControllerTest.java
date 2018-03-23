package com.it.java.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.it.java.pojo.User;
import com.it.java.service.UserService;
import com.it.java.service.impl.UserServiceImpl;

public class UserControllerTest {
	
	
	private ClassPathXmlApplicationContext context;

	@Before
	public void setUp() throws Exception {
		this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	@Test
	public void test1(){
		UserService userService = new UserServiceImpl();
		
	}
	
	
	
}

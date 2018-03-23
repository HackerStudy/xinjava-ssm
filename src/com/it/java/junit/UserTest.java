package com.it.java.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.java.dao.UserMapper;
import com.it.java.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserTest {
	
	@Autowired
	private UserMapper userMapper;
	
	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	@Test
	public void MybatisFindUser(){
		
		User user = new User(1,"张三","1234","1234",3);
		
		User login = userMapper.login(user);
		
		System.out.println(login);
		
	}
	
	@Test
	public void MybatisFindUser2(){
	}
	
	


}

package com.it.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.java.dao.UserMapper;
import com.it.java.pojo.User;
import com.it.java.service.UserService;

/**
 * 用户
 * @author hasee
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	public void add(User user) {
		userMapper.add(user);
	}


	public User findById(String account) {
		return userMapper.findById(account);
	}

	public List<User> findAll() {
		return null;
	}

	public User login(User user) {
		return userMapper.login(user);
	}


	public List<User> FindUser() {
		return userMapper.FindUser();
	}


	public void DeletUser(int id) {
		userMapper.DeletUser(id);
	}
	
}

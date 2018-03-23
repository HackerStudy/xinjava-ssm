package com.it.java.service;

import java.util.List;

import com.it.java.pojo.User;

/**
 * 用户
 * @author hasee
 *
 */
public interface UserService {

	User login(User user);

	User findById(String account);

	void add(User user);

	List<User> FindUser();

	void DeletUser(int id);

	

}

package com.it.java.dao;

import java.util.List;

import com.it.java.pojo.User;

public interface UserMapper {
	

	void add(User user);

	User findById(String account);

	User login(User user);

	List<User> FindUser();

	void DeletUser(int id);

}

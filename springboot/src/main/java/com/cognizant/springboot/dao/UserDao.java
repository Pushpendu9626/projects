package com.cognizant.springboot.dao;

import com.cognizant.springboot.model.User;

public interface UserDao {

	public boolean addUser(User user);
	public boolean validate(User user);
}

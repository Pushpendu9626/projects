package com.cognizant.sprinigboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springboot.dao.UserDaoImpl;
import com.cognizant.springboot.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	public boolean addUser(User user)
	{
		boolean result = userDaoImpl.addUser(user);
		return result;
	}

	public boolean validateUser(User user)
	{
		boolean result = userDaoImpl.addUser(user);
		return result;
	}

}

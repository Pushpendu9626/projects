package com.cognizant.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.springboot.model.User;


@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into user values(?,?,?)";
		int result = jdbcTemplate.update(sql, user.getId(), user.getUsername(), user.getPassword());
		if (result > 0)
			return true;
		return false;

	}
	
	@Override
	public boolean validate(User user) {
		// TODO Auto-generated method stub

		String sql = "select * from MenuItem where menuItemId=?";
		MenuRowMapper row = new MenuRowMapper();
		User item = jdbcTemplate.queryForObject(sql, row,user.getId());
		
		if(item.getUsername().equals(user.getUsername())&& item.getPassword().equals(user.getPassword()))
			return true;
		return false;
	}
}

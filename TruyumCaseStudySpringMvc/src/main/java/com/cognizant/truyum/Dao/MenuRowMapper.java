package com.cognizant.truyum.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.truyum.model.MenuItem;

public class MenuRowMapper implements RowMapper<MenuItem> {

	@Override
	public MenuItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		MenuItem menuItem = new MenuItem();

		menuItem.setMenuItemId(rs.getInt(1));
		menuItem.setTitle(rs.getString(2));
		menuItem.setPrice(rs.getDouble(3));
		menuItem.setActive(rs.getString(4));
		menuItem.setDateOfLaunch(new Date(rs.getDate(5).getTime()));
		menuItem.setCategory(rs.getString(6));
		menuItem.setFreeDelivery(rs.getString(7));

		return menuItem;
	}

}

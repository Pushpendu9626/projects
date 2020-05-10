package com.cognizant.truyum.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.MenuItem;

@Repository
public class MenuItemDaoImpl implements MenuItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<MenuItem> getMenuItemListAdmin() {

		String sql = "select * from menuitem";
		MenuRowMapper menuRowMapper = new MenuRowMapper();
		List<MenuItem> list = jdbcTemplate.query(sql, menuRowMapper);
		return list;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {

		String sql = "select * from menuitem where active='yes' and dateOfLaunch<=CURDATE()";
		MenuRowMapper menuRowMapper = new MenuRowMapper();
		List<MenuItem> list = jdbcTemplate.query(sql, menuRowMapper);
		return list;
	}

	@Override
	public MenuItem getMenuItemById(int id) {

		String sql = "select * from menuitem where menuItemId=?";

		MenuRowMapper menuRowMapper = new MenuRowMapper();

		MenuItem menuItem = jdbcTemplate.queryForObject(sql, menuRowMapper, id);
		return menuItem;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		String sql = "Update menuitem set title=?,price=?,active=?,dateOfLaunch=?,category=?,freeDelivery=? where menuItemId=?";

		if (menuItem.getFreeDelivery() == null) {
			String result = "No";
			jdbcTemplate.update(sql, menuItem.getTitle(), menuItem.getPrice(), menuItem.getActive(),
					menuItem.getDateOfLaunch(), menuItem.getCategory(), result, menuItem.getMenuItemId());
		} else {
			jdbcTemplate.update(sql, menuItem.getTitle(), menuItem.getPrice(), menuItem.getActive(),
					menuItem.getDateOfLaunch(), menuItem.getCategory(), menuItem.getFreeDelivery(),
					menuItem.getMenuItemId());
		}

	}

}

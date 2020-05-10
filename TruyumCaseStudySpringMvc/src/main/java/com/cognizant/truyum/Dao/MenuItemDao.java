package com.cognizant.truyum.Dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public interface MenuItemDao {

	List<MenuItem> getMenuItemListAdmin();

	List<MenuItem> getMenuItemListCustomer();

	MenuItem getMenuItemById(int id);

	void modifyMenuItem(MenuItem menuItem);
}

package com.cognizant.truyum.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.Dao.MenuItemDaoImpl;
import com.cognizant.truyum.model.MenuItem;

@Service
public class MenuItemService {

	@Autowired
	private MenuItemDaoImpl menuItemDaoImpl;

	public List<MenuItem> getMenuItemListAdmin() {
		List<MenuItem> listAdmin = menuItemDaoImpl.getMenuItemListAdmin();
		return listAdmin;

	}

	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> listCustomer = menuItemDaoImpl.getMenuItemListCustomer();
		return listCustomer;

	}

	public MenuItem getMenuItemById(int id) {
		return menuItemDaoImpl.getMenuItemById(id);
	}

	public void modifyMenuItem(MenuItem menuItem) {
		menuItemDaoImpl.modifyMenuItem(menuItem);
	}
}

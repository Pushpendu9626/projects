package com.cognizant.truyum.model;

import java.util.List;

public class CartItem {

	private List<MenuItem> menuItemList;
	private double price;

	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(List<MenuItem> menuItemList, double price) {
		super();
		this.menuItemList = menuItemList;
		this.price = price;
	}

	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CartItem [menuItemList=" + menuItemList + ", price=" + price + "]";
	}

}

package com.cognizant.truyum.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MenuItem {

	private Integer menuItemId;

	@NotNull(message = "Title is required")

	@Size(min = 2, max = 65, message = "Title should have 2 to 65 characters")
	private String title;

	@NotNull(message = "Price is required")
	private Double price;

	private String active;

	@NotNull(message = "Launch Date required")
	private Date dateOfLaunch;

	private String category;
	private String freeDelivery;

	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuItem(Integer menuItemId, String title, Double price, String active, Date dateOfLaunch, String category,
			String freeDelivery) {
		super();
		this.menuItemId = menuItemId;
		this.title = title;
		this.price = price;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}

	public Integer getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(Integer menuItemId) {
		this.menuItemId = menuItemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(String freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

	@Override
	public String toString() {
		return "MenuItem [menuItemId=" + menuItemId + ", title=" + title + ", price=" + price + ", active=" + active
				+ ", dateOfLaunch=" + dateOfLaunch + ", category=" + category + ", freeDelivery=" + freeDelivery + "]";
	}

}

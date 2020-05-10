package com.cognizant.truyum.Dao;

import com.cognizant.truyum.model.CartItem;

public interface CartDao {

	int addToCart(int menuItemid);

	CartItem getAllCartItems(int userId);

	int removeCart(int userId, int productId);
}

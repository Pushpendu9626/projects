package com.cognizant.truyum.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.Dao.CartDaoImpl;
import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.CartItem;

@Service
public class CartService {

	@Autowired
	private CartDaoImpl cartDaoImpl;

	public boolean addToCart(int menuItemId) {
		int result = cartDaoImpl.addToCart(menuItemId);
		if (result > 0) {
			return true;
		}
		return false;
	}

	public CartItem getAllCartItems(int userId) throws CartEmptyException {
		CartItem cartItems = cartDaoImpl.getAllCartItems(userId);

		if (cartItems.getPrice() == 0.0) {
			throw new CartEmptyException();
		}
		return cartItems;
	}

	public boolean removeCartItem(int userId, int productId) {
		int result = cartDaoImpl.removeCart(userId, productId);
		if (result > 0) {
			return true;
		}
		return false;

	}

}

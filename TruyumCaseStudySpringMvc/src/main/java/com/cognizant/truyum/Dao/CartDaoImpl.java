package com.cognizant.truyum.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.CartItem;
import com.cognizant.truyum.model.MenuItem;

@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addToCart(int menuItemid) {

		String sql = "insert into cart values(?,?)";
		int result = jdbcTemplate.update(sql, 1, menuItemid);

		return result;
	}

	@Override
	public CartItem getAllCartItems(int userId) {

		String sql = "select m.menuItemId, m.title,m.price,m.active,m.dateOfLaunch,m.category,m.freeDelivery from menuitem m ,cart c where c.productId=m.menuItemId and c.userId=?";
		CartRowMapper cartRowMapper = new CartRowMapper();
		List<MenuItem> cartList = jdbcTemplate.query(sql, cartRowMapper, userId);

		CartItem cartItem = new CartItem();
		cartItem.setMenuItemList(cartList);
		double cartPrice = 0.0;
		for (MenuItem menuItem : cartList) {
			cartPrice = cartPrice + menuItem.getPrice();
		}

		cartItem.setPrice(cartPrice);

		return cartItem;
	}

	@Override
	public int removeCart(int userId, int productId) {

		String sql = "delete from cart c where userId=? and productId=?";
		int result = jdbcTemplate.update(sql, userId, productId);

		return result;
	}

}

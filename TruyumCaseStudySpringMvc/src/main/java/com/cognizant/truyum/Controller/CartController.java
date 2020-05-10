package com.cognizant.truyum.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cognizant.truyum.Service.CartService;
import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.CartItem;
import com.cognizant.truyum.model.MenuItem;

@Controller
@SessionAttributes("list_customer")
public class CartController {

	@Autowired
	private CartService cartService;

	@GetMapping("/add-to-cart")
	public String addToCart(@RequestParam("menuItemId") int menuItemId, ModelMap model) {
		boolean result = cartService.addToCart(menuItemId);
		model.addAttribute("addCartStatus", result);
		@SuppressWarnings("unchecked")
		List<MenuItem> list = (List<MenuItem>) model.get("list_customer");
		model.addAttribute("list_customer", list);
		return "menu-item-list-customer";

	}

	@GetMapping("/show-cart")
	public String showCart(@RequestParam("userId") int userId, ModelMap model) {

		try {
			CartItem cartItems = cartService.getAllCartItems(userId);
			model.addAttribute("cartItemList", cartItems);
			return "cart";
		} catch (CartEmptyException e) {
			return "cart-empty";
		}

	}

	@GetMapping("/remove-cart")
	public String removeCart(@RequestParam("menuItemId") int menuItemId, @RequestParam("userId") int userId,
			ModelMap model) {
		try {
			boolean result = cartService.removeCartItem(userId, menuItemId);
			CartItem cartItems = cartService.getAllCartItems(userId);

			model.addAttribute("removeCartItemStatus", result);
			model.addAttribute("cartItemList", cartItems);

			return "cart";

		} catch (CartEmptyException e) {
			return "cart-empty";
		}

	}

}

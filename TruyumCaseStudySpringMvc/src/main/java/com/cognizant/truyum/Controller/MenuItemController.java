package com.cognizant.truyum.Controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.transaction.SystemException;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cognizant.truyum.Service.MenuItemService;
import com.cognizant.truyum.model.MenuItem;

@Controller
@SessionAttributes("list_customer")
public class MenuItemController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemController.class);

	@InitBinder
	public void dateInitBinder(WebDataBinder binder) {
		CustomDateEditor customDateEditor = new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), false);
		binder.registerCustomEditor(Date.class, customDateEditor);
	}

	@InitBinder
	public void stringInitBinder(WebDataBinder binder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@Autowired
	private MenuItemService menuItemService;

	@GetMapping("/show-menu-list-admin")
	public String showMenuItemListAdmin(ModelMap model) throws SystemException {
		LOGGER.info("Start");

		List<MenuItem> listAdmin = menuItemService.getMenuItemListAdmin();
		model.addAttribute("list", listAdmin);

		LOGGER.info("End");
		return "menu-item-list-admin";

	}

	@GetMapping("/show-menu-list-customer")
	public String showMenuItemListCustomer(ModelMap model) throws SystemException {
		LOGGER.info("Start");

		List<MenuItem> listCustomer = menuItemService.getMenuItemListCustomer();
		model.addAttribute("list_customer", listCustomer);

		LOGGER.info("End");
		return "menu-item-list-customer";

	}

	@GetMapping("/show-edit-menu-item")
	public String showEditMenuItem(@RequestParam("menuItemId") int menuItemID, ModelMap model) {
		LOGGER.info("Start");

		MenuItem menuItem = menuItemService.getMenuItemById(menuItemID);
		System.out.println(menuItem);
		model.addAttribute("menuItem", menuItem);

		LOGGER.info("End");
		return "edit-menu-item";

	}

	@PostMapping("/edit-menu-item")
	public String editMenuItem(@Valid @ModelAttribute("menuItem") MenuItem menuItem, BindingResult bindingResult) {
		LOGGER.info("Start");
		if (bindingResult.hasErrors()) {
			return "edit-menu-item";
		}

		menuItemService.modifyMenuItem(menuItem);

		LOGGER.info("End");

		return "edit-menu-item-status";

	}

}

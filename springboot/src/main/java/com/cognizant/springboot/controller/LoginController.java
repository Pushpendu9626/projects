package com.cognizant.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.springboot.model.User;
import com.cognizant.sprinigboot.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registrartion(@ModelAttribute("user") User user, ModelMap model) {
		
		boolean addUser = userService.addUser(user);
		
		if(addUser)
		{
			model.put("res",true);
		}
		
		return "login";



		
	}

	@RequestMapping(value = "/show_register", method = RequestMethod.GET)
	public String show_registration() {

		return "register";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, ModelMap model) {
		
		boolean validate = userService.validateUser(user);
		
		if(validate)
		{
			return "welcome";
		}
		
		return "invalid";



		
	}

}

package com.cognizant.springLearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springLearn.Country;
import com.cognizant.springLearn.service.CountryService;
import com.cognizant.springLearn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

	@Autowired
	private CountryService countryService;

	@RequestMapping("/country")
	public Country getCountryIndia() {
		LOGGER.info("Inside getCountryIndia method");
		return context.getBean("country", Country.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/countries")
	public List<Country> getAllCountries() {

		LOGGER.info("Inside getAllCountries method");
		return context.getBean("countryList", java.util.ArrayList.class);
	}

	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {

		return countryService.getCountry(code);

	}

}

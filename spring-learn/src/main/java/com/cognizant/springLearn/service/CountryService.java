package com.cognizant.springLearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springLearn.Country;
import com.cognizant.springLearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

	public Country getCountry(String code) throws CountryNotFoundException {
		@SuppressWarnings("unchecked")
		List<Country> countries = context.getBean("countryList", java.util.ArrayList.class);
		Country country = null;
		for (Country c : countries) {

			if (c.getCode().equalsIgnoreCase(code)) {
				country = c;
			}

		}
		if (country != null) {
			return country;
		}
		throw new CountryNotFoundException();

	}
}

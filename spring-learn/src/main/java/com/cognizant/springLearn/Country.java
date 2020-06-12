package com.cognizant.springLearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

	private String name;
	private String code;
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

	public Country() {

		super();
		LOGGER.debug("Inside Country Constructor");
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + "]";
	}

}

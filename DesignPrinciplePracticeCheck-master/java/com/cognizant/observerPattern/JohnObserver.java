package com.cognizant.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JohnObserver implements INotificationObserver {
	private static final Logger LOGGER = LoggerFactory.getLogger(JohnObserver.class);

	private String name = "John";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

	@Override
	public void OnServerDown() {
		LOGGER.info("Start");

		LOGGER.debug(name + "  has been received notification.");

		LOGGER.info("End");
	}

}
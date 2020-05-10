package com.cognizant.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteveObserver implements INotificationObserver {
	private static final Logger LOGGER = LoggerFactory.getLogger(SteveObserver.class);

	private String name = "Steeve";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SteeveObserver [name=" + name + "]";
	}

	public void OnServerDown() {
		LOGGER.info("Start");
		LOGGER.debug(name + " has been received notifications.");
		LOGGER.info("End");
	}
}
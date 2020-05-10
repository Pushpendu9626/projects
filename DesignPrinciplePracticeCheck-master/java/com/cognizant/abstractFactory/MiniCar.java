package com.cognizant.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCar extends Car {
	private static final Logger LOGGER = LoggerFactory.getLogger(MiniCar.class);

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	void construct() {
		LOGGER.info("Start");
		LOGGER.debug("Connecting to mini car.");
		LOGGER.info("End");
	}
}
package com.cognizant.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCar extends Car {
	private static final Logger LOGGER = LoggerFactory.getLogger(MicroCar.class);

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		LOGGER.info("Start");
		LOGGER.debug("Connecting to micro car.");
		LOGGER.info("End");
	}
}
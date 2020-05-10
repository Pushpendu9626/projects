package com.cognizant.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar extends Car {
	private static final Logger LOGGER = LoggerFactory.getLogger(LuxuryCar.class);

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		LOGGER.info("Start");
		LOGGER.debug("Connecting to luxury car.");
		LOGGER.info("End");
	}

}
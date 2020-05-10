package com.cognizant.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FurnitureOrder extends Order {

	static final Logger LOGGER = LoggerFactory.getLogger(ElectronicOrder.class);

	public FurnitureOrder(ChannelType channel, ProductType productType) {
		super(channel, productType);
	}

	@Override
	public void processOrder() {

		LOGGER.debug("Processing Order:::");
		LOGGER.debug("Product Type : " + productType);
		LOGGER.debug("Channel Type : " + channel);
	}

}
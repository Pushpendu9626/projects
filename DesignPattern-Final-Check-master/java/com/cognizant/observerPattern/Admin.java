package com.cognizant.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.abstractFactory.ElectronicOrder;

public class Admin extends INotificationObserver {
	static final Logger LOGGER = LoggerFactory.getLogger(ElectronicOrder.class);

	public Admin(INotificationService service, String name, int noOfTickets) {
		super(service, name, noOfTickets);
	}

	@Override
	public void nofication() {
		LOGGER.debug("Hello " + name + " .");
		LOGGER.debug("Please pay attention...Your event will start soon.");
	}
}
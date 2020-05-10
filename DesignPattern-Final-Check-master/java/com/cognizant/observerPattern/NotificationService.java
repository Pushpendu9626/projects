package com.cognizant.observerPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.abstractFactory.ElectronicOrder;

public class NotificationService implements INotificationService {
	static final Logger LOGGER = LoggerFactory.getLogger(ElectronicOrder.class);

	List<INotificationObserver> observers = null;

	public NotificationService() {
		super();
		observers = new ArrayList<INotificationObserver>();
	}

	public void addObserver(INotificationObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(INotificationObserver observer) {
		observers.remove(observer);
	}

	public void notifyObserver() {
		for (INotificationObserver observer : observers) {
			if (observer.getNoOfTickets() > 100) {
				observer.nofication();
			}
		}
	}

}
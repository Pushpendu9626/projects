package com.cognizant.observerPattern;

public class App {

	public static void main(String[] args) {

		INotificationService service = new NotificationService();

		INotificationObserver admin1 = new Admin(service, "John", 101);
		INotificationObserver admin2 = new Admin(service, "Steve", 110);
		INotificationObserver admin3 = new Admin(service, "Bob", 98);

		service.addObserver(admin1);
		service.addObserver(admin2);
		service.addObserver(admin3);

		service.notifyObserver();

	}

}
package com.cognizant.abstractFactory;

public class CarClient {

	public static void main(String[] args) {

		CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT);
		CarFactory.buildCar(CarType.MICRO, Location.USA);
		CarFactory.buildCar(CarType.MINI, Location.INDIA);
	}

}

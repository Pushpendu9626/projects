package com.cognizant.abstractFactory;

public class CarFactory {
	public static Car buildCar(CarType model, Location location) {
		if (location == Location.USA) {
			return new USACarFactory().getCar(model);
		} else if (location == Location.INDIA) {
			return new INDIACarFactory().getCar(model);
		}
		return new DefaultCarFactory().getCar(model);
	}
}
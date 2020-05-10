package com.cognizant.abstractFactory;

public class INDIACarFactory {
	public Car getCar(CarType model) {
		if (model == CarType.LUXURY) {
			return new LuxuryCar(Location.INDIA);
		} else if (model == CarType.MICRO) {
			return new MicroCar(Location.INDIA);
		}
		return new MiniCar(Location.INDIA);
	}
}
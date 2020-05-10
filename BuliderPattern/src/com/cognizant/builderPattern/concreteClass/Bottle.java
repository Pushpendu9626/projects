package com.cognizant.builderPattern.concreteClass;

import com.cognizant.builderPattern.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}

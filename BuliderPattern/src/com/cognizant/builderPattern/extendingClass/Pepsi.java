package com.cognizant.builderPattern.extendingClass;

import com.cognizant.builderPattern.abstractClass.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 20.0f;
	}

}

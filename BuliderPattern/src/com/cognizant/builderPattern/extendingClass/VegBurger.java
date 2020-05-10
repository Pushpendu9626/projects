package com.cognizant.builderPattern.extendingClass;

import com.cognizant.builderPattern.abstractClass.Burger;

public class VegBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

}

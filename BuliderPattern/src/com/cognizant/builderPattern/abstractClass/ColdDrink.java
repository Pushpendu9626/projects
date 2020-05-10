package com.cognizant.builderPattern.abstractClass;

import com.cognizant.builderPattern.Item;
import com.cognizant.builderPattern.Packing;
import com.cognizant.builderPattern.concreteClass.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}

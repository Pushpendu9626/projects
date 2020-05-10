package com.cognizant.builderPattern.abstractClass;

import com.cognizant.builderPattern.Item;
import com.cognizant.builderPattern.Packing;
import com.cognizant.builderPattern.concreteClass.Wrapper;

public abstract class Burger implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}

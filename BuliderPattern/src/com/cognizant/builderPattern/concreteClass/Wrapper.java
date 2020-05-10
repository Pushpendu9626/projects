package com.cognizant.builderPattern.concreteClass;

import com.cognizant.builderPattern.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}

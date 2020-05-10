package com.cognizant.abstractfactory.factory;

import com.cognizant.abstractfactory.model.Headlight;
import com.cognizant.abstractfactory.model.Tire;

public abstract class Factory {

	public abstract Headlight makeHeadlight();

	public abstract Tire makeTire();

}

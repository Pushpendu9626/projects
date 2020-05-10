package com.cognizant.abstractfactory.factory;

import com.cognizant.abstractfactory.Impl.MarcedesHeadlight;
import com.cognizant.abstractfactory.Impl.MarcedesTire;
import com.cognizant.abstractfactory.model.Headlight;
import com.cognizant.abstractfactory.model.Tire;

public class MercedesFactory extends Factory {

	public Headlight makeHeadlight() {
		Headlight h = new MarcedesHeadlight();
		h.classification();
		return h;
	}

	public Tire makeTire() {
		Tire t = new MarcedesTire();
		t.classification();
		return t;
	}
}

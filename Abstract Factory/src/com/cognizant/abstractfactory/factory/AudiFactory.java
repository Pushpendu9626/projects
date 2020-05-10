package com.cognizant.abstractfactory.factory;

import com.cognizant.abstractfactory.Impl.AudiHeadlight;
import com.cognizant.abstractfactory.Impl.AudiTire;
import com.cognizant.abstractfactory.model.Headlight;
import com.cognizant.abstractfactory.model.Tire;

public class AudiFactory extends Factory {

	public Headlight makeHeadlight() {
		Headlight h = new AudiHeadlight();
		h.classification();
		return h;
	}

	public Tire makeTire() {
		Tire t = new AudiTire();
		t.classification();
		return t;
	}

}

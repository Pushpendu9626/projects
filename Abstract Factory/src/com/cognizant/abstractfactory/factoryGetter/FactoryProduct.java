package com.cognizant.abstractfactory.factoryGetter;

import com.cognizant.abstractfactory.factory.AudiFactory;
import com.cognizant.abstractfactory.factory.Factory;
import com.cognizant.abstractfactory.factory.MercedesFactory;

public class FactoryProduct {

	public static Factory getFactory(String factoryType) {
		if (factoryType.equalsIgnoreCase("Audi")) {
			return (new AudiFactory());
		} else if (factoryType.equalsIgnoreCase("Mercedes")) {
			return new MercedesFactory();
		}
		return null;
	}

}

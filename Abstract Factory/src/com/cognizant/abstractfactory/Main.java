package com.cognizant.abstractfactory;

import com.cognizant.abstractfactory.factory.AudiFactory;
import com.cognizant.abstractfactory.factory.MercedesFactory;
import com.cognizant.abstractfactory.factoryGetter.FactoryProduct;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AudiFactory audiFactory = (AudiFactory) FactoryProduct.getFactory("Audi");
		audiFactory.makeHeadlight();
		audiFactory.makeTire();

		MercedesFactory mercedesFactory = (MercedesFactory) FactoryProduct.getFactory("Mercedes");
		mercedesFactory.makeHeadlight();
		mercedesFactory.makeTire();

	}

}

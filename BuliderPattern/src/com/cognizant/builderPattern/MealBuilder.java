package com.cognizant.builderPattern;

import com.cognizant.builderPattern.extendingClass.ChickenBurger;
import com.cognizant.builderPattern.extendingClass.Coke;
import com.cognizant.builderPattern.extendingClass.Pepsi;
import com.cognizant.builderPattern.extendingClass.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {

		Meal meal = new Meal();

		meal.addItem(new VegBurger());

		meal.addItem(new Coke());

		return meal;

	}

	public Meal prepareNonVegMeal() {

		Meal meal = new Meal();

		meal.addItem(new ChickenBurger());

		meal.addItem(new Pepsi());

		return meal;

	}
}
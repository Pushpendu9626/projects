package com.cognizant.builderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("Veg Meal");

		vegMeal.showItems();

		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal NonvegMeal = mealBuilder.prepareNonVegMeal();

		System.out.println("NonVeg Meal");

		NonvegMeal.showItems();
		System.out.println("Total Cost: " + NonvegMeal.getCost());

	}
}
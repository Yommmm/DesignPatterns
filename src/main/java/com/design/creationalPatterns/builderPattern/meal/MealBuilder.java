package com.design.creationalPatterns.builderPattern.meal;

import com.design.creationalPatterns.builderPattern.burger.ChickenBurger;
import com.design.creationalPatterns.builderPattern.burger.VegBurger;
import com.design.creationalPatterns.builderPattern.coldDrink.Coke;
import com.design.creationalPatterns.builderPattern.coldDrink.Pepsi;

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

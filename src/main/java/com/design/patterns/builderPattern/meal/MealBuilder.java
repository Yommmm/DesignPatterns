package com.design.patterns.builderPattern.meal;

import com.design.patterns.builderPattern.burger.ChickenBurger;
import com.design.patterns.builderPattern.burger.VegBurger;
import com.design.patterns.builderPattern.coldDrink.Coke;
import com.design.patterns.builderPattern.coldDrink.Pepsi;

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

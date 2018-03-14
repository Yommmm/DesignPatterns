package com.design.creationalPatterns.builderPattern;

import com.design.creationalPatterns.builderPattern.meal.Meal;
import com.design.creationalPatterns.builderPattern.meal.MealBuilder;

/**
 * 建造者模式
 * @author 170186
 *
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}

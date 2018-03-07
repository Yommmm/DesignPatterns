package com.design.creationalPatterns.builderPattern.coldDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 8.8f;
	}

}

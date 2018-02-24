package com.design.patterns.builderPattern.burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 28.8f;
	}

}

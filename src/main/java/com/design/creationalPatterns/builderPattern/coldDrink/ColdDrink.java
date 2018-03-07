package com.design.creationalPatterns.builderPattern.coldDrink;

import com.design.creationalPatterns.builderPattern.Bottle;
import com.design.creationalPatterns.builderPattern.Item;
import com.design.creationalPatterns.builderPattern.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}

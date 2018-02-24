package com.design.patterns.builderPattern.coldDrink;

import com.design.patterns.builderPattern.Bottle;
import com.design.patterns.builderPattern.Item;
import com.design.patterns.builderPattern.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}

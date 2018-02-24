package com.design.patterns.builderPattern.burger;

import com.design.patterns.builderPattern.Item;
import com.design.patterns.builderPattern.Packing;
import com.design.patterns.builderPattern.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
	
}

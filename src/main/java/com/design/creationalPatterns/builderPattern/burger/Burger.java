package com.design.creationalPatterns.builderPattern.burger;

import com.design.creationalPatterns.builderPattern.Item;
import com.design.creationalPatterns.builderPattern.Packing;
import com.design.creationalPatterns.builderPattern.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
	
}

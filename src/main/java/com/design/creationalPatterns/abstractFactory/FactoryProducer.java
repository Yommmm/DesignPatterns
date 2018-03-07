package com.design.creationalPatterns.abstractFactory;

import com.design.creationalPatterns.abstractFactory.color.ColorFactory;
import com.design.creationalPatterns.abstractFactory.shape.ShapeFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if(null == choice || "".equals(choice)) {
			return null;
		}
		
		if(choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		}
		
		if(choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		
		return null;
	}
}

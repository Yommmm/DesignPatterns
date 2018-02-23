package com.design.patterns.abstractFactory;

import com.design.patterns.abstractFactory.color.Color;
import com.design.patterns.abstractFactory.shape.Shape;

public abstract class AbstractFactory {

	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
	
}

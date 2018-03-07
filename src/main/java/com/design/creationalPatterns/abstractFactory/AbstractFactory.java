package com.design.creationalPatterns.abstractFactory;

import com.design.creationalPatterns.abstractFactory.color.Color;
import com.design.creationalPatterns.abstractFactory.shape.Shape;

public abstract class AbstractFactory {

	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
	
}

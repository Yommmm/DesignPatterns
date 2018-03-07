package com.design.creationalPatterns.prototypePattern;

public class Rectangle extends Shape {

	public Rectangle() {
		this.type = "Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("Rectangle");
	}

}

package com.design.patterns.prototypePattern;

public class Circle extends Shape {

	public Circle() {
		this.type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Circle");
	}

}

package com.design.patterns.prototypePattern;

public class Square extends Shape {

	public Square() {
		this.type = "Square";
	}
	
	@Override
	void draw() {
		System.out.println("Square");
	}

}

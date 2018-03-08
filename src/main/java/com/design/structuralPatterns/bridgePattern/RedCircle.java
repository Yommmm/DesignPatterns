package com.design.structuralPatterns.bridgePattern;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("RedCircle, radius:" + radius + ", x:" + x + ", y:" + y);
	}

}

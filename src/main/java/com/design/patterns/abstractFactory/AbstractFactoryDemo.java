package com.design.patterns.abstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = FactoryProducer.getFactory("color");
		abstractFactory.getColor("blue").draw();
	}
}

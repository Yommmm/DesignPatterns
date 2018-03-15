package com.design.behavioralPatterns.corPattern;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(ConsoleLogger.class.getName() + message);
	}

}

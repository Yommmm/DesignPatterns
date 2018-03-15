package com.design.behavioralPatterns.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order> orders = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		this.orders.add(order);
	}
	
	public void placeOrdersl() {
		for(Order order : orders) {
			order.execute();
		}
		this.orders.clear();
	}
	
}

package com.zclau.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return 0.99;
	}
}

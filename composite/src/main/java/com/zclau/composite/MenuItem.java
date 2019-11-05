package com.zclau.composite;

import java.util.Iterator;

/**
 * @author zclau
 */
public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void print() {
		for (int i = level; i > 0; i--) {
			System.out.print("   ");
		}
		System.out.print(getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.print(", " + getPrice());
		System.out.println("，" + getDescription());
	}

	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}


	@Override
	public String toString() {
		return "MenuItem{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", vegetarian="
				+ vegetarian + ", price=" + price + '}';
	}
}

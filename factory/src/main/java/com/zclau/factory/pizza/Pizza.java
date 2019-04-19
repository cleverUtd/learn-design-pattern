package com.zclau.factory.pizza;

import com.zclau.factory.ingredient.clams.Clams;
import com.zclau.factory.ingredient.cheese.Cheese;
import com.zclau.factory.ingredient.dough.Dough;
import com.zclau.factory.ingredient.pepperoni.Pepperoni;
import com.zclau.factory.ingredient.sauce.Sauce;
import com.zclau.factory.ingredient.veggies.Veggies;

public abstract class Pizza {

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clams;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

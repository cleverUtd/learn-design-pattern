package com.zclau.factory.store;

import com.zclau.factory.ingredient.NYPizzaIngredientFactory;
import com.zclau.factory.ingredient.PizzaIngredientFactory;
import com.zclau.factory.pizza.CheesePizza;
import com.zclau.factory.pizza.ClamPizza;
import com.zclau.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if ("cheese".equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if ("clam".equals(type)) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}

		return pizza;
	}
}

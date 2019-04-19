package com.zclau.factory.store;

import com.zclau.factory.ingredient.ChicagoPizzaIngredientFactory;
import com.zclau.factory.ingredient.PizzaIngredientFactory;
import com.zclau.factory.pizza.CheesePizza;
import com.zclau.factory.pizza.ClamPizza;
import com.zclau.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {


	@Override
	protected Pizza createPizza(String type) {

		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if ("cheese".equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if ("clam".equals(type)) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Frozen Clam Pizza");
		}

		return pizza;
	}
}

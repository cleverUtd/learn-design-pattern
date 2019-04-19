package com.zclau.factory;

import com.zclau.factory.pizza.Pizza;
import com.zclau.factory.store.ChicagoPizzaStore;
import com.zclau.factory.store.NYPizzaStore;
import com.zclau.factory.store.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

	}
}

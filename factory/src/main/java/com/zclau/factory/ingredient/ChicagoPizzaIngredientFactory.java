package com.zclau.factory.ingredient;

import com.zclau.factory.ingredient.cheese.Cheese;
import com.zclau.factory.ingredient.cheese.MozzarellaCheese;
import com.zclau.factory.ingredient.clams.Clams;
import com.zclau.factory.ingredient.clams.FrozenClams;
import com.zclau.factory.ingredient.dough.Dough;
import com.zclau.factory.ingredient.dough.ThickCrustDougn;
import com.zclau.factory.ingredient.pepperoni.Pepperoni;
import com.zclau.factory.ingredient.sauce.PlumTomatoSauce;
import com.zclau.factory.ingredient.sauce.Sauce;
import com.zclau.factory.ingredient.veggies.BlackOlives;
import com.zclau.factory.ingredient.veggies.Spinach;
import com.zclau.factory.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDougn();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[]{new BlackOlives(), new Spinach()};
	}

	@Override
	public Pepperoni createPepperoni() {
		return null;
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}

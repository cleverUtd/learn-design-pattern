package com.zclau.factory.ingredient;

import com.zclau.factory.ingredient.clams.Clams;
import com.zclau.factory.ingredient.clams.FreshClams;
import com.zclau.factory.ingredient.cheese.Cheese;
import com.zclau.factory.ingredient.cheese.ReggianoCheese;
import com.zclau.factory.ingredient.dough.Dough;
import com.zclau.factory.ingredient.dough.ThinCrustDough;
import com.zclau.factory.ingredient.pepperoni.Pepperoni;
import com.zclau.factory.ingredient.pepperoni.SlicedPepperoni;
import com.zclau.factory.ingredient.sauce.MarinaraSauce;
import com.zclau.factory.ingredient.sauce.Sauce;
import com.zclau.factory.ingredient.veggies.Mushroom;
import com.zclau.factory.ingredient.veggies.Onion;
import com.zclau.factory.ingredient.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[]{ new Onion(), new Mushroom()};
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}

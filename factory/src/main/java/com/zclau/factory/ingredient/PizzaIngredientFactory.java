package com.zclau.factory.ingredient;

import com.zclau.factory.ingredient.clams.Clams;
import com.zclau.factory.ingredient.cheese.Cheese;
import com.zclau.factory.ingredient.dough.Dough;
import com.zclau.factory.ingredient.pepperoni.Pepperoni;
import com.zclau.factory.ingredient.sauce.Sauce;
import com.zclau.factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}

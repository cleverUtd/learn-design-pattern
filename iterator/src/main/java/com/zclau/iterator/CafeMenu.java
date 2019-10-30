package com.zclau.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

	private Map<String, MenuItem> menuItems = new HashMap<>();

	public CafeMenu() {
		addItem("Veggie Burger and air Fries",
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
				true, 3.99);
		addItem("Soup of the day",
				"A cup of the soup of the day, with a side salad",
				false, 3.69);
		addItem("Burrito",
				"A large burrito, with whole pinto beans, salsa, guacamole",
				true, 4.29);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.put(item.getName(), item);
	}


	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
}

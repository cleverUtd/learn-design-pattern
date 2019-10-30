package com.zclau.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {

	private List<Menu> menus;

	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		for (Menu menu : menus) {
			printMenu(menu.createIterator());
		}
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}

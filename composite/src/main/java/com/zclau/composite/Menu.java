package com.zclau.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

	private String name;
	private String description;
	private List<MenuComponent> menuComponents = new ArrayList<>();

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponent.level = this.level + 1;
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		for (int i = level; i > 0; i--) {
			System.out.print("   ");
		}
		System.out.print(getName());
		System.out.println(", " + getDescription());
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent component = (MenuComponent) iterator.next();
			component.print();
		}
	}

	@Override
	public Iterator createIterator(String id) {
		return new CompositeIterator(menuComponents.iterator(), id, this);
	}


	@Override
	public String toString() {
		return "Menu{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", menuComponents="
				+ menuComponents + ", level=" + level + '}';
	}
}

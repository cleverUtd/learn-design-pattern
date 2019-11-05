package com.zclau.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

	private Stack<Iterator> stack = new Stack<>();
	private String id;
	private MenuComponent component;

	public CompositeIterator(Iterator iterator, String id, MenuComponent component) {
		stack.push(iterator);
		this.id = id;
		this.component = component;
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator iterator = stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu && (Math.abs(this.component.level - component.level) == 1)) {
				stack.push(component.createIterator(component.getName()));
			}
			return component;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}


}

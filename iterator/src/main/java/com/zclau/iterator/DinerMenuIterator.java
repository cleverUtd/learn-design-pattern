package com.zclau.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}

		return true;
	}

	@Override
	public Object next() {
		return items[position++];
	}
}
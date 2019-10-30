package com.zclau.iterator;

import java.util.Arrays;
import java.util.List;

public class MenuTestDrive {

	public static void main(String[] args) {
		List<Menu> menus = Arrays.asList(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}

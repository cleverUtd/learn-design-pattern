package com.zclau.iterator;

public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu menu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(menu, dinerMenu);
		waitress.printMenu();
	}
}

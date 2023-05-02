package com.coffee.method;

public class Menu {

	// {가격, 잔수}
	static int[][] menus = { { 1500, 0 }, { 2000, 0 }, { 2500, 0 } };
	// {이름}
	static String[] names = { "아메리카노", "카페라떼", "바닐라라떼" };

	// 메뉴판 출력
	void printMenu() {

		System.out.println("┌------------------------------┐");
		System.out.println();

		for (int i = 0; i < menus.length; i++) {
			System.out.printf(" [%d]\t%s\t\t%d원\n", i + 1, names[i], menus[i][0]);
		}

		System.out.println();
		System.out.println("└------------------------------┘");

	} // printMenu()

}

package com.coffe;

public class Coffe_Main {
	public static void main(String[] args) {
		Coffe_Method cm = new Coffe_Method();
		cm.PrintMenu();
		System.out.printf("메뉴 선택 : ");
		int menu = cm.input(); // 메뉴 입력
		System.out.printf("수량 선택 : ");
		int num = cm.input(); // 메뉴 입력
		String name = cm.printname(menu);
		System.out.printf("선택하신 메뉴는 \"%s\"이고, 잔수는 %d잔 입니다.\n",name,num);
		System.out.printf("돈을 입력해주세요 : ");
		int money = cm.input();
		int changes=cm.changes_Cal(menu, num, money);
		System.out.printf("잔돈은 %d원 입니다.",changes);
		
		
	}
}

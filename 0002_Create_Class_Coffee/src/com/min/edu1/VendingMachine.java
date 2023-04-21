package com.min.edu1;

import java.util.Scanner;

public class VendingMachine {
	static int balance = 0;
	static int userChoice = 0;
	static Scanner scan = new Scanner(System.in);
	
	public void makePayment() {
		int payment = 0;
		
		System.out.printf("입금 금액(숫자만 입력) : ");
		payment = scan.nextInt();
		balance += payment;
		System.out.println("----------------------------");
		System.out.println("잔액 : "+balance+"원");
	}
	
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
		Menu[] menus = new Menu[5];
		
		menus[0] = new Menu("아메리카노", 1500, 1);
		menus[1] = new Menu("카페라떼", 2000, 2);
		menus[2] = new Menu("바닐라라떼", 2500, 3);
		menus[3] = new Menu("초코라떼", 2500, 4);
		menus[4] = new Menu("얼그레이", 3000, 5);
	
		System.out.println("---------- <MENU> ----------");
		for(var i=0; i<5; i++) {
			menus[i].printMenu();
		}
		System.out.println("----------------------------");
		machine.makePayment();
		System.out.println("----------------------------");
		for(var i=0; i<5; i++) {
			menus[i].printMenu(balance);
		}
		System.out.printf("메뉴 번호(숫자만 입력) : ");
		userChoice = scan.nextInt();
		System.out.println("----------------------------");
		
		balance -= menus[userChoice-1].price;
		System.out.println("선택 음료 : "+menus[userChoice-1].name+", 거스름돈 : "+balance+"원");
	}
}
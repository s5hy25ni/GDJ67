package com.coffe;

import java.util.Scanner;

public class Coffe_Method {
	public void PrintMenu() {
		System.out.println("[1] | [아메리카노	] 	| 1,500원");
		System.out.println("[2] | [카페 라떼	]	| 2,000원");
		System.out.println("[3] | [바닐라 라떼	] 	| 2,500원");
	} //메뉴 출력

	public int input() {
		Scanner scann = new Scanner(System.in);
		int num = scann.nextInt();
		return num;
	}// 입력[메뉴, 수량, 금액]

	public String printname(int a) {
		String name = switch (a) {
		case 1 -> "아메리카노";
		case 2 -> "카페라떼";
		default ->"바닐라라떼";
		};
		return name;		
	}
	private int printPrice(int a) {
		int price = switch (a) {
		case 1 -> 1500;
		case 2 -> 2000;
		default ->2500;
		};
		return price;
	}
	
	public int changes_Cal(int menu, int num, int money) {
		return money-(printPrice(menu)*num);
	}
	public void endOrNot() {
		System.out.println("[1] | 추가 주문");
		System.out.println("[2] | 영수증 출력 후 종료");
		System.out.println("[3] | 영수증 미출력 종료");
	}
	public String one_bill(String name, int num, int price, int money) {
		String bill = name+" "+num+" "+num*price+"원\n";		
		return bill;
	}
	public void bill() {
		
	}

	
}



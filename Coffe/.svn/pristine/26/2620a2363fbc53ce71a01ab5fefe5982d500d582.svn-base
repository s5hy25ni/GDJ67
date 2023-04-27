package com.coffe;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 커피 자판기의 기능을 모아놓은 클래스
 * @author 정운, 현
 * @since 2023-04-26
 */
public class Coffe_Method {
	
	private int num = 0; // 메뉴 번호
	private String name = ""; // 메뉴 이름
	private int price = 0; // 메뉴 가격
	
	private int cup = 0; // 잔수
	private int money = 0; // 입금액
	private int change = 0; // 거스름돈
	
	private static int[][] order = new int[][] {{1, 0}, {2, 0}, {3, 0}}; // 메뉴별 총 잔수 카운트
	private static int totalMoney = 0; // 총 입금액
	private static int totalPrice = 0; // 총 가격
	
	/**
	 * 커피 주문 프로세스를 출력하는 메소드
	 * 메뉴판 출력 -> 사용자 입금 -> 메뉴 및 수량 선택 -> 주문 확인
	 */
	public void coffeeOrder() {
		// 메뉴판 출력
		printMenu();
		System.out.println();
		
		// 사용자가 입금
		System.out.printf(" ▶ 입금해주세요 : ");
		money = input();
		totalMoney += money;
		
		// 사용자가 메뉴 선택 및 선택한 메뉴 이름 저장
		System.out.printf(" ▶ 메뉴를 선택해주세요 : ");
		num = input();
		name = printName(num);
		
		// 사용자가 수량 선택 및 거스름돈 계산
		System.out.printf(" ▶ 수량을 선택해주세요 : ");
		cup = input();
		System.out.println();
		addBill(num, cup);
		totalPrice += printPrice(num)*cup;
		change = changes_Cal();
		
		// 주문 확인
		System.out.printf(" ▷ %s를 %d잔 주문하셨습니다.\n",name,cup);
		System.out.printf(" ▷ 잔액 : %d원\n",changes_Cal());
		System.out.println();
	}
	
	/**
	 * 메뉴판을 출력하는 메소드
	 */
	private void printMenu() {
		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println(" [1]	아메리카노 		1,500원");
		System.out.println(" [2]	카페 라떼 		2,000원");
		System.out.println(" [3]	바닐라 라떼 	2,500원");
		System.out.println();
		System.out.println("└------------------------------┘");
	} // 메뉴판 출력

	/**
	 * 사용자한테 입력받는 scanner 메소드
	 * @return int(메뉴 번호, 수량, 입금액)
	 */
	private int input() {
		Scanner scann = new Scanner(System.in);
		int num = scann.nextInt();
		return num;
	}// 입력[메뉴, 수량, 금액]
	
	/**
	 * 메뉴 번호를 입력받아 메뉴 이름을 반환하는 메소드
	 * @param num int 메뉴 번호
	 * @return String 메뉴 이름
	 */
	private String printName(int num) {
		String name = switch (num) {
		case 1 -> "아메리카노";
		case 2 -> "카페라떼";
		default ->"바닐라라떼";
		};
		return name;		
	}
	
	/**
	 * 메뉴 번호를 입력받아 메뉴 가격을 반환하는 메소드
	 * @param num int 메뉴 번호
	 * @return int 메뉴 가격
	 */
	private int printPrice(int num) {
		int price = switch (num) {
		case 1 -> 1500;
		case 2 -> 2000;
		default ->2500;
		};
		return price;
	}
	
	/**
	 * 총 입금액에서 총 가격을 빼서 거스름돈을 반환하는 메소드
	 * @return int 거스름돈
	 */
	private int changes_Cal() {
		return totalMoney-totalPrice;
	}
	
	/**
	 * 번호를 입력받아 추가 주문 또는 종료를 선택하는 메소드 
	 * @return int 선택한 메뉴 번호
	 */
	public int endOrNot() {

		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println("	[1] 추가 주문");
		System.out.println("	[2] 영수증 출력 종료");
		System.out.println("	[3] 영수증 미출력 종료");
		System.out.println();
		System.out.println("└------------------------------┘");
		System.out.print(" ▶ 선택 : ");
		
		return input();
	}
	
	/**
	 * 메뉴별 잔수를 누적하는 메소드
	 * @param num 추가하는 메뉴
	 * @param cup 추가잔수
	 */
	private void addBill(int num, int cup) {
		switch (num) {
		case 1 -> order[0][1] += cup;
		case 2 -> order[1][1] += cup;		
		default -> order[2][1] += cup;
		}
	}
	
	/**
	 * 누적된 주문을 합친 영수증을 출력하는 메소드
	 */
	public void printBill() {		
		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.printf(" [1] 총 입금액 		%d원\n",totalMoney);
		System.out.printf(" [2] 총 가격 		%d원\n", totalPrice);
		System.out.println();
		for (int i = 0; i < order.length; i++) {
			if(order[i][1]!=0) {
				System.out.printf("	%s	%d잔	%d원\n", printName(i+1), order[i][1], printPrice(i)*order[i][1]);
			}
		}
		System.out.println();
		System.out.printf(" [3] 거스름돈([1]-[2])  	%d원\n",changes_Cal());
		System.out.println();
		System.out.println("└------------------------------┘");
	}
	
}



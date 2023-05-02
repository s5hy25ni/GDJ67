package Coffe.Method;

import java.util.Scanner;

public class Util {
	/**
	 * int 값을 입력받는 메소드
	 * 입금, 메뉴 선택, 수량 입력 등에 쓰인다.
	 * @return int
	 */ 
	
	DTO data = new DTO();
	public int inputIntValue() {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("→");
		value = scan.nextInt();
		// value가 int가 아닐경우 error처리
		return value;
	} // inputIntValue()

	public char inputCharValue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("→");
		char value = scan.next().charAt(0);
		// value가 char가 아닐경우 error처리
		return value;
	} // inputCharValue()

	public char checkChar(char a) {
		while (a != 'Y' && a !='y' && a !='N' && a !='n') {
			System.out.printf("==========WARNING==========\n");
			System.out.printf("\t다시 입력해주세요\n");
			System.out.printf("==========WARNING==========\n");
			a = inputCharValue();
			continue;
		}
		return a;
	}	
	
	public int checkMoney(int a, int tp) { //금액 체크하는 메소드
		while (a<tp) {
			System.out.printf("==========WARNING==========\n");
			System.out.printf("\t금액이 모자릅니다. 최소 %d원 입금해주세요\n",tp);
			System.out.printf("==========WARNING==========\n");
			a = inputIntValue();
			continue;
		}
		return a;
	}
	
	public int checkInt(int a) { //숫자
		while (a>data.menu.length) {
			System.out.printf("==========WARNING==========\n");
			System.out.printf("\t다시 입력해주세요\n");
			System.out.printf("==========WARNING==========\n");
			a = inputIntValue();
			continue;
		}
		return a;
	}
}

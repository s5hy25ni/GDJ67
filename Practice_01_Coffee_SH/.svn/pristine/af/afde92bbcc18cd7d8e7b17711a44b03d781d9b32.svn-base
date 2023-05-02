package com.coffee.method;

import java.util.Scanner;

/**
 * 공통적으로 사용하는 기능들을 모아놓은 클래스
 * static 선언이 되어 있다.
 * @author 정운, 현
 * @since 2023-04-27
 */
public class Comm {
	
	/**
	 * default int totalMoney = 입금한 총 금액 누적
	 * default int totalPrice = 지불한 총 가격 누적
	 */
	static int totalMoney;
	static int totalPrice;

	/**
	 * int 값을 입력받는 메소드
	 * 입금, 메뉴 선택, 수량 입력 등에 쓰인다.
	 * @return int
	 */
	static int inputIntValue() {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		value = scan.nextInt();
		// value가 int가 아닐경우 error처리
		return value;
	} // inputIntValue()

	/**
	 * 입금 총 누적액에서 지불 총 누적액을 빼서 현재 잔액을 반환하는 메소드
	 * @return int 잔액
	 */
	static int chargeCal(){
		return totalMoney-totalPrice;
	} // chargeCal()

	/**
	 * 메뉴의 번호를 입력받아 메뉴의 이름을 반환하는 메소드
	 * @param num 메뉴 번호
	 * @return String 메뉴 이름
	 */
	static String returnName(int num){
		String name = switch(num){
		case 1->"아메리카노";
		case 2->"카페라떼";
		default->"바닐라라떼";
		};
		return name;
	 } // returnName();

	/**
	 * 
	 * @param num
	 * @return
	 */
	static int returnPrice(int num){
		  int price = switch(num){
		  case 1->1500;
		  case 2->2000;
		  default->2500;
		  };
	  return price;
	 } // returnPrice();
	
}

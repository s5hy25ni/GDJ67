package com.coffee.method;

import java.util.Scanner;

public class Util {
	/**
	 * int 값을 입력받는 메소드
	 * 입금, 메뉴 선택, 수량 입력 등에 쓰인다.
	 * @return int
	 */
	public int inputIntValue() {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		value = scan.nextInt();
		// value가 int가 아닐경우 error처리
		return value;
	} // inputIntValue()
}

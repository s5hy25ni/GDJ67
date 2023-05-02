package com.coffee.method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	/**
	 * int 변수를 입력받는 scanner 메소드
	 * @param req 입력받는 int에 대한 질문
	 * @return int 질문에 대한 답변
	 */
	public int inputIntValue(String req) {

		int value = 0;

		do {
			System.out.printf(req);

			try {
				Scanner scan = new Scanner(System.in);
				value = scan.nextInt();
				return value;
			} catch (InputMismatchException e) { // int 이외의 값 입력시 예외처리
				System.out.println(" ▷ 숫자만 입력해주세요.");
				continue;
			}

		} while (true);

	} // inputIntValue()

}

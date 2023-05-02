package com.min.method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
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
	
	public int[] inputConIntValue(int con, String req) {
		int[] values;
		values = new int[con];
		System.out.printf(req);
		
		for(int i = 0; i<con; i++) {
			try {
				Scanner scan = new Scanner(System.in);
				values[i] = scan.nextInt();
			} catch (InputMismatchException e) { // int 이외의 값 입력시 예외처리
				System.out.println(" ▷ 숫자만 입력해주세요.");
				i--;
				continue;
			}
		}
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		System.out.println(values[4]);
		System.out.println(values[5]);
		return values;
	}
}

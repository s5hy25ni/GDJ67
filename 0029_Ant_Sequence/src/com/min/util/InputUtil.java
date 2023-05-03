package com.min.util;

import java.util.Scanner;

/**
 * 키보드를 통해서 숫자만을 입력받는 클래스 *
 */
public class InputUtil {
	public static int inputNum() {
		int n = 0;
		
		while (true) {
			System.out.println("정수를 입력해주세요 : ");
			try {
				Scanner scan = new Scanner(System.in);
				n = scan.nextInt();
				if(n>2 && n<10) {					
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			} 
		}
		return n;
	}
}

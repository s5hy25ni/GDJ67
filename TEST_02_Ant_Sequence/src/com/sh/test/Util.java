package com.sh.test;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Util {
	
	public int inputIntValue() {
		int value = 0;
		
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {
				value = scan.nextInt();
				if(value>3 || value<10) {
					break;
				}else {
					System.out.println("3이상 10이하 숫자를 입력해주세요.");
				}
			}
			
		} catch (MissingFormatArgumentException e) {
			System.out.println("정수만 입력해주세요.");
		}
		return value;
	}
}

package com.min.edu;

import java.util.Scanner;

public class Exception_NotUsed {

	public int calculation() {
		int n = 0;
		
		try {
			Scanner scan = new Scanner(System.in);
			n = scan.nextInt();
		} catch (Exception e) {
//			throw new NullPointerException();
//			throw new UserDefindException("값이 이상햐");
		}
		
		
		return n;
	}
}

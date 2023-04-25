package com.min.edu;

public class While_Loop {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("while");
		while(x<2) {
			System.out.println(x++);
		}
//		while(true) {
//			System.out.print(x++);
//			if(x==1) {
//				break;
//			}
//		}
		System.out.println();
		System.out.println("do while");
		x = 0;
		do {
			System.out.print(x++);
		} while(x<2);
	}
	
}

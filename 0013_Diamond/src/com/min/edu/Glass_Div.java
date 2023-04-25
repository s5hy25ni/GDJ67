package com.min.edu;

public class Glass_Div {
	public Glass_Div(int n) {
		System.out.println("Glass_Div 생성자");
		printDecrease(n);
		printIncrease(n);
	}
	private void printDecrease(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("☆");
			} // 공백
			for (int j = 0; j < 2*(n-1-i)+1; j++) {
				System.out.print("★");			
			} // 그림
			System.out.println();
		}
	}
	private void printIncrease(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n-1-i; j++) {
				System.out.print("☆");
			} // 공백
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("★");			
			} // 그림
			System.out.println();
		}
	}
}

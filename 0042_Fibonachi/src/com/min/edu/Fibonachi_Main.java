package com.min.edu;

public class Fibonachi_Main {

	public static void main(String[] args) {

		System.out.println("피보나치의 수열 층 값 : "+fibonachi(5));
	}
	
	public static int fibonachi(int num) {
		
		if(num==1) {
			return 1;
		} else if(num==2) {
			return 1;
		} else {
			return fibonachi(num-1)+fibonachi(num-2);
		}
		
	}

}

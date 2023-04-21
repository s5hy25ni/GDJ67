package com.min.edu;

public class ReturnMain {

	public static void main(String[] args) {
		
		int result = ReturnMethodClass.cal(3, 3);
		System.out.println(result);
		
		ReturnMethodClass print = new ReturnMethodClass();
		print.add(2, 2);
	}

}

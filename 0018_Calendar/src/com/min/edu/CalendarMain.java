package com.min.edu;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar cal = new Calendar();
//		boolean test = cal.leapYear(4);
//		System.out.println(test);
//		test = cal.leapYear(100);		
//		System.out.println(test);
//		test = cal.leapYear(400);
//		System.out.println(test);
		int test = cal.totalDay(1, 1);
		System.out.println(test);
		test = cal.totalDay(1, 2);
		System.out.println(test);
		test = cal.totalDay(1, 3);
		System.out.println(test);
	}

}

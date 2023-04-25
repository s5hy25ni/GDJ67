package com.min.prac;

public class P8_Calendar {
	public void leapYear(int year) {
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}

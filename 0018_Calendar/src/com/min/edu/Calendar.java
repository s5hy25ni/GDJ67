package com.min.edu;

public class Calendar {
	private boolean leapYear(int year) {
		boolean result = false;
		
		// 4의 배수 포함 100의 배수는 미포함 400의 배수는 포함
		if(year%4==0 && year%100!=0 || year%400==0 ) {
			result = true;
		}
		return result;
	}
	public int totalDay(int year, int month) {
		int total = 0;
		for (int i = 1; i < year; i++) {
			if(leapYear(i)) {
				total += 366;
			} else {
				total += 365;
			}
		}
		System.out.println(total);
		for (int i = 1; i <= month; i++) {
			switch(i) {
			case 1,3,5,7,8,10,12 : 
				total+=31; 
				break;
			case 4,6,9,11 : 
				total+=30;
				break;
			case 2 :
				if(leapYear(year)) {
					total+=29;
				} else {
					total+=28;
				}
				break;
			default :
				break;
			}
		}
		return total;
	}
}

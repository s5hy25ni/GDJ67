package com.min.dir;

import java.util.Iterator;

public class Calendar_Method {

	private final int[] LEAP = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] PLAIN = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isCheckYear(int year) {
		boolean chk = false;
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			chk = true;
		}
		
		return chk;
	} // isCheckYear(int)
	
	public int getDayOfMonth(int year, int month) {
		int days = 0;
		if(isCheckYear(year)) {
			days = LEAP[month-1];
		} else {
			days = PLAIN[month-1];
		}
		return days;
	} // getDayOfMonth(int, int)
	
	public int calDays(int year) {
		int days = 0;
		
		for (int i = 1; i < year; i++) {
			if(isCheckYear(i)) {
				days += 366;
			} else {
				days += 365;
			}
		}
		return days;
	} // calDays(int)
	
	public int calDays(int year, int month) {
		int days = calDays(year);
		
		for (int i = 1; i < month; i++) {
			days += getDayOfMonth(year, i);			
		}
		return days;
	} // calDays(int, int)
	
	public int calDays(int year, int month, int date) {
		int days = calDays(year, month);
		days += date;
		
		return days;
	} // calDays(int, int, int)
	
	public void print_Calendar(int year, int month){
		
		System.out.printf("\t\t% d년 %d월\n",year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
 		int dayOfWeek = calDays(year, month, 1)%7;
 		
 		
 		
 		int dayOfPreMonth = 0;
// 		if(month==1) {
// 			dayOfPreMonth = 31;
// 		} else if(month==3){
// 			if(isCheckYear(year)) {
// 				dayOfPreMonth = 29;
// 			} else {
// 				dayOfPreMonth = 28;
// 			}
// 		} else {
// 			dayOfPreMonth = getDayOfMonth(year, month-1);
// 		}
 		
 		int startNum = dayOfPreMonth-dayOfWeek+1;
 		for (int i = 0; i < dayOfWeek; i++) {
			System.out.printf("%d\t", startNum++);
		}
 		
 		int dayOfMonth = getDayOfMonth(year, month);
 		for (int i = 1; i <= dayOfMonth; i++) {
 			System.out.printf("%d\t",i);
			if((i+dayOfWeek)%7==0) {
				System.out.println();
			}
		}

 		for (int i = 1; i <= 7-((dayOfWeek+dayOfMonth)%7); i++) {
			System.out.printf("%d\t",i);
		}
 		
 		
	} // print_Calendar(int, int)
	
}

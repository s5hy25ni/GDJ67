package com.min.dir;

import java.util.Iterator;
import java.util.Calendar;

public class Calendar_Method_API {

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
	
	Calendar cal = Calendar.getInstance();
	public void print_Calendar(int year, int month){	
		cal.set(year, month-1, 1);

		System.out.printf("\t\t% d년 %d월\n",year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1;
		int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayOfPreMonth = getPreMonth(year, month-1);
	
		int startNum = dayOfPreMonth-dayOfWeek+1;
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.printf("%d\t", startNum++);
		}
		

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

	public int getPreMonth(int year, int month){
		int days = 0;
		cal.set(year, month-1, 1);
		if(month == 1){
			days = 31;
		} else {
				days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		return days;
	}
	
}

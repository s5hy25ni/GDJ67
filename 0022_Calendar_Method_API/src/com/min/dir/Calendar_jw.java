package com.min.dir;

public class Calendar_jw {
	private final int[] LEAP = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] PLAIN = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isCheckYear(int year) {
		boolean isc = false;
		if(year%4==0 && year%100!=0 || year%400==0) {
			isc = true;
		}
		return isc;
	}
	
	public int getDayOfMonth(int year, int month) {
		int a = 0;
		if(isCheckYear(year)) {
			a = LEAP[month-1];
		} else {
			a = PLAIN[month-1];
		}
		return a;
	}
	
	public int calDays(int year) {
		int a = 0;
		for(int i=1; i<year; i++) {
			if(isCheckYear(i)) {
				a += 366;
			}
			else{
				a += 365;
			}
			
		}
		return a;
	}
	
	public int calDays(int year, int month) {
		int daySum = calDays(year);
		for(int i = 1; i<month; i++) {
			if(isCheckYear(year)) {
				daySum += LEAP[i-1];
			} else{
				daySum += PLAIN[i-1];
			}
		}
		return daySum;
	}
	
	public int calDays(int year, int month, int Date) {
		int totalday = calDays(year, month);
		totalday += Date;
		return totalday;
	}
	
}
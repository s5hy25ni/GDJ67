package com.min.dir;

public class Calendar_sh {
	private final int[] LEAP = {31,29,31,30,31,30,31,31,30,31,30,31};
	private final int[] PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isCheckYear(int year) {
		boolean chk = false;
		if(year%4==0 && year%100!=0 || year%400==0) {
			chk=true;
		}
		return chk;
	}
	
	public int getDayOfMonth(int year, int month) {
		int days = 0;
		if(isCheckYear(year)) {
			days = LEAP[month-1];
		} else {
			days = PLAIN[month-1];
		}
		return days;
	}
	
	public int calDays(int year) {
		int days = 0;
		for(int i = 1; i<year; i++) {
			if(isCheckYear(i)) {
				days += 366;
			}else {
				days += 365;
			}
		}
		return days;
	}
	
	public int calDays(int year, int month) {
		int days = calDays(year);
		for(int i = 1; i<month; i++) {
			if(isCheckYear(year)) {
				days += LEAP[i-1];
			} else {
				days += PLAIN[i-1];
			}
		}
		return days;
	}
	
	public int calDays(int year, int month, int date) {
		int days = calDays(year, month);
		days += date;
		return days;
	}
	
	public void print_Calendar(int year, int month) {
		System.out.printf("\t\t%d년%d월\n", year, month); // %d를 %로 씀
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		int dayOfWeek = (calDays(year, month, 1)+1-1)%7; // calDays(year, month)를 호출함
		int dayOfMonth = getDayOfMonth(year, month);
		
		int preMonth = 0;
		if(month==1) {
			preMonth = 31;
		} else if (month == 3) {
			if(isCheckYear(year)) {
				preMonth = LEAP[month-2];
			} else {
				preMonth = PLAIN[month-2];
			}
		} else {
			preMonth = PLAIN[month-2];
		}
		
		int startNum = preMonth - dayOfWeek +1;
		for(int i = 0; i<dayOfWeek; i++) {
			System.out.printf("%d\t",startNum);
			startNum++;
		}
		
		for(int i = 1; i<=dayOfMonth;i++) {
			System.out.printf("%d\t",i);
			if((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}
		
		for(int i = 1; i<=(7-((dayOfMonth+dayOfWeek)%7)); i++) {
			System.out.printf("%d\t",i);
		}
	}
	
}

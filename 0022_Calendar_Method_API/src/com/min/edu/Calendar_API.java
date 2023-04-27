package com.min.edu;

import java.util.Calendar;

public class Calendar_API {
	Calendar cal = Calendar.getInstance();
	
	public void print_Calendar(int year, int month) {
		cal.set(year, month-1, 1);
		System.out.printf("\t\t%d년도\t%d월\n",year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1; // 해당 연월일의 전 달의 마지막 요일
		int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int i = 0; i < dayOfWeek; i++) {
			System.out.printf("-\t");
		}
		
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.printf("%d\t",i);
			if((dayOfWeek+i)%7==0) {  
				System.out.println();
			}        
		}
	}
}

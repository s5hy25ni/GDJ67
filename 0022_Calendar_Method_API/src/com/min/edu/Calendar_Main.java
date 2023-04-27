package com.min.edu;
import java.util.Calendar;

public class Calendar_Main {
	public static void main(String[] args) {
		Calendar_Method calM = new Calendar_Method();
		
		/*
		 * calM.isCheckYear() TEST
		int yearSum = 0;
		for(int i = 1; i <= 2024; i++) {
			if(calM.isCheckYear(i)) {
				yearSum++;
			}
		}
		System.out.println(yearSum);
		
		 */
		
//		int maxDays = 0;
//		int year = 2024;
//		for (int i = 1; i <= 12; i++) {
//			maxDays += calM.getDayOfMonth(year, i);
//		}
//		System.out.println(maxDays);
//		
//		// 2024.3.1
//		maxDays = 0;
//		for (int i = 1; i <= 2023; i++) {
//			for (int j = 1; j <= 12; j++) {
//				maxDays += calM.getDayOfMonth(i, j);
//			}
//		}
//		for(int i = 1; i <= 2; i++) {
//			maxDays+= calM.getDayOfMonth(2024, i);
//		}
//		
//		System.out.println((maxDays+1)%7);
		
//		//TODO 문제1) 2024년 3월 1일 요일 구하기
//		// year : 1~2023, month : 1~2, day : 1
//		int leapNum = 0;
//		int plainNum = 0;
//		for(int i = 1; i < 2024; i++) {
//			if(calM.isCheckYear(i)) {
//				leapNum++;
//			} else {
//				plainNum++;
//			}
//		}
//		int year2024 = leapNum*366 + plainNum*365;
//		for(int i = 1; i < 3; i++) {
//			plainNum += calM.getDayOfMonth(2024, i);
//		}
//		
//		System.out.println((year2024+plainNum+1)%7);

//		System.out.println("1월 : "+calM.calDays(2023,1,1)%7);
//		System.out.println("2월 : "+calM.calDays(2023,2,1)%7);
//		System.out.println("3월 : "+calM.calDays(2023,3,1)%7);
//		System.out.println("4월 : "+calM.calDays(2023,4,1)%7);
//		System.out.println("5월 : "+calM.calDays(2023,5,1)%7);
//		System.out.println("6월 : "+calM.calDays(2023,6,1)%7);
//		System.out.println("7월 : "+calM.calDays(2023,7,1)%7);
//		System.out.println("8월 : "+calM.calDays(2023,8,1)%7);
//		System.out.println("9월 : "+calM.calDays(2023,9,1)%7);
//		System.out.println("10월 : "+calM.calDays(2023,10,1)%7);
//		System.out.println("11월 : "+calM.calDays(2023,11,1)%7);
//		System.out.println("12월 : "+calM.calDays(2023,12,1)%7);
		
//		calM.print_Calendar(2024, 2);
//		calM.print_Calendar(2024, 3);
		
//		System.out.println(calM.calDays(2024, 4));

		
//		Calendar_API api = new Calendar_API();
//		api.print_Calendar(2024, 4);

		
	}
}

package com.min.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

//TODO 001 java.util.Calendar의 API 사용방법
public class CalendarAPI_Use_Main {
	public static void main(String[] args) {
		// Calendar_API.java의 	
		// 		dayOfWeek(입력 연월일의 요일) : (연 누적 + 월 누적 + 일 누적 + 1년 1월 1일 요일 누적 -1)%7
		// 		dayOfMonth(입력 연월의 최대 일수) : array로 값이 고정, 윤년 -> LEAP, 평년 -> PLAIN
		
		// java의 달력 관련 클래스 제공 : java.util.Calendar
		// 날짜 관련 클래스 : java.util.Date(사용X), java.sql.Date, java.util.Calendar
		// java.util.Date d = new Date(2024, 3, 3); // Deprecate된 메소드 -> 사용 지양
		Calendar cal = Calendar.getInstance();
		Calendar gCal = new GregorianCalendar();
		
		System.out.println("현재 연도 : "+cal.get(Calendar.YEAR));
		System.out.println("현재 연도 : "+cal.get(Calendar.DAY_OF_WEEK)); // 일요일은 1로 시작
		
		// 입력값 세팅 month는 array로 되어 있어 입력시 -1 필요
		gCal.set(2023, 4, 1);
		
		
		System.out.println("현재 연도 : "+gCal.get(Calendar.YEAR));
		System.out.println("현재 연도 : "+gCal.get(Calendar.DAY_OF_WEEK)); // 일요일은 1로 시작
		System.out.println(gCal.toString());
		
		System.out.println("현재 월의 최대일 수 "+ gCal.getActualMaximum(Calendar.DAY_OF_MONTH));
}
}

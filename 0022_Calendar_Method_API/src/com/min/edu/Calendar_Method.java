package com.min.edu;

/**
 * 대중적으로 사용하는 그레고리안력을 분석하여 메소드로 구성된 만년달력을 만들어보자!<\b>
 * 1. 연도와 월을 입력하면 해당 연도와 월의 달력이 console에 출력된다.<\b>
 * 2. 연도를 입력하면 1년 달력이 모두 출력된다.<\b>
 * @author GDJ67
 * @version 1.0
 */
public class Calendar_Method {
	
	/**
	 * 각 월의 최대 일수는 고정 값으로 되어 있음.
	 * 따라서 초기값으로 설정
	 */

	/*
	 * final은 값을 고정한다. 
	 * 참조타입을 final로 선언하면 주소가 고정된다==값은 변경 가능하다.
	 * String은 값 변경이 가능하다.
	 */
	private final int[] LEAP = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] PLAIN = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	/**
	 * 입력된 연도의 윤년 여부를 확인하는 메소드<br>
	 * 윤년 == 4년에 1번이면서 100의 배수 연도는 아니고 400의 배수 연도
	 * @param year 판단하고자 하는 연도
	 * @return 윤년 true 평년 false 
	 */
	public boolean isCheckYear(int year) {
		boolean isc = false;
		if(year%4==0 && year%100!=0 || year%400==0) {
			isc = true;
		}
		return isc;
	}
	
	/**
	 * 입력받은 연도와 월의 최대 일수를 반환해주는 메소드
	 * @param year 입력 연도
	 * @param month 입력 월
	 * @return LEAP/PLAIN의 값
	 */
	public int getDayOfMonth(int year, int month) {
		int days = 0;
		
		if(isCheckYear(year)) {
			days = LEAP[month-1];
		} else {
			days = PLAIN[month-1];
		}
		return days;
	}
	
	/**
	 * 입력받은 연도 미만 까지의 연도를 윤년을 판단하여<br>
	 * 윤년은 366 평년은 365 더하여 누적값을 반환
	 * @param year 구하고자 하는 연도
	 * @return year 전까지의 총일수
	 */
	public int calDays(int year) {
		int days = 0;
		for(int i = 1; i<year; i++) {
			if(isCheckYear(i)) {
				days += 366;
			} else {
				days += 365;
			}
		}
		return days;
	}
	
	/**
	 * 해당연도의 입력 월 미만까지의 각 월의 최대일 수 누적
	 * @param year 월의 윤년판단 값
	 * @param month 누적해야할 1월부터 해당 월 전까지의 기준 월
	 * @return 연도 누적 + 월 누적 일수
	 */
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
	
	/**
	 * 연도 월 일을 누적하여 해당 연도.월.일의 총 일수를 반환 
	 * @param year 해당 연도
	 * @param month 해당 월
	 * @param date 해당 일
	 * @return year년 month월 date일의 총 일수
	 */
	public int calDays(int year, int month, int date) {
		int days = calDays(year, month);
		days += date;

		return days;
	}
	
	public void print_Calendar(int year, int month) {
		System.out.printf("\t\t%d년도\t%d월\n",year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int dayOfWeek = (calDays(year, month, 1)+1-1)%7; // 해당 연월일의 전 달의 마지막 요일
		int dayOfMonth = getDayOfMonth(year, month);

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
	
	/**
	 * 입력받은 월이 1월이라면 index를 벗어나게 된다.
	 * 따라서 1월 year-1 month 12월로 고정
	 * 아니라면 year, month-1로 값을 변경하여
	 * getDayOfMonth(int, int)를 호출하여 값을 리턴
	 * @param year
	 * @param month
	 * @return
	 */
	private int getDayOfMonthCheck(int year, int month) {
		int resultDate=0;
		
		if(month == 1) {
			resultDate = getDayOfMonth(year-1, 12);
		}else {
			resultDate = getDayOfMonth(year, month-1);
		}
		return resultDate;
	}
}

package com.sh.edu;

/**
 * 연도와 월을 입력받아 달력을 출력해주는 클래스의 기능들을 모아놓은 클래스이다.
 * @author sohyeon
 * @since 2023-04-25
 *
 */
public class Calendar {
	
	private int[] leap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int[] plain = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	/**
	 * 연도를 입력받아 해당 연도가 윤년인지 판단하는 메소드
	 * @param year 연도
	 * @return boolean 윤년 true, 평년 false
	 */
	private boolean isChkleap(int year) {
		boolean result = false;
		
		// 4의 배수 포함 100의 배수는 미포함 400의 배수는 포함
		if(year%4==0 && year%100!=0 || year%400==0 ) {
			result = true;
		}
		return result;
	}
	
	/**
	 * 연도와 월을 입력받아 해당 연도.월의 최대 일수를 반환해주는 메소드
	 * @param year 입력 연도
	 * @param month 입력 월
	 * @return leap 또는 plain 값
	 */
	public int getDayOfMonth(int year, int month) {
		int days = 0;
		
		if(isChkleap(year)) {
			days = leap[month-1];
		} else {
			days = plain[month-1];
		}
		
		return days;
	}
	
	/**
	 * 입력받은 연도 미만 까지의 연도를 윤년을 판단하여<br>
	 * 윤년은 366 평년은 365 더하여 누적값을 반환
	 * @param year 구하고자 하는 연도
	 * @return year 전까지의 총일ㄴ수
	 */
	public int calDays(int year) {
		int days = 0;
		for(int i = 1; i<year; i++) {
			if(isChkleap(i)) {
				days += 366;
			} else {
				days += 365;
			}
		}
		return days;
	}
	
	public int calDays(int year, int month) {
		int days = calDays(year);
		for(int i = 1; i<month; i++) {
			if(isChkleap(i)) {
				days += leap[i-1];
			} else {
				days += plain[i-1];
			}
		}
		return days;
	}
	
	public int calDays(int year, int month, int date) {
		int days = calDays(year);
		for(int i = 1; i<month; i++) {
			if(isChkleap(i)) {
				days += leap[i-1];
			} else {
				days += plain[i-1];
			}
		}
		return days;
	}
	
	
	/**
	 * 연도와 월을 입력받아 해당 연도 해당 월 1일의 요일을 반환하는 메소드
	 * @param day 총 일수
	 * @return int 요일(0:일, 1:월, 2:화, 3:수, 4:목, 5:금, 6:토
	 */
	private int dayOfWeek(int year, int month, int date) {
		int day = calDays(year, month, date);
		return day%7;
	}
}

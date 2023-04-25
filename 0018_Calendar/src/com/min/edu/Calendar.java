package com.min.edu;
/**
 * 연도와 월을 입력받아 달력을 출력해주는 메소드의 기능들을 모아놓은 클래스이다.
 * @author sohyeon
 * @since 2023-04-25
 *
 */
public class Calendar {
	/**
	 * 연도를 입력받아 해당 연도가 윤년인지 판단하는 클래스
	 * @param year 연도
	 * @return boolean 윤년이면 true, 평년이면 false
	 */
	private boolean leapYear(int year) {
		boolean result = false;
		
		// 4의 배수 포함 100의 배수는 미포함 400의 배수는 포함
		if(year%4==0 && year%100!=0 || year%400==0 ) {
			result = true;
		}
		return result;
	}
	
	/**
	 * 연도를 입력받아 직전 연도까지의 총 일수를 반환하는 클래스
	 * @param year 연도
	 * @return int 직전 연도까지의 총 일수
	 */
	private int yearToDay(int year) {
		int total = 0;
		for (int i = 1; i < year; i++) {
			if(leapYear(i)) {
				total += 366;
			} else {
				total += 365;
			}
		}
		return total;
	}
	
	/**
	 * 연도와 월을 입력받아 해당 연도의 해당 월의 1일까지의 총 일수를 반환하는 클래스
	 * @param year 연도
	 * @param month 월
	 * @return int 해당 연도 해당 월의 1일까지의 총 일수
	 */
	private int totalDay(int year, int month) {
		int total = 0;
		for (int i = 1; i < month; i++) {
			switch(i) {
			case 1,3,5,7,8,10 : 
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
		total += (yearToDay(year)+1);
		return total;
	}
}

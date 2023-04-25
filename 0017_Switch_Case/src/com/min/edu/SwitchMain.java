package com.min.edu;

public class SwitchMain {
	// 1) switch~case문 = 선택조건문
	// 2) if문(범위)과 다르게 선택된 한 개의 값만을 실행
	// 비교대상이 정수이다.
	// fall-through : break문이 없으면 하위 case도 다 실행
	public static void main(String[] args) {
		int x = 2;
		switch (x) {
		case 1:
			System.out.println("1");
			break;
		case 2:			
			System.out.println("2");
			break;

		default:
			System.out.println("X");
			break;
		} // 1) switch
		
		// 2)java7 1.7.0.5 버전부터 문자열 영역이 heap에 포함되면서
		// switch case문의 비교값으로 사용이 가능
		String str = "맑음";
		switch (str) {
		case "맑음":
			System.out.println("맑음");
			break;
			
		default:
			System.out.println("날씨가 추움");
			break;
		}
	}
	
}

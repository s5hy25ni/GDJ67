package com.min.edu;

import java.util.Arrays;

/*
 * Enum 클래스
 * 열거식 혹은 열거형 나열 기법
 * 열거형은 명명된 상수의 고정 목록으로 구성된 유형
 * 1) enum 클래스
 * 2) 이름과 상수 요소를 쉼표로 구분된 코드 블럭으로 작성
 * 
 * 열거형에 대한 엑세스 수준은 클래스와 동일
 * 패키지는 기본적으로 비공개이지만 동일한 이름의 파일에 선언된 경우 공개로 설정 가능
 * 
 */
public class Enum_Main {

	public static void main(String[] args) {
		// 1. Enum 타입은 static과 같은 방법으로 사용
		// 2. 하지만 변수의 타입은 반드시 Enum 타입이어야 함
		
		Speed s = Speed.SLOW;
	
		// key와 value가 같은 타입이어야 함
		switch (s) {
		case STOP: System.out.println("멈춤"); break;
		case SLOW: System.out.println("천천히"); break;
		case NOMAL: System.out.println("일반속도"); break;
		case FAST: System.out.println("빠르게"); break;
		default:
			break;
		}
		
		SpeedValue sv = SpeedValue.NOMAL;
		System.out.println(sv.velocity);
		
		// 주요 메서드
		SpeedValue[] a = SpeedValue.values();
		String sName = a[0].toString();
		System.out.println(sName);
		System.out.println(Arrays.toString(a));
		
		SpeedValue b = SpeedValue.valueOf(sName); // Speed.STOP
		System.out.println(b);
	}
}

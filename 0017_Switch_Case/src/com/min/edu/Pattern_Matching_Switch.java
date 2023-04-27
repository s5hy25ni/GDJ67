package com.min.edu;

public class Pattern_Matching_Switch {
	/*
	 * java17 미리보기 java20 미리보기 기능
	 * switch문 및 표현식에 대한 패턴일치 추가
	 * 비교는 숫자, 문자, 문자열거형 유형(Enum)의 타입만 대상이 됨
	 * 동일한 패턴의 타입이라면 판단을 통해 결정되도록 만듦
	 * 
	 * Long 타입과 일치하면 실행되는 코드를 작성
	 */

//	public void pattern_Check() {
//		Object obj = 5L; // long 타입의 값을 object로 만듦 -> 처음 들어간 애가 long타입이라면 이후 값도 long타입
//		
//		String myType = switch(obj) {
//		case null->"null";
//		case Integer i->"정수(Integer)의 값입니다."+i; // obj가 Integer로 변환될 수 있으면 i에 담긴 후 i;
//		case long l->"정수(long)의 값입니다."+l;
//		default->obj.toString();
//		}
//		
//	}
}

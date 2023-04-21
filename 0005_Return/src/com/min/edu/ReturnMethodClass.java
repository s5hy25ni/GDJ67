package com.min.edu;

public class ReturnMethodClass {
	
	//TODO 001 리턴은 void와 type으로 구성
	// 메소드를 실행했을떄 반환되는 값을 이야기 합니다.
	
	// 1) 요구사항에 맞춰 반환되는 타입 선정 : cal()을 실행하면 int 값을 리턴한다.
	// 2) void가 아니라면 반환되는 타입을 선언하고 초기화한다.
	// 3) 작성된 변수를 return 예약어를 사용하여 작성한다.
	// 4) 연산을 작성하고 연산된 결과는 초기화한 변수에 담아준다.
	/**
	 * 두 개의 정수를 입력받아 몫을 계산하는 메소드
	 * @param x 분자가 되는 값
	 * @param y 분모가 되는 값
	 * @return 입력받은 정수 두 개를 나누어진 몫 반환
	 */
	public static int cal(int x, int y) {
		int result = 0;
		
		result = x/y;
		
		return result;
	}
	
	//TODO 002 정수 두 개를 입력 받아 더하는 연산 결과를 출력하는 메소드
	/**
	 * 두 개의 정수를 입력받아 더한 결과를 출력하는 메소드(순서에 상관 없이)
	 * @param x 정수
	 * @param y 정수
	 */
	public void add(int x, int y) {
		int result = x+y;
		System.out.println(result);
		
	}
}

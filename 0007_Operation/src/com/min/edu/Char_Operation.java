package com.min.edu;

public class Char_Operation {
	// char는 3개의 리터럴을 가진다.
	// 기본 표현값, Unicode 값, 정수(int) 값
	
	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;

		System.out.print("코코아");
		System.out.println(" 맛있다.");
		System.out.printf("%s에 %s를 섞으면 %d배 맛있다.\n", "커피", "복숭아티", 2);		
		
		System.out.println(c1); // 기본값
		System.out.println(c2); // int값
		
		String s = Integer.toHexString(65);
		System.out.println(s);
		char c3 = '\u0041';
		System.out.println(c3);
		
		//TODO 001 Casting과 Promotion : 기본타입
		// Casting은 특정 형태로 강제로 변경하는 작업
		// ex) double d = 3.11; int i = (int)d;
		// Promotion은 캐스팅 연산자를 사용하지 않고 변경되는 작업(작은 것 -> 큰 것)
		// ex) int a = 10; long l = a;
		int idxA = 65;
//		char c4 = idxA;
		char c4 = (char)idxA;
		short idxB = 65;
		char c5 = (char)idxB;
		System.out.println(c4);
		System.out.println(c5);
		int c6 = c4;
		
		char c7 = (char)(c4 + 1); // 연산은 무조건 정수 연산 c4 -> int로 변환
		System.out.println(c7);
		
		int c8 = 'a'-0;
		System.out.println(c8);
	}
	
}

package com.min.edu;

public class Arithmatic_Operation {
	//TODO 001 수학연산
	public void math() {
		int a = 3;
		byte b = 2;
		
		// 자바 연산의 특징 : 정수 연산의 결과는 모두 정수, 값은 int
		// byte + byte = int
		// short + short = int
		// int + int = int
		// 예외적으로 참여하는 정수의 크기가 long이면 결과도 long
		byte b1 = 2;
		byte b2 = 2;
		int bSum = b1+b2;
		
		short s1 = 10;
		long l1 = 1;
		long lSum = s1+l1;
		
//		float x = 3+2;
		float x = a+b;
		float y = a+b;
		x = 3-1; // subtraction, 2
		x = 3*2; // 6
		x = 3/2; // 1
		x = 3%2; // 1
	
		System.out.println();
	} // math()
	
	public void divsion_sign() {
		// 실수 연산의 경우는 잘못된 결과를 가져오는 경우가 많음
		// 참여하는 연산의 타입에 따라 결과 반환
		long calL = 10/5; 
		
		float x1 = 3/2; // 1.0
		float x2 = 3/2f; // 1.5
		System.err.println(x2);
		
		float x3 = 3/2.0f; // 1.5
		float x4 = (float)3/2; // 1.5
		float x5 = 3/(float)2; // 1.5
		float x6 = (float)(3/2); // 1.0
	}
}

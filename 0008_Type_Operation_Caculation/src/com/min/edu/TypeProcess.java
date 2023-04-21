package com.min.edu;

public class TypeProcess {
	// 멤버필드란?
	// 접근제한자를 가지고 있는 변수
	// 선언만 하면 자동으로 초기화
	// new를 통해 사용해야 함
	
	public void calculation() {
		byte b1 = 127;
		byte b2 = 1;
		int bSum = b1 + b2; // 프로모션이 아니라 원래 int(정수형의 연산은 int 연산)
		// 캐스팅 연산자는 int의 크기에서 8bit를 빼고 제거하기 때문에 
		// 연산된 10000000을 byte로 처리하면 1은 부호비트가 되어 결과는 -128
		byte bSumb = (byte)(b1 + b2); 
		System.out.println(bSumb);
		int iConvert = bSumb;
		System.out.println(iConvert);
		
		byte b3 = 2;
		byte bSumb2 = (byte)(b1 + b3);
		System.out.println(bSumb2);
		
		float f = 10.0f;
		// 나누기 연산시 캐스팅 연산자 사용
		float fDiv = f/2;
//		float dDiv = 10/2.0; // 참여하는 2.0의 값은 double의 리터럴
//		float dDiv = 10f/2.0;
		float dDiv = (float)(10f/2.0);
		
		float iDiv = 10/3;
		float iDivT = (float)(10/3);
		
	}
	
	public void floatValueConfirm() {
		// 부동소수점
		// 0.1를 10번 더해서 1이 나오게 하는 법? String으로 전환해야함
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}
}

package com.min.edu.type;

public class Data_Type {

	//TODO 001 선언과 대입
	public void declaring_assignment() {
		int val; // 사용되는 타입의 변수명 선언(declaring)
		val = 10; // 선언된 변수에 값 대입(assignment)
		
		int newVal = 10; // 선언과 대입을 동시에 할 수 있다.
		
		System.out.println("선언된 변수명을 호출하면 입력된 값을 가져온다 : "+val);
		
	}
	
	//TODO 002 java의 기본 타입의 종류
	public void dataTypeKind() {
		// 정수형 : byte short int long
		// 실수형 : float double
		// 문장형 : char
		// 논리형 : boolean
	}
	
	//TODO 003 정수 타입
	public void integerType() {
		byte b = 2; // -128 ~ 127
		short s = 2; // -32,768 ~ 32,767
		int i = 2;
		long l = 2;
		
		// 리터럴 표기법
		int hex = 0xF; // hexadecimal 16진수 -> 15
		int oct = 07; // octal 8진수 -> 7
		int bin = 0b01; // binary 2진수 (1.7부터 사용) -> 1
		
		int bicNumber = 1_000_000;
		
		System.out.println(hex+" "+oct+" "+bin);
	}
	
	//TODO 004 실수 타입
	public void floatType() {
		double d = 3.14;
		double d2 = 3e2; // 지수표기법 (10^2)
		
		// java에서의 실수는 항상 값을 double를 가짐
		// 따라서 float타입을 선언하여 값을 입력하는 경우는 리터럴 처리를 해줘야 한다.
		// 접미어 f, F
		float f = 0.11F;
		double d3 = 3.11;
		float fc = (float)d3; // 캐스팅(casting) 연산자
	}
	
	//TODO 005 문자형(Unicode Charchter)
	public void charType() {
		// 문자형은 '(single quote)를 통해서 값을 선언
		char a = 'A';
		
		// 모든 문자형은 unicode 표현식인 16진수로 입력가능
		char aa = '\u0000';
		char aaa = 65;
	}
	
	//TODO 006 논리형(java에서는 true/false의 예약어로만 사용 가능)
	public void booleanType() {
		boolean isc1 = true;
		// boolean isc2 = true+1; (X) -> 다른 언어와 다르게 논리값과 연산이 안됨

		//## &, &&
		System.out.println(3&3); 
	}
	
	//TODO 007 var 타입
	// java 10 로컬변수는 var로 선언 -> 컴파일러가 할당에 따라 변수 유형을 자동으로 결정
	// 1) var타입은 local variable에서만 가능 -> 사용 후 바로 사라지는 변수
	// 2) 할당된 변수의 유형이 분명한 경우 선언을 줄이고 가독성을 높이기 위해 사용
	public void varType() {
		var i1 = "한글~";
		int i2 = 5;
		System.out.println(i1);
		System.out.println(i2);
	}	
}

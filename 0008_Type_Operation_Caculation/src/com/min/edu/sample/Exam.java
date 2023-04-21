package com.min.edu.sample;

public class Exam {

	// char 숫자를 int 숫자로 변경
	// '9' -> 9
	// '0' -> 0
	public void charnumToNum() {
		char n = '9';
		int nToI = n;
		System.out.println(nToI);
		
		int result = n - 48;
		System.out.println(result);
		
		char z = 48;
		System.out.println(z);
		
		int cal = n - '0';
		System.out.println(cal);
		
		int cal2 = '0' - n;
		System.out.println(Math.abs(cal2));
		
	}
	
	// 'A' -> 'Z'
	public void charToChar() {
		char a = 'A';
		char z = 'Z';
		System.out.printf("A값 : %d, Z값 : %d\n", (int)a, (int)z);
		
		a = (char)(a + Math.abs(a-z));
		System.out.println("변경된 A의 값 : " + a);
	} //charToChar()
	
	// 123번에 있는 unicode의 값을 출력하세요.
	public void charIndex() {
		int num = 123;
		System.out.println(Integer.toHexString(num));
		char cha = 123;
		System.out.println('\u007b');
		System.out.println(cha);
	}
}

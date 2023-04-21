package com.min.edu;

public class IncludStatic {
	
	private static int num = 10;

	public void make() {
		System.out.println("일반 메소드 make");
		//TODO TEST001 같은 클래스의 static 멤버 호출
		// 호출 가능
		staticPrint();
		System.out.println(Math.PI); // java.lang package는 암묵적 import
		System.out.println(num);
		
	}
	
	public void print() {
		System.out.println("일반 메소드 print");

	}
	
	public static void staticPrint() {
		System.out.println("static 메소드 staticPrint");
		//TODO TEST002 static에서 non-static 호출
		// 호출 불가
		// but new를 통해 메모리를 할당하면 호출 가능
		IncludStatic is = new IncludStatic();
		is.make();
	}
}

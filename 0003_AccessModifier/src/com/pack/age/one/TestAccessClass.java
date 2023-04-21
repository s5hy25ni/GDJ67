package com.pack.age.one;

//TODO 001 모든 접근제한자를 가지고 있는 테스트 클래스
public class TestAccessClass {

	//TODO TEST001 같은 클래스의 메소드에서 접근제한자 확인하기
	private void test001() {
		publicMethod();
		protectedMethod();
		privateMethod();
		defaultMethod();
	}
	
	//TODO 002 public 메소드
	public void publicMethod() {
		System.out.println();
		System.out.println("public");
	}
	//TODO 003 (default) 메소드
	void defaultMethod() {
		System.out.println();
		System.out.println("default");
	}
	//TODO 004 protected 메소드
	protected void protectedMethod() {
		System.out.println();
		System.out.println("protected");
	}
	//TODO 005 private 메소드
	private void privateMethod() {
		System.out.println();
		System.out.println("private");
	}
	
}

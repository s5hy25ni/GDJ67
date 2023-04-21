package com.min.edu.scope;

//TODO 008 변수의 사용 범위
public class VariableScope {

	// ----------- 멤버필드 -------------
	int age;
	public boolean isc;
	public String name;
	private int cnt=9;
	public static int num;
	// -------------------------------
	
	// ---------- 멤버메소드 -------------
	public int getCnt() {
		int result = this.cnt;
		
		return result;
	}
	
	public void cal() {
		int a;
		// System.out.println(a);
		System.out.println(name); // 멤버필드 생성 후 메소드 생성
		int cnt = 10; // 다른 영역에 있으면 같은 이름으로 선언 가능
		System.out.println(cnt); // local이 최우선 -> 10
		System.out.println(this.cnt); // 내 필드 -> 9
	}
	// -------------------------------
}

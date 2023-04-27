package com.min.test;

public class Operation {
	
	
	public void opb() {
		int n = 0;
		// 값이 아닌 값을 반환하는 것도 가능
		boolean isc1 = (n==0)?a():b();
		boolean isc2 = (n==0)?a():b();
		// 문법은 맞으나 c()의 반환타입이 다르기 때문
//		boolean isc3 = (n==0)?a():c();
		// 반환값 서로가 타입이 같아야 하는 게 아니라 담는 그릇이랑 같아야 한다.
		Object isc3_1 = (n==0)?a():c();
		
		// 문법이 다름 -> 반환 타입이 있어야 함
//		boolean isc4 = (n==0)?a():v();
		
	}
	public void v() {
		
	}
	public boolean a() {
		return true;
	}
	
	public boolean b() {
		return false;
	}
	
	public String c() {
		return "a";
	}
}

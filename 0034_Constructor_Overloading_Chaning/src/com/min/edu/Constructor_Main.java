package com.min.edu;

public class Constructor_Main {
	public static void main(String[] args) {
//		ChildClass cc = new ChildClass();
		
		// c1, c2, c3 생성자를 호출한 것
		// c1, c2, c3 생성자를 부모를 생성하기 위한 super()를 각각 가지고 있음 
		ChildClass c1 = new ChildClass();
		ChildClass c2 = new ChildClass(10);
		ChildClass c3 = new ChildClass(10, 20);
		
	}
}

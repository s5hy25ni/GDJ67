package com.min.edu.step01;

public class Generic_Main {

	public static void main(String[] args) {
		//TODO 002 MyBox 사용
		// 기존의 객체는 한 개의 타입을 입력받고 담을 수 있음
		// 하지만 제네릭으로 생성된 객체는 사용시 타입의 작성을 통해 선언되기 때문에 타입의 제한이 없음
		
		MyBox<String> name = new MyBox<String>();
		MyBox<Integer> age = new MyBox<Integer>();
		
		name.box = "동그라미";
		age.box = 10;
		System.out.printf("%s / %d\n", name.box, age.box);
		
		//TODO 003 java7 부터 비어있는 타입의 선언이 가능함
		MyBox<Integer> iBoxc = new MyBox<>();
		iBoxc.box = 5;
		Integer i = iBoxc.box;
		System.out.println(i);
		
//		iBoxc.box = "Hello World"; // compile error
//		String s = iBoxc.box; // compile error
		
		
	}
}

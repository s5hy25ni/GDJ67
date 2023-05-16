package com.min.edu;

public class LamdaExam2_variable {

	void method(int age) {
		int localVariable = 10;
		
//		age = 100; // 람다표현식에서 사용되기 때문에 age는 final 특성이 부여됨
//		localVariable = 100; // 위와 동일
		MyFunction f = () -> {
			System.out.println("age : "+age);
			System.out.println("localVariable : "+localVariable);
		};
		f.method();
	}
}

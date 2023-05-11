package com.min.edu.step02;

public class Generic_Main2 {

	//TODO 006 제네릭 메소드/생성자 사용
	public static void main(String[] args) {
		MyGenericClass mg = new MyGenericClass(10);
		
		System.out.println(mg.getS()); // 문자열의 값을 출력
		
		Boolean[] arrB = {true, false, true, true};
		MyGenericClass.printArray(arrB);
		MyGenericClass.<Boolean>printArray(arrB);
	}

}

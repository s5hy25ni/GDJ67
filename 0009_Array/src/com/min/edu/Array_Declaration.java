package com.min.edu;

import java.util.Scanner;

/*
 * 자바의 타입
 * 기본타입(primitive) 프로그램에서 기본으로 제공되어 stack에서 사용되어 지는 것
 * 참조타입(reference) Class로 되어있고 heap에 생성되어 주소와 hashcode를 가지고 있음
 * java.lang => 자동으로 값이 기본타입<->참조타입 변경이 이루어진다 AutoBoxing AutoUnBoxing
 * java.lang.String : 문자열은 문자형이 조합되어 있는 형태 => 참조타입
 * array : 같은 타입의 변수를 한 번에 묶기 위해 -> 호출은 인덱스로, 클래스가 아니므로 호출을 new로 안하고 생성자도 없음
 * 
 * Class가 없는 객체 [](Array)
 */
public class Array_Declaration {
	public static void main(String[] args) {
//		Object obj = new Scanner(System.in); // java 최상위 타입 object
		//TODO 001 Array의 선언방법
		//null  이름만 있고 객체는 없는 상태
		int[] x;
		
		// new를 통해 객체를 생성하면서 값을 입력함
		int[] arr1 = new int[] {1,2,3};
		
		// 코드블럭???? 연산자블럭????
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		Array_Declaration array = new Array_Declaration();
		System.out.println(array);
		
		// 값을 입력하여 객체를 생성
		int[] arr2 = {1,2,3};
		
		// 개체의 공간만 생성 -> 생성하는 타입의 default value로 초기값이 생성
		int[] arr3 = new int[3];
		
		//TODO 002 입력과 출력
		// array는 객체이기 때문에 변수의 값은 객체를 찾아가는 주소로 되어있음
		// [int index]를 사용하여 해당 인덱스의 값을 출력 혹은 입력할 수 있음
		arr3[1] = 100;
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		System.out.println(arr3.length);
		
		float a = 1.0f + 2.0f;
		
//		arr3[3] = 100; // runtime 오류 
//		System.out.println(arr2[4]);
	}
}

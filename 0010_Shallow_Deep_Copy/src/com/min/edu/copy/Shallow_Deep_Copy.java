package com.min.edu.copy;

import java.util.Arrays;

public class Shallow_Deep_Copy {
	public void shallow() {
		// pass by reference : 참조타입 특징
		// 값을 복제하는 것이 아닌 같은 객체를 사용할 수 있도록 주소를 전달하는 것
		// 주소를 전달한다는 것의 의미는 같은 객체를 바라보고 있다는 것
		
		// == 비교연산자
		// 기본타입을 비교연산하면 값을 비교함
		// 참조타입을 비교연산하면 객체의 메모리 주소를 비교함
		
		// 변수(기본타입)의 특징
		// 한 번 값이 입력되면 다시 입력하기 전까지는 기존 값을 유지
		int i1 = 10;
		int i2 = 20;
		System.out.println(i1==i2); // false
		i2 = 10;
		System.out.println(i1==i2); // true
		
		int[] arr1 = {1, 2, 3}; // 새로운 생성 => heap 영역에 주소와 해시코드가 생성
		int[] arr2 = {1, 2, 3}; // 새로운 생성 => heap 영역에 주소와 해시코드가 생성
		int[] arr3 = arr1; // shallow copy => 주소 전달
		System.out.println(arr1==arr2); // false
		System.out.println(arr1==arr3); // true => 주소가 같다 = 같은 객체이다.
		
		System.out.println("원본 : "+Arrays.toString(arr1));
		System.out.println("복사 : "+Arrays.toString(arr3));
		
		arr3[2] = 100;
		System.out.println("원본 : "+Arrays.toString(arr1));
		System.out.println("복사 : "+Arrays.toString(arr3));
	
	} // shallow()
	
	//TODO 002 java Array의 복사방법
	// java의 array는 크기를 늘리거나 줄이는 것이 불가능함
	// 1) stack 이용 -> for문
	// 2) heap 이용 -> clone
	// 3) 메모리 사용
	public void deep() {
		String[] strs = {"d","r","e","a","m"};
		//1) stack
		String[] strs_C1 = new String[strs.length];
		for (int i = 0; i < strs_C1.length; i++) {
			strs_C1[i] = strs[i]; // array의 출력 -> stack으로 가져와서 넣어줌
		}
		
		//2) heap
		String[] strs_C2 = strs.clone();
		
		//3) 메모리(System) 원본 파일, 원본에서 시작점, 목적지, 목적지 시작점, 시작인덱스부터 복제할 갯수
		String[] strs_C3 = new String[5];
		System.arraycopy(strs, 0, strs_C3, 1, 2);
		
		strs[0] = "k"; // 원본값이 바뀌어도 복사값이 바뀌지 않는다.
		System.out.println("원본 : "+Arrays.toString(strs));
		System.out.println("stack 복사 : "+Arrays.toString(strs_C1));
		System.out.println("heap 복사 : "+Arrays.toString(strs_C2));
		System.out.println("메모리 복사 : "+Arrays.toString(strs_C3));

	} // deep()
}

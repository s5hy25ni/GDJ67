package com.min.edu;

import java.util.Arrays;
import java.util.Iterator;

public class Array_20230424 {
	public static void main(String[] args) {
		String[] strs = new String[3];
		
		/*
		 * array => length
		 * 문자열(String) => *.length();
		 * JCF(Map, Set, List) => *.size(); 
		 */
		System.out.println("Array의 길이 : "+strs.length);
		
		/*
		 * 길이는 1부터 시작, index는 0부터 시작
		 * index의 범위를 벗어난 값(index)을 입력하면 예외 발생 ArrayIndexOutOfBounceException 
		 */
		strs[1] = "월요일";
		for (int i = 0; i < strs.length; i++) {
			System.out.printf("index: %d / 값: %s \n", i, strs[i]);
		}
		
		// n차원 Array
		int[][] nArray = {{1, 2}, {3, 4}, {5, 6}};
		
		// Array 존재하지 않는 타입 = 클래스가 없음
		// 클래스 = 멤버 = 멤버필드 + 멤버메소드
		// Array는 멤버필드로만 이루어져 있음
		// java.util.Arrays : Array의 기능을 모아놓음
		
		Arrays.fill(strs, "값"); // pass by reference
		String print = Arrays.toString(strs); // 출력할때만 사용! 안에 공백이 있음
		System.out.println(print);
		
		strs[1] = "하이";
		Arrays.sort(strs);
		String print1 = Arrays.toString(strs); // 출력할때만 사용! 안에 공백이 있음
		System.out.println(print1);
		
		
	} // main();
}

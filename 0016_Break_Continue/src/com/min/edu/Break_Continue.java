package com.min.edu;

import java.util.Iterator;

public class Break_Continue {
	public static void main(String[] args) {
		// loop 내에서 사용할 수 있는 두 가지 특수 키워드
		// break, continue
		// 1) break : loop 구조를 종료
		// 2) continue : 현재 반복 나머지를 부분을 건너뛰고 다음 반복을 시작
		
		for (int i = 0; i < 10; i++) {
			if(i==5) {
				break; // 종료 조건에 따른 for문의 코드블럭을 벗어남
			} else if(i==3) {
				continue;
			}
			System.out.println(i);
		} // for문의 끝
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i%2==1) {
				continue;
			} 
			sum += i;
		}
		System.out.println(sum);
	}
}

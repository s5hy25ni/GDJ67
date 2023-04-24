package com.min.edu;

import java.util.Arrays;

public class If {

	public static void main(String[] args) {
//		int sum_a = 0; // 짝수 합
//		int sum_b = 0; // 홀수 합
//		int cnt = 0; // 반복의 횟수
//
//		for (int i=0; i<10; i++) {
//			if((i+1)%2 == 0) {
//				sum_a += (i+1);
//			} else {
//				sum_b += (i+1);
//			}
//			cnt++;
//		} // for 끝
//		
//		System.out.printf("짝수 합 : %d, 홀수 합 : %d, 총 반복 횟수 : %d", sum_a, sum_b, cnt);
		
		String aG = "";
		String bG = "";
		String cG = "";
		
		
		for (int i = 0; i < 9; i++) {
			if((i+1)%3==0){
				aG += (i+1);
				
			} else if((i+1)%3==2) {
				bG += (i+1);
				
			} else {
				cG += (i+1);
			}
			
		}
		System.out.println(aG);
		System.out.println(bG);
		System.out.println(cG);
	}

}

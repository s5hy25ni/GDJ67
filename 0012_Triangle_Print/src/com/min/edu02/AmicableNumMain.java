package com.min.edu02;

import java.util.Scanner;

public class AmicableNumMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		String perfectNum = "";
		String AmicableNum = "";
		
		int num_sum = ProperDivisor.properDivisorSum(num);
		
		if( num == num_sum ) {
			System.out.printf("%d는 완전수입니다.", num);
		}
		else if (num == ProperDivisor.properDivisorSum(num_sum)) {
			System.out.printf("%d와 %d는 친화수입니다.", num, num_sum);
		} else {
			System.out.printf("%d는 친화수가 없습니다.", num);
		}

	}

}

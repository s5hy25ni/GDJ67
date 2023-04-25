package com.min.edu;

/*
 * TODO 003 친화수
 * 220 -> 진약수의 합 284
 * 284 -> 진약수의 합 220
 * 
 * 1) 약수여부를 판단
 * 2) 진약수의 합을반환
 * 3) 친화수를 판단하는 메소드
 */
public class FriendlyNum {
	// true는 약수
	public boolean isCheck(int num, int ch) {
		boolean isc = false;
		if(num%ch == 0) {
			isc = true;
		}
		return isc;
	}
	
	public int sum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(isCheck(num, i)) {
				sum += i;
			}
		}
		return sum;
	}

	public void firendlyProcess(int area) {
		for (int i = 2; i < area; i++) {
//			for (int j = 2; j < area; j++) {
//				if(i == sum(j)&&j==sum(i)) {
//					System.out.printf("%d와 %는 친화수입니다.\n",i ,j);
//				}
//				if(i!=j&&i<j&&i==sum(j)&&j==sum(i)) {
//					System.out.printf("%d와 %는 친화수입니다.\n",i ,j);
//				}
//			}
			int a = i;
			int b = sum(a);
			int c = sum(b);
			if(a<b && a!=b && a==c) {
				System.out.printf("%d와 %는 친화수입니다.\n",a ,b);
			}
		}
	}
}

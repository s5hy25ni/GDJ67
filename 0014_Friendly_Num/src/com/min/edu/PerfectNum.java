package com.min.edu;

/*
 * TODO 002 완전수
 * 진약수의 합이 자신의 숫자가 되는 것 (ex) 6 => 1+2+3 = 6
 * 1) 두 개의 정수를 입력받아 진약수를 판단하는 메소드 
 * 2) 1)번을 사용하여 true -> 그 값을 누적
 * 3) n까지의 범위를 가지면서 2)를 사용하여 비교한 후 같으면 완전수를 출력해주는 메소드
 */
public class PerfectNum {

	private boolean isCheck(int num, int chkNum) {
		boolean isc = false;
		if(num%chkNum==0) {
			isc = true;
		}
		return isc;
	}
	
	private int yaksuSum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(isCheck(num, i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	public void perfectNum(int area) {
		for (int i = 4; i <= area; i++) { // 1은 자기자신, 2,3은 소수
			if(i==yaksuSum(i)) {
				System.out.printf("%d는 완전수로 판단됨\n", i);
			}
		}
	}
}

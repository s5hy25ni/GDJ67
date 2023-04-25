package com.min.edu;

public class PerfectNum_SH {
	public boolean cheakYaksu(int num, int chkNum) {
		return (num%chkNum==0)?true:false;
	}
	
	private int sumYaksu(int num) {
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			sum = (cheakYaksu(num, i))?sum+i:sum;
		}	
		return sum;
	}
	
	public void printPerfectNum(int num) {
		System.out.println((sumYaksu(num)==num)?num:"완전수가 아님");
	}
}

package com.min.edu;

public class Yaksu_SH {

	private boolean cheakYaksu(int num1, int num2) {
		
		boolean result = true;

		if(num1%num2==0) {
			result = true;
		} else {
			result = false;
		}

		return result;
		
		
	}
	
	public void accYaksu(int num1) {
		int sum = 0;
		String yaksu = "";
		for (int i = 0; i < num1; i++) {
			if(cheakYaksu(num1, i+1)) {
				sum += i+1;
				yaksu += i+1+" ";
			}		
		}
		System.out.println("약수 모음 : "+yaksu);
		System.out.println("약수의 합 : "+sum);
	}
}

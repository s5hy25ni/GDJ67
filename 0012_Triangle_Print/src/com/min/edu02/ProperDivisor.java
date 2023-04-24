package com.min.edu02;

public class ProperDivisor {
	public static int properDivisorSum(int num) {
		int result = 0;
		
		for(int i=0; i<(num-1); i++) {
			if(num%(i+1)==0) {
				result += (i+1);
			}
		}
		
		return result;
	}
}

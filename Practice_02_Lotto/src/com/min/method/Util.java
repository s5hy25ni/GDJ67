package com.min.method;

public class Util {
	boolean checkDup(int[] nums, int chkNum) {
		boolean isc = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == chkNum) {
				isc = true;
				break;
			}
		}
		return isc;
	}
}

package com.min.method;

import java.util.Arrays;

public class Lotto {
	private int[] selNums;
	private boolean manual = false;

	public Lotto(int size) { // size가 6이면 자동, size가 7이면 winLotto
		selNums = new int[size];
		for (int i = 0; i<size; i++) {
			if()
		}
	}

	public Lotto(int[] userSelNums) { // arguments가 int[]이면 수동
		selNums = new int[userSelNums.length];
		for (int i = 0; i < selNums.length; i++) {
			selNums[i] = userSelNums[i];
		}
		manual = true;
	}
	
	public Lotto(int[] userSelNums, int autoStart) {
		
	}

	private void autoLotto(int[] newNums) {
		int idx = 1;
		while (true) {
			int num = randomNum();
			if (!checkDup(idx, num)) {
				newNums[idx++] = num;
			}
			if (idx == newNums.length) {
				break;
			}
		}
	}

	private int randomNum() {
		int num = (int) (Math.random() * 45) + 1;
		return num;
	}
	
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
	
	@Override
	public String toString() {
		return "Lotto [nums=" + Arrays.toString(nums) + ", manual=" + manual + "]";
	}
}

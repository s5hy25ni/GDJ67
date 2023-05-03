package com.min.method;

import java.util.Arrays;

public class Lotto {
	private int[] nums;
	private boolean manual = false;

	public Lotto(int size) { // size가 6이면 자동, size가 7이면 winLotto
		nums = new int[size];
		inputNums(nums);
	}

	public Lotto(int[] userNums) { // arguments가 int[]이면 수동
		nums = new int[userNums.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = userNums[i];
		}
		manual = true;
	}

	private void autoLotto(int[] newNums) {
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
	
	@Override
	public String toString() {
		return "Lotto [nums=" + Arrays.toString(nums) + ", manual=" + manual + "]";
	}
}

package com.sh.method;

import java.util.Arrays;

public class Lotto {
	Util u = new Util();
	
	private int[] nums;
	private String type;

	public Lotto(String type) {
		this(type, 6);
	} 
	
	public Lotto(String type, int size) {
		this(type, new int[size]);
	}
	
	public Lotto(String type, int[] nums) {
		this.type = type;
		this.nums = createNums(nums);
	}

	private int[] createNums(int[] nums) {
		int[] temp = new int[nums.length];
		int autoStart = 0;
		for (int i = 0; i < temp.length; i++) {
			if(nums[i]==0) {
				autoStart = i;
				break;
			}
			temp[i] = nums[i];
		}
		for (int i = autoStart; i < temp.length; i++) {
			temp[i] = randomLottoNum(temp);
		}
		if(!this.type.equals("당첨")) {			
			Arrays.sort(temp);
		}
		return temp.clone();
	} // createAutoLotto(int[])

	private int randomLottoNum(int[] reqAutoNums) {
		int num;
		
		while(true) {
			num = u.randomNum(45) + 1;
			if(!u.checkDup(reqAutoNums, num)) {
				return num;
			}			
		}
	} // randomNum(int[])

	public int[] getNums() {
		return nums.clone();
	}
	
	public String getType() {
		return type;
	}
}

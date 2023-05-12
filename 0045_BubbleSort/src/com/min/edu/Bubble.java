package com.min.edu;

import java.util.Arrays;
import java.util.Comparator;

public class Bubble {

	public static void main(String[] args) {
		String[] nums = {"01", "08", "02", "06", "11"};
		Arrays.sort(nums);
		for(int i =0; i<nums.length; i++) {
			System.out.println(nums[i] + "."+nums[i].hashCode());
		}
		System.out.println(Arrays.toString(nums));
		
		String[] numStr = {"1", "8", "2", "6", "11"};
		Arrays.sort(numStr);
		System.out.println(Arrays.toString(numStr));
		for (int i = 1; i < numStr.length; i++) {
			for (int j = 0; j < numStr.length-i; j++) {
//				int tmp = Integer.parseInt(numStr[j]);
				if(Integer.parseInt(numStr[j])>Integer.parseInt(numStr[j]+1)) {
					String tmp = numStr[j];
					numStr[j] = numStr[j+1];
					numStr[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numStr));
		
	}
	
	public void sort_compare() {
		int[] arrayI = new int[] {10,1,2,3,4};
		Arrays.sort(arrayI); // 오름차순
		System.out.println(Arrays.toString(arrayI));
		
		int[] arrayIre = new int[arrayI.length];
		for (int i = 0; i < arrayI.length; i++) {
			arrayIre[arrayI.length-1-i] = arrayI[i];
		}
		
		System.out.println(Arrays.toString(arrayIre));
		
		Integer[] arr = {1, 26, 17, 25, 99, 44, 303};
		String[] arrS = {"1", "26", "17", "25", "99", "44", "303"};
		
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i1-i2; // i1-i2 는 오름차순, i2-i1은 내림차순
			}
		});
		
		Arrays.sort(arrS, new Comparator<String>() {
			@Override
			public int compare(String i1, String i2) {
				return Integer.parseInt(i1)-Integer.parseInt(i2);
			}
		});
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrS));
	}
	
}

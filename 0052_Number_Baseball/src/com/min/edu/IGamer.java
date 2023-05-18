package com.min.edu;

public interface IGamer {

	public void make();
	default void print(int[] box) {
		int n = box.length;
		System.out.printf( "[");
		for (int i = 0; i < n-1; i++) {
			System.out.printf("%s,", box[i]);
		}
		System.out.printf("%s]", box[n-1]);
	}
	
}

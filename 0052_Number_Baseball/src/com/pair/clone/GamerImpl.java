package com.pair.clone;

import java.util.Arrays;

import com.min.edu.IGamer;

public abstract class GamerImpl implements IGamer {
	
	protected int[] box;

	public GamerImpl(int n) {
		box = new int[n];
		Arrays.fill(box, -1);
	}
	
	@Override
	public abstract void make();

	@Override
	public String toString() {
		String result = "[";
		int n = box.length;

		for (int i = 0; i < n-1; i++) {
			result += box[i]+",";
		}
		result += box[n-1]+"]";
		return result;
	}

	public int[] getBox() {
		return box;
	}
	
	
}

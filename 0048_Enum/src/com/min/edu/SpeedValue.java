package com.min.edu;

public enum SpeedValue {

	STOP(0), SLOW(5), NOMAL(10), FAST(20);
	
	public int velocity;
	private SpeedValue(int s) {
		velocity = s;
	}
}

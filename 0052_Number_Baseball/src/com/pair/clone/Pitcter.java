package com.pair.clone;

public class Pitcter extends GamerImpl {

	public Pitcter() {
		this(3);
	}
	
	public Pitcter(int n) {
		super(n);
	}

	@Override
	public void make() {
	}
	
	public int makeNum() {
		int n = 0;
		
		n = (int)( Math.random() * 9)+1;
		
		return n;
	}
	
	public boolean checkBox(int randomNum) {
		boolean isc = false;
		int n = box.length;
		
		for (int i = 0; i < n; i++) {
			if(box[n]==randomNum) {
				isc = true;
				break;
			}
		}
		return isc;		
	}
}

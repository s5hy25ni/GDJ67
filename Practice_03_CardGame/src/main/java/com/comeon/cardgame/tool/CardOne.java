package com.comeon.cardgame.tool;

import java.util.Objects;

public class CardOne {

	private String one;
	
	public static final String[] SHAPE = {"♣","♥","◆","♠"};
	public static final String[] NUMBER= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public CardOne() {
		int s = (int)(Math.random()*SHAPE.length);
		int n = (int)(Math.random()*NUMBER.length);
		one = SHAPE[s]+NUMBER[n];
	}

	public String getOne() {
		return one;
	}

	@Override
	public int hashCode() {
		return Objects.hash(one);
	}

	@Override
	public boolean equals(Object obj) {
		boolean isc = false;
		CardOne other = (CardOne) obj;
		if(one.equals(other.getOne())) {
			isc = true;
		}
		
		return isc;
	}

}

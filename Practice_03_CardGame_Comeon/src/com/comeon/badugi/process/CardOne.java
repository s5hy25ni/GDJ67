package com.comeon.badugi.process;

public class CardOne {

	private String card;
	
	public static final String[] SHAPE= {"♠","◆","♥","♣"};
	public static final String[] NUMBER= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public CardOne() {
		int s = (int)(Math.random()*SHAPE.length);
		int n = (int)(Math.random()*NUMBER.length);
		card = SHAPE[s]+NUMBER[n];
	}

	@Override
	public String toString() {
		return card;
	}
	
	

}

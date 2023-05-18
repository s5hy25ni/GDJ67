package com.comeon.cardgame.tool;

import java.util.Objects;

public class CardOne {

	private String one;
	
	public static enum Shape {
		CLOVER("♣"), HEART("♥"), DIAMOND("◆"), SPACE("♠");
		
		public String value;
		private Shape(String s) {
			value = s;
		}
	}
	
	public static enum Number {
		ONE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"),  EIGHT("8"), NINE("9"), TEN("10"), ELEVEN("J"), TWELVE("Q"), THIRTEEN("K");
		
		public String value;
		private Number(String n) {
			value = n;
		}
	}

	public CardOne() {
		int s = (int)(Math.random()*Shape.values().length);
		int n = (int)(Math.random()*Number.values().length);
		one = Shape.values()[s].value +Number.values()[n].value;
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

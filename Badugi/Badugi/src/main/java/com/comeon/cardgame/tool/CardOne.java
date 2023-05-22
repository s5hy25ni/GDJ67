package com.comeon.cardgame.tool;

public class CardOne {

	private String one;
	
<<<<<<< HEAD:Badugi/Badugi/src/main/java/com/comeon/cardgame/tool/CardOne.java
	public enum Shape {
		
=======
	public static enum Shape {

>>>>>>> 56ef6618ae6059138ff4b2ffbffabb30d1f38d20:Practice_03_CardGame/src/main/java/com/comeon/cardgame/tool/CardOne.java
		CLOVER("♣"), HEART("♥"), DIAMOND("◆"), SPACE("♠");
		
		public String value;
		private Shape(String s) {
			value  = s;
		}
		public String getValue() {
			return value;
		}
	}
	
	public enum Number {
		
		A("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), J("J"), Q("Q"), K("K");
		
		public String value;
		private Number(String n) {
			value  = n;
		}
	}

	CardOne() {
		Shape[] shape = Shape.values();
		Number[] number = Number.values();
		int s = (int)(Math.random()*shape.length);
		int n = (int)(Math.random()*number.length);
		
		one = shape[s].value+number[n].value;
	}

	String getOne() {
		return one;
	}

}

package com.comeon.badugi.process;

public class CardOne {

	private String card;
	
	public static final String[] SHAPE= {"♣","♥","◆","♠"};
	public static final String[] NUMBER= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

	public CardOne() {
		int s = (int)(Math.random()*SHAPE.length);
		int n = (int)(Math.random()*NUMBER.length);
		card = SHAPE[s]+NUMBER[n];
	}
	
	public String getCard() {
		return card;
	}

	@Override
	public int hashCode() {
		int value = 0;
		
		for (int i = 0; i < SHAPE.length; i++) {
			if(card.substring(0,1).equals(SHAPE[i])) {
				value += ((i+1)*100);
				// 나중에 무늬를 비교할 때는 hachCode()/100
			}
		}
		
		for (int i = 0; i < NUMBER.length; i++) {
			if(card.substring(1).equals(NUMBER[i])) {
				value += (i+1);
				// 나중에 숫자를 비교할 때는 hashCode()%100
			}
		}
		
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isc = false;
		CardOne other = (CardOne) obj;
		if(card.equals(other.getCard())) {
			isc = true;
		}
		
		return isc;
	}

	// 테스트 후 삭제
	@Override
	public String toString() {
		return card;
	}
	
	

}

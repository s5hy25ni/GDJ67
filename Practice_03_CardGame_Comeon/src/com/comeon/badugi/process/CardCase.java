package com.comeon.badugi.process;

import java.util.ArrayList;
import java.util.List;

public class CardCase {
	
	private static CardCase cardcase;
	private List<CardOne> cardBundle;
	
	public CardCase() {
		cardBundle = new ArrayList<CardOne>();
		make();
	}
	
	public static CardCase getInstance() {
		if(cardcase==null) {
			cardcase = new CardCase();
		}
		return cardcase;
	}
	
	private void make() {
		int cnt = 0;
		while(true) {
			CardOne card = new CardOne();
			if(!cardBundle.contains(card)) {
				cardBundle.add(card);
				cnt++;
			}
			if(cnt==CardOne.SHAPE.length*CardOne.NUMBER.length) {
				break;
			}
		}
	}
	
	public List<CardOne> getCardBundle() {
		return cardBundle;
	}
	
}

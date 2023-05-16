package com.comeon.badugi.process;

import java.util.ArrayList;
import java.util.List;

public class CardCase {
	
	private static CardCase cardcase;
	private List<CardOne> cards;
	
	private CardCase() {
		cards = new ArrayList<CardOne>();
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
			if(!cards.contains(card)) {
				cards.add(card);
				cnt++;
			}
			if(cnt==CardOne.SHAPE.length*CardOne.NUMBER.length) {
				break;
			}
		}
	}
	
	// 테스트 후 삭제
	public List<CardOne> getCards() {
		return cards;
	}
	
}

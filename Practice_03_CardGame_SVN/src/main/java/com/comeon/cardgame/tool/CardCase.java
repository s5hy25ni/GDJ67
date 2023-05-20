package com.comeon.cardgame.tool;

import java.util.ArrayList;
import java.util.List;

public class CardCase {

	private List<String> cardcase;
	
	public CardCase() {
		cardcase = new ArrayList<String>();
		make();
	}
	
	private void make() {
		int cnt = 0;
		while(true) {
			CardOne card = new CardOne();
			if(!cardcase.contains(card.getOne())) {
				cardcase.add(card.getOne());
				cnt++;
			}
			if(cnt==CardOne.Shape.values().length*CardOne.Number.values().length) {
				break;
			}
		}
	}

	public List<String> getCardcase() {
		return cardcase;
	}

}

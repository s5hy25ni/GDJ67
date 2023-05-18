package com.comeon.cardgame.function;

import com.comeon.cardgame.tool.CardOne;

public class CompareImpl implements ICompare {
	CardOne[] cards;

	public CompareImpl(CardOne[] playerCards) {
		cards = playerCards.clone();
	}
	
	private void sorting() {
		
	}
}

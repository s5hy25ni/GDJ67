package com.min.edu;

import java.util.ArrayList;
import java.util.List;

public class CardCase {

	private List<CaseOne> cardcase;
	
	public CardCase() {
		cardcase = new ArrayList<CaseOne>();
		make();
	}
	
	private void make() {
		int cnt = 0;
		while (true) {
			CaseOne card = new CaseOne();
			if(!cardcase.contains(card)) {
				cardcase.add(card);
				cnt++;
			}
			if(cnt==CaseOne.SHAPE.length*CaseOne.NUMBER.length) {
				break;
			}
		} // while
	} // make()

	public List<CaseOne> getCardcase() {
		return cardcase;
	}
	
}

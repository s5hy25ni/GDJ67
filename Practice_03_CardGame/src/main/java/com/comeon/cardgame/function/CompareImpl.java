package com.comeon.cardgame.function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.comeon.cardgame.tool.CardOne;

public class CompareImpl implements ICompare {

	public String[] sortCard(String[] cards) {
		int len = cards.length;
		String[][] from = bubbleSort(cards.clone());
		String[] to = new String[len];
 		for (int i = 0; i < len; i++) {
			to[i] = from[i][0]+from[i][1];
		}
 		return to;
	}
	
	public String[][] bubbleSort(String[] from) {
		int len = from.length;
		String[][] to = separateCard(from);
		String[][] temp = new String[len][2];
		
		for (int i = 0; i < len; i++) {
			for (int j =0; j < len-1; j++) {
				if(getSize(1, to[j][1]) > getSize(1, to[j+1][1])
						|| (getSize(1, to[j][1])==getSize(1, to[j+1][1])
								&& getSize(0, to[j][0]) > getSize(0, to[j+1][0]))){
					temp[j] = to[j];
					to[j] = to[j+1];
					to[j+1] = temp[j];
				} 
			}
		}
		
		return to;
	}
	
	public int getSize(int type, String cardValue) {
		int size;
		if(type==0) {
			size = Stream.of(CardOne.Shape.values())
					.filter(s->s.value.equals(cardValue))
					.map(s->s.ordinal())
					.collect(Collectors.toList()).get(0);			
		} else {			
			size = Stream.of(CardOne.Number.values())
					.filter(s->s.value.equals(cardValue))
					.map(s->s.ordinal())
					.collect(Collectors.toList()).get(0);			
		}			
		
		return size+1;
	}
	
	public String[][] separateCard(String[] pCards) {
		String[][] sCards = new String[pCards.length][2];
		for (int i = 0; i < pCards.length; i++) {
			sCards[i][0] = pCards[i].substring(0, 1);
			sCards[i][1] = pCards[i].substring(1);
		}
		return sCards;
	}
	
}

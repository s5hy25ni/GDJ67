package com.comeon.cardgame.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.comeon.cardgame.tool.CardOne;

public class CompareImpl implements ICompare {
	
	Set<String> sameSValue;
	Set<String> sameNValue;
	Set<String> notSame;
	
	public String makeJokboTop(String[] pCards) {
		String top = " 탑";
		
		sameValueCnt(pCards);
		
		
		return top;
	}
	
	public String makeJokboName(String[] pCards) {
	
		sameValueCnt(pCards);
		int sameSNum = sameSValue.size();
		int sameNNum = sameNValue.size();
		
		if(sameSNum == 3 || sameNNum == 3) {
			return "무탑";
		} else if (sameSNum == 2 || sameNNum == 2) {
			return "투베이스";
		} else if (sameSNum == 1 || sameNNum == 1) {
			return "베이스";
		} else {
			return madeName(pCards);
		}
	}
	
	public String madeName(String[] pCards) {
		String[][] temp = separateCard(pCards.clone());
		
		String cardNumber = "";
		
		for (int i = 0; i < temp.length; i++) {
			cardNumber += temp[i][1];
		}
		
		if(cardNumber.equals("A234")) {
			return "골프";
		} else if (cardNumber.equals("A235")){
			return "세컨드";
		} else if (cardNumber.equals("A245")){
			return "써드";
		} else {
			return "메이드";
		}
	}

	public void sameValueCnt(String[] pCards) {
		String[][] temp = separateCard(pCards.clone());

		sameSValue = new HashSet<String>();
		sameNValue = new HashSet<String>();
		notSame = new HashSet<String>();
		
		for (int i = 0; i < temp.length-1; i++) {
			for (int j = i+1; j < temp.length; j++) {
				if(temp[i][0].equals(temp[j][0])) {
					sameSValue.add(temp[i][0]+temp[i][1]);
				} else if (temp[i][1].equals(temp[j][1])) {
					sameNValue.add(temp[i][0]+temp[i][1]);
				} else {
					notSame.add(temp[i][0]+temp[i][1]);
				}
			}
		}
	}
	
	public String[] sortCard(String[] pCards) {
		int len = pCards.length;
		String[][] from = bubbleSort(pCards.clone());
		String[] to = new String[len];
 		for (int i = 0; i < len; i++) {
			to[i] = from[i][0]+from[i][1];
		}
 		return to;
	}
	
	String[][] bubbleSort(String[] from) {
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
	
	int getSize(int type, String cardValue) {
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
	
	String[][] separateCard(String[] pCards) {
		String[][] sCards = new String[pCards.length][2];
		for (int i = 0; i < pCards.length; i++) {
			sCards[i][0] = pCards[i].substring(0, 1);
			sCards[i][1] = pCards[i].substring(1);
		}
		return sCards;
	}
}

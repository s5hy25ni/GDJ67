package com.comeon.cardgame.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.comeon.cardgame.tool.CardOne;
import com.comeon.cardgame.tool.Player;

public class CompareImpl implements ICompare {

	List<Player> players;
	
	List<CardOne> validValue;
	Set<Integer> changeIdx = new HashSet<Integer>();

	String[] nowPShape = new String[4];
	String[] nowPNumber = new String[4];
	
	String jokbo = "";

	public CompareImpl(List<Player> players) {
		this.players = players;
	}

	void bubbleSort(Player player) {
		CardOne[] to = player.getMyCard().clone();
		int len = to.length;
		CardOne temp;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (to[j].getSize() > to[j + 1].getSize()) {
					temp = to[j];
					to[j] = to[j + 1];
					to[j + 1] = temp;
				}
			}
		}

		player.setMyCard(to);
	}

	public void separateCard(CardOne[] cards) {
		for (int i = 0; i < cards.length; i++) {
			nowPShape[i] = cards[i].getOne().substring(0, 1);
			nowPNumber[i] = cards[i].getOne().substring(1);
		}
	}

	public void findValidValue(CardOne[] cards) {
		validValue = new ArrayList<CardOne>(List.of(cards.clone()));
		int len = cards.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				isValid(cards,i, j);
			}
		}
		
	}
	
	public void isValid(CardOne[] cards, int targetIdx, int compareIdx) {		
		 if( nowPShape[targetIdx].equals(nowPShape[compareIdx]) ||
				 nowPNumber[targetIdx].equals(nowPNumber[compareIdx])) {
				validValue.remove(cards[compareIdx]);
				changeIdx.add(compareIdx);
		}
	}

	public void makeJokbo(CardOne[] cards) {
		int size = validValue.size();
		String top = validValue.get(size-1).getOne().substring(1);
		switch (size) {
		case 1 ->jokbo="무탑"+top;
		case 2->jokbo="투베이스 탑"+top;
		case 3->jokbo="베이스 탑"+top;		
		default ->jokbo=madeName();
		};
	}

	public String madeName() {	
		if(Arrays.equals(nowPNumber, new String[] {"A","2","3","4"})) {
			return "골프";
		} else if (Arrays.equals(nowPNumber, new String[] {"A","2","3","5"})){
			return "세컨드";
		} else if (Arrays.equals(nowPNumber, new String[] {"A","2","4","5"})){
			return "써드";
		} else {
			return "메이드 탑"+validValue.get(validValue.size()-1).getOne().substring(1);
		}
	}

}

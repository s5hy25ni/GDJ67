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
	CardOne[] currentCards;
	
	List<CardOne> validValue;
	Set<Integer> changeIdx;

	String[] nowPShape = new String[4];
	String[] nowPNumber = new String[4];
	
	CompareImpl() {
		players = Game.room.getPlayers();
		changeIdx = new HashSet<Integer>();
	}
	
	void makeJokboAndChange() {
		for (Player player : players) {
			CardOne[] after = bubbleSort(player.getMyCard());
			player.setMyCard(after);
			currentCards = player.getMyCard();
			separateCard();
			findValidValue();
			String jokbo = makeJokboName();
			player.setJokbo(jokbo);
			player.setChangeIdx(changeIdx);
		}
	}

	private CardOne[] bubbleSort(CardOne[] before) {
		CardOne[] after = before.clone();
		int len = after.length;
		CardOne temp;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (after[j].getSize() > after[j + 1].getSize()) {
					temp = after[j];
					after[j] = after[j + 1];
					after[j + 1] = temp;
				}
			}
		}

		return after;
	}

	private void separateCard() {
		for (int i = 0; i < currentCards.length; i++) {
			nowPShape[i] = currentCards[i].getOne().substring(0, 1);
			nowPNumber[i] = currentCards[i].getOne().substring(1);
		}
	}

	private void findValidValue() {
		validValue = new ArrayList<CardOne>(List.of(currentCards.clone()));
		int len = currentCards.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				isValid(i, j);
			}
		}
	}
	
	private void isValid(int targetIdx, int compareIdx) {		
		 if( nowPShape[targetIdx].equals(nowPShape[compareIdx]) ||
				 nowPNumber[targetIdx].equals(nowPNumber[compareIdx])) {
				validValue.remove(currentCards[compareIdx]);
				changeIdx.add(compareIdx);
		}
	}

	private String makeJokboName() {
		String jokbo = switch (validValue.size()) {
		case 1 ->"무탑"+makeJokboNumber();
		case 2->"투베이스 탑"+makeJokboNumber();
		case 3->"베이스 탑"+makeJokboNumber();		
		default ->madeName();
		};
		return jokbo;
	}
	
	private String makeJokboNumber() {
		return validValue.get(validValue.size()-1).getOne().substring(1);
	}

	private String madeName() {	
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

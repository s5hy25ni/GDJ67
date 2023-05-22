package com.comeon.cardgame.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.comeon.cardgame.tool.CardOne;
import com.comeon.cardgame.tool.Player;

public class CompareImpl implements ICompare {

	List<Player> players;
//	Map<Integer, Map<String, List<Integer>>> valueSize;
	// idx value get(0)==shapeSize, get(1)==numberSize
	Set<String> validValue = new HashSet<String>();
	Set<Integer> cutIdx = new HashSet<Integer>();

	public CompareImpl(List<Player> players) {
		this.players = players;
	}

	CardOne[] bubbleSort(CardOne[] from) {
		int len = from.length;
		CardOne[] to = from.clone();
		CardOne temp;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (to[i].getSize() > to[j].getSize()) {
					temp = to[i];
					to[i] = to[j];
					to[i] = to[j];
				}
			}
		}
		return to;
	}

	// enum에 getSize 추가,,,?
//	int getSize(int type, String cardValue) {
//		int size;
//		if(type==0) {
//			size = Stream.of(CardOne.Shape.values())
////					.filter(s->s.value.equals(cardValue))
//					.map(s->s.ordinal())
//					.collect(Collectors.toList()).get(0);			
//		} else {			
////			size = Stream.of(CardOne.Number.values())
//					.filter(s->s.value.equals(cardValue))
//					.map(s->s.ordinal())
//					.collect(Collectors.toList()).get(0);			
//		}				
//		return size+1;
//	}

//	public void separateCard(String[] pCards) {
//		for (int i = 0; i < pCards.length; i++) {
//			shapeValue[i] = pCards[i].substring(0, 1);
//			numberValue[i] = pCards[i].substring(1);
//		}
//	}

//	public String makeJokboTop(String[] pCards) {
//		String top = " 탑";
//		
//		
//		return top;
//	}

//	public String makeJokboName(String[] pCards) {
//	
//		findValidValue(pCards);
//		int valid = validValue.size();
//		
//		String jokboName = switch (valid) {
//		case 1 ->"무탑";
//		case 2->"투베이스";
//		case 3->"베이스";		
//		default ->"메이드";
//		};
//		
//		return jokboName;
//		sameValueCnt(pCards);
//		int sameSNum = sameSValue.size();
//		int sameNNum = sameNValue.size();
//		
//		if(sameSNum == 3 || sameNNum == 3) {
//			return "무탑";
//		} else if (sameSNum == 2 || sameNNum == 2) {
//			return "투베이스";
//		} else if (sameSNum == 1 || sameNNum == 1) {
//			return "베이스";
//		} else {
//			return madeName(pCards);
//		}
//	}

//	public String madeName() {
//		Set<String> temp = new HashSet<String>(validValue);
//		Iterator<String> temp2  = temp.iterator();
//		return "";
//		String[][] temp = separateCard(pCards.clone());
//		
//		String cardNumber = "";
//		
//		for (int i = 0; i < temp.length; i++) {
//			cardNumber += temp[i][1];
//		}
//		
//		if(cardNumber.equals("A234")) {
//			return "골프";
//		} else if (cardNumber.equals("A235")){
//			return "세컨드";
//		} else if (cardNumber.equals("A245")){
//			return "써드";
//		} else {
//			return "메이드";
//		}
//	}

//	public void cutOrValidNull() {
//			if(validValue.size()==ICompare.CARDNUM) {
//				cutIdx.add(ICompare.CARDNUM);
//			}
//	}
//	
//	public void findValidValue(String[] pCards) {
//		String[][] temp = separateCard(pCards.clone());
//		validValue = new HashSet<String>(List.of(pCards.clone()));
//		cutIdx = new HashSet<Integer>();
//		int maxIdx = pCards.length-1;
//		
//		for (int i = 0; i < maxIdx; i++) {
//			for (int j = i+1; j < maxIdx+1; j++) {
//				if(temp[maxIdx-i][0].equals(temp[maxIdx-j][0])
//						|| temp[maxIdx-i][1].equals(temp[maxIdx-j][1])) {
//					validValue.remove(pCards[maxIdx-j]);
//					cutIdx.add(maxIdx-j);
//				}
//			}
//		}
//		
//		cutOrValidNull();
//		
//	}
//	
//	public String[] sortCard(String[] pCards) {
//		int len = pCards.length;
//		String[][] from = bubbleSort(pCards.clone());
//		String[] to = new String[len];
// 		for (int i = 0; i < len; i++) {
//			to[i] = from[i][0]+from[i][1];
//		}
// 		return to;
//	}
//	

}

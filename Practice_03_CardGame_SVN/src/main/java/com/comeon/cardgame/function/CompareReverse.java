package com.comeon.cardgame.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.comeon.cardgame.tool.CardOne;

public class CompareReverse extends CompareImpl {
	
	private static CompareReverse compareReverse;
	private Map<String, Integer> shapeCnt;
	private String validShape;
	
	private CompareReverse() {};
	
	public static CompareReverse getInstance() {
		if(compareReverse == null) {
			compareReverse = new CompareReverse();
		}
		return compareReverse;
	}

	@Override
	protected void separateCard() {
		for (int i = 0; i < currentCards.length; i++) {
			nowPShape[i] = currentCards[i].getOne().substring(0, 1);
			nowPNumber[i] = currentCards[i].getOne().substring(1);
		}
		countShape();
		findValidShape();
	}
	
	@Override
	protected void findValidValue() {
		validValue = new ArrayList<CardOne>(List.of(currentCards.clone()));
		int len = currentCards.length;
		
		for (int i = 0; i < len - 1; i++) {
				isValid(i, i+1);
		}
	}
	
	@Override
	protected void isValid(int targetIdx, int compareIdx) {		
		if(validValue.contains(currentCards[targetIdx])) return;
		if( !nowPShape[targetIdx].equals(validShape) ) {
			validValue.remove(currentCards[targetIdx]);
			changeIdx.add(targetIdx);
		}
	}
	
	@Override
	protected String madeName() {
		if(Arrays.equals(nowPNumber, new String[] {"10","J","Q","K"})) {
			return "골프";
		} else if (Arrays.equals(nowPNumber, new String[] {"9","J","Q","K"})){
			return "세컨드";
		} else if (Arrays.equals(nowPNumber, new String[] {"9","10","Q","K"})){
			return "써드";
		} else if(shapeCnt.containsValue(4)) {
			return "퍼펙트";
		} else {
			return "봇"+makeJokboNumber();
		}
	}
	
	@SuppressWarnings("serial")
	private void countShape() {
		shapeCnt = new HashMap<String, Integer>(){{
			put("♣",0);
			put("♥",0);
			put("◆",0);
			put("♠",0);			
		}};
		for (int i = 0; i < nowPShape.length; i++) {
			shapeCnt.put(nowPShape[i], (shapeCnt.get(nowPShape[i])+1));
		}
		
		System.out.println("무늬 카운트 : "+shapeCnt);
	}

	private void findValidShape() {
		validShape = nowPShape[0];
		for (int i = 0; i < currentCards.length-1; i++) {
			System.out.printf("%s(%s) < %s(%s) ="+(shapeCnt.get(nowPShape[i]) < shapeCnt.get(nowPShape[i+1]))+"\n",nowPShape[i],shapeCnt.get(nowPShape[i]),nowPShape[i+1],shapeCnt.get(nowPShape[i+1]));
			System.out.printf("%s(%s) == %s(%s) ="+(shapeCnt.get(nowPShape[i]) == shapeCnt.get(nowPShape[i+1]))+"\n",nowPShape[i],shapeCnt.get(nowPShape[i]),nowPShape[i+1],shapeCnt.get(nowPShape[i+1]));
			if(shapeCnt.get(nowPShape[i]) < shapeCnt.get(nowPShape[i+1])
					|| ((shapeCnt.get(nowPShape[i]) == shapeCnt.get(nowPShape[i+1]))
							&& (currentCards[i].getSize()%10 < currentCards[i+1].getSize()%10))) {
				validShape = nowPShape[i+1];
			}
		}	
		
		System.out.println("젤 많은 무늬 : "+validShape);
	}
}

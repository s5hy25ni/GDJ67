package com.comeon.cardgame.function;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.comeon.cardgame.tool.CardCase;
import com.comeon.cardgame.tool.CardOne;
import com.comeon.cardgame.tool.Player;

public class CompareImplTest {

	@Test
	public void test() {
		//TODO SH001 기본 테스트 환경 세팅
		
		// 1. CardOne(String value) 생성자 추가
//		CardOne(String value) {
//			this.one = value;
//			for (int i = 0; i < Shape.values().length; i++) {
//				if(Shape.values()[i].value.equals(value.substring(0,1))) {
//					this.size += Shape.values()[i].ordinal();
//				}
//			}
//			for (int i = 0; i < Number.values().length; i++) {
//				if(Number.values()[i].value.equals(value.substring(1))){
//					this.size += (Number.values()[i].ordinal()+1)*10;
//				}
//			}
//		}
		
		// 2. myCard 생성
		CardOne[] myCard = {new CardOne("◆3"), new CardOne("♥2"), new CardOne("♠A"), new CardOne("♣4") };
		
		// 3. 유저 리스트 생성 및 myCard 세팅
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("유저"));
		players.get(0).setMyCard(myCard);

		// 4. test class 생성
		CompareImpl ci = new CompareImpl(players);

		//TODO SH002 bubbleSort()
//		ci.bubbleSort(players.get(0));
//		CardOne[] toCard = {new CardOne("♠A"), new CardOne("♥2"), new CardOne("◆3"), new CardOne("♣4") };
//		assertArrayEquals(toCard, players.get(0).getMyCard());
//		CardOne[] myCard2 = {new CardOne("♠6"), new CardOne("♥K"), new CardOne("◆10"), new CardOne("♣K") };
//		players.get(0).setMyCard(myCard2);
//		ci.bubbleSort(players.get(0));
//		CardOne[] toCard2 =  {new CardOne("♠6"), new CardOne("◆10"), new CardOne("♣K"), new CardOne("♥K") };
//		assertArrayEquals(toCard2, players.get(0).getMyCard());

		//TODO SH003 separateCard()
//		CardOne[] card = { new CardOne("♥4"), new CardOne("♠6"), new CardOne("♠10"), new CardOne("♣K") };
//		ci.separateCard(card);
//		String[] shape = {"♥","♠","♠","♣"};
//		String[] number = {"4","6","10","K"};
//		assertArrayEquals(ci.nowPShape, shape);
//		assertArrayEquals(ci.nowPNumber, number);
		
		//TODO SH004 findValidValue()
		// 메이드
//		CardOne[] card1 =  { new CardOne("♠6"), new CardOne("♣9"), new CardOne("◆10"), new CardOne("♥K") };
//		ci.separateCard(card1);
//		ci.findValidValue(card1);
//		List<CardOne> card1Valid = new ArrayList<CardOne>(List.of(card1));
//		assertEquals(card1Valid, ci.validValue);
//		assertEquals(true, ci.changeIdx.isEmpty());
//		// 베이스
//		CardOne[] card2 = { new CardOne("♥4"), new CardOne("♠6"), new CardOne("♠10"), new CardOne("♣K") };
//		ci.separateCard(card2);
//		ci.findValidValue(card2);
//		List<CardOne> card2Valid = new ArrayList<CardOne>(List.of(new CardOne("♥4"), new CardOne("♠6"),  new CardOne("♣K")));
//		Set<Integer> card2Change = new HashSet<Integer>(List.of(2));
//		assertEquals(card2Valid, ci.validValue);
//		assertEquals(card2Change, ci.changeIdx);
//		// 투베이스
//		CardOne[] card3 = { new CardOne("♠6"), new CardOne("♣10"), new CardOne("♥10"), new CardOne("♠10") };
//		ci.separateCard(card3);
//		ci.findValidValue(card3);
//		List<CardOne> card3Valid = new ArrayList<CardOne>(List.of(new CardOne("♠6"), new CardOne("♣10")));
//		Set<Integer> card3Change = new HashSet<Integer>(List.of(2,3));
//		assertEquals(card3Valid, ci.validValue);
//		assertEquals(card3Change, ci.changeIdx);
//		// 무탑_숫자
//		CardOne[] card4 = { new CardOne("♣9"), new CardOne("♥9"), new CardOne("◆9"), new CardOne("♠9") };
//		ci.separateCard(card4);
//		ci.findValidValue(card4);
//		List<CardOne> card4Valid = new ArrayList<CardOne>(List.of(new CardOne("♣9")));
//		Set<Integer> card4Change = new HashSet<Integer>(List.of(1,2,3));
//		assertEquals(card4Valid, ci.validValue);
//		assertEquals(card4Change, ci.changeIdx);
//		// 무탑_무늬
//		CardOne[] card5 = { new CardOne("♣6"), new CardOne("♣8"), new CardOne("♣9"), new CardOne("♣J") };
//		ci.separateCard(card5);
//		ci.findValidValue(card5);
//		List<CardOne> card5Valid = new ArrayList<CardOne>(List.of(new CardOne("♣6")));
//		Set<Integer> card5Change = new HashSet<Integer>(List.of(1,2,3));
//		assertEquals(card5Valid, ci.validValue);
//		assertEquals(card5Change, ci.changeIdx);
		
		// TODO SH005 makeJokbo();
		// 골프
		
	}

}

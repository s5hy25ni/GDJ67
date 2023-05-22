package com.comeon.cardgame.function;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.comeon.cardgame.tool.Player;

public class CompareImplTest {

	@Test
	public void test() {
		// 기본 테스트 환경 세팅
		String[][] cards = {{"◆3","♥2","♠A","♣4"}, //golf
											{"♥A","♣3","◆5","♠2"}, //second
											{"♥5","◆4","♣2","♠A"}, //third
											{"♠6","♥K","◆10","♣9"}, //made
											{"♠A","♣7","♥2","♠5"}, //baseTop7
											{"♠6","♥K","◆10","♣K"}, //baseTopK_1
											{"♠6","♥4","♠10","♣K"}, //baseTopK_2
											{"♣6","♥10","♣2","♥8"}, //tBaseTop8
											{"♠6","♥10","♠10","♣10"}, //tBaseTop10_1
											{"♣6","♥10","♣2","♣5"}, //tBaseTop10_2
											{"♣9","◆9","♠9","♥9"}, //noneTop9
											{"♣9","♣6","♣8","♣J"}}; //noneTop6
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < cards.length; i++) {
			players.add(new Player());
			players.get(i).setMyCard(cards[i]);
		}

		CompareImpl ci = new CompareImpl(players);
		
		//TODO TEST_SH_001 setting
//		for (int i = 0; i < cards.length; i++) {
//			assertArrayEquals(cards[i], ci.players.get(i).getMyCard()); 
//		}
		
		
		//TODO TEST_SH_002 separateCard()
//			ci.separateCard(cards[3]);
//			String[] shape = {"♠","♥","◆","♣"};
//			String[] number = {"6","K","10","9"};
//			assertArrayEquals(shape, ci.shapeValue);
//			assertArrayEquals(number, ci.numberValue);
		
		
		//TODO TEST_SH_003 getSize()
		
		
		
		
//		String[][] sort = {{"♠A","♥2","◆3","♣4"}, //golf
//				{"♥A","♠2","♣3","◆5"}, //second
//				{"♠A","♣2","◆4","♥5"}, //third
//				{"♠6","♣9","◆10","♥K"}, //made
//				{"♠A","♥2","♠5","♣7"}, //baseTop7
//				{"♠6","◆10","♣K","♥K"}, //baseTopK_1
//				{"♥4","♠6","♠10","♣K"}, //baseTopK_2
//				{"♣2","♣6","♥8","♥10"}, //tBaseTop8
//				{"♠6","♣10","♥10","♠10"}, //tBaseTop10_1
//				{"♣2","♣5","♣6","♥10"}, //tBaseTop10_2
//				{"♣9","♥9","◆9","♠9"}, //noneTop9
//				{"♣6","♣8","♣9","♣J"}}; //noneTop6
		
	}

}

package com.comeon.cardgame.sh;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;

import com.comeon.cardgame.function.CompareImpl;

public class CompareImplTest {

	@Test
	public void test() {
		
		
		
		
		CompareImpl ci = new CompareImpl();
		
		//TODO TEST_SH_004 sortCard();
//		String[] madeTopK = {"♠K","◆A","♣K","♥4"};
//		String[] result = {"◆A","♥4","♣K","♠K"};
//
//		assertArrayEquals(result, ci.sortCard(madeTopK));
		

		//TODO TEST_SH_003 bubbleSort();
//		String[] madeTop10 = {"♣2","◆A","♠10","♥3"};
//		String[] madeTopK = {"♠K","◆A","♣K","♥4"};
//		
//		String[][] result1 = {{"◆","A"},{"♣","2"},{"♥","3"},{"♠","10"}};
//		String[][] result2 = {{"◆","A"},{"♥","4"},{"♣","K"},{"♠","K"}};
//		
//		assertArrayEquals(result1, ci.bubbleSort(madeTop10));
//		assertArrayEquals(result2, ci.bubbleSort(madeTopK));

		
		//TODO TEST_SH_002 getSize();
//		assertEquals(0, ci.getSize(0, "♣"));
//		assertEquals(1, ci.getSize(0, "♥"));
//		assertEquals(2, ci.getSize(0, "◆"));
//		assertEquals(3, ci.getSize(0, "♠"));
//		assertEquals(0, ci.getSize(1, "A"));
//		assertEquals(9, ci.getSize(1, "10"));
//		assertEquals(10, ci.getSize(1, "J"));
//		assertEquals(11, ci.getSize(1, "Q"));
//		assertEquals(12, ci.getSize(1, "K"));
		
		
		//TODO TEST_SH_001 separateCard();
//		String[][] result = {{"♣","10"},{"♠","7"},{"◆","5"},{"♠","5"}};
//		assertArrayEquals(result, ci.separateCard(baseTop10));
		
	}

}

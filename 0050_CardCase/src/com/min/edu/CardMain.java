package com.min.edu;

import java.util.Arrays;
import java.util.List;

public class CardMain {

	public static void main(String[] args) {

		CardCase make = new CardCase();
		
		// 전체 카드를 가지고 있음
		List<CaseOne> allCard = make.getCardcase();
		
		// 사용자에게 나눠줌
		CaseOne[] user1 = new CaseOne[3];
		for (int i = 0; i < user1.length; i++) {
			user1[i] = allCard.get(0);
			allCard.remove(0);
		}
		
		System.out.println("카드 나눠줌 : "+Arrays.toString(user1));
		System.out.println("나머지 카드 : "+make.getCardcase());
		
		// 카드를 요소로 나눔
		String[] cardSplit = user1[0].toString().split("");
		System.out.println(Arrays.toString(cardSplit));
		for (int i = 0; i < cardSplit.length; i++) {
			System.out.println(i+" : " + cardSplit[i]+" : "+cardSplit[i].hashCode());
		}
		
		// 스페이스 9824 다이아 9670 하트 9829 클로버 9827 
		System.out.println("◆".hashCode()); 
		System.out.println("♣".hashCode());
		System.out.println("♠".hashCode());
		System.out.println(user1[0].toString().hashCode());
		
		
	}

}

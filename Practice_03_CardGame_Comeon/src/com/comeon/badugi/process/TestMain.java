package com.comeon.badugi.process;

public class TestMain {

	public static void main(String[] args) {
		CardOne card = new CardOne();
		System.out.println(card.getCard());
//		System.out.println(card.hashCode());
//		System.out.println(card.hashCode()/100);
//		System.out.println(card.hashCode()%100);
		
		String other = "";
		for (int i = 0; i < CardOne.SHAPE.length; i++) {
			for (int j = 0; j < CardOne.NUMBER.length; j++) {
				other = CardOne.SHAPE[i]+CardOne.NUMBER[j];
				System.out.println(other+" : "+other.equals(card.getCard()));
			}
		}
		
		CardCase roomCards = CardCase.getInstance();
		System.out.println(roomCards.getCards());
		
		Player com = new Player();
		System.out.println(com.getName().contains("computer"));
		System.out.println(com);
		
		Player user = new Player("따라와");
		System.out.println(user.getName().contains("computer"));
		System.out.println(user);
	}

}

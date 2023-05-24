package com.min.edu;

public class FactoryMain {

	/**
	 * TODO 008
	 */
	public static void main(String[] args) {
		
		// 생성하고 등록
		Factory fc = new IDCardFactory();
		
		// 개인 사용자를 만듦
		Product card1 = fc.create("법인");
		Product card2 = fc.create("개인");
		
		// 카드 사용
		card1.use();
		card2.use();
		
		// 관리자 기능 : 전체 카드 사용자 검색
		IDCardFactory searchCard = (IDCardFactory)fc;
		System.out.println(searchCard.getOwners());
	}

}

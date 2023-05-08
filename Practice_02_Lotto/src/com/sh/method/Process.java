package com.sh.method;

public class Process {
	public static void main(String[] args) {
	
//		Seller se = new Seller();
//		se.drawWinLotto();
		System.out.println("\t\t동　행　복　권");
		System.out.println();
		System.out.println(" ▷ 로또 구매를 시작합니다.");
		System.out.println();
		Buyer buyer = new Buyer();
		buyer.inputDeposit();
		buyer.inputEachAmt();
		buyer.inputNums();
		Seller seller = new Seller(buyer.getLottos());
		seller.printPapers();
		
		//							1등			2등			3등			4등			5등
//		int[][] buyerLotto = { {1,2,3,6,5,4}, {1,2,3,7,4,5}, {1,5,3,4,2,8}, {9,2,3,4,8,1}, {1,2,10,8,9,3}, {1,2,8,9,10,11}, {1,8,9,10,11,12}, {8,9,10,11,12,13}  };
//		int[] winner = {1,2,3,4,5,6};
//		int bonus = 7;
//		se.checkRanking(buyerLotto, winner, bonus);
		
	}

}

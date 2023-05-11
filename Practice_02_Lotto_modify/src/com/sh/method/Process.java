package com.sh.method;

public class Process {
	public void act() {

		System.out.println("\t\t\t\t소\t소\t복\t권");
		System.out.println();
		System.out.println(" ▷ 로또 구매를 시작합니다.");
		System.out.println();
		Buyer buyer = new Buyer();
		buyer.inputDeposit();
		System.out.println(" ▷ 타입별 구매 개수를 입력해주세요.");
		System.out.println();
		buyer.inputEachAmt();
		buyer.inputNums();
		Seller seller = new Seller(buyer.getLottos());
		seller.printPapers();
		seller.drawWinLotto();
		seller.printDrawPapers();
	}

}

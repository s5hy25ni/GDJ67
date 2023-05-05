package com.sh.method;

public class Process {
	public static void main(String[] args) {
	
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
	}

}

package com.sh.method;

public class Process {
	public void purchase() {
		Seller in = new Seller();
		Paper pa = new Paper();		
		Buyer by = new Buyer();
		
		System.out.println();
		System.out.println("☆★☆★☆★☆★☆★ 행복복권 ☆★☆★☆★☆★☆★");
		by.inputDeposit();
		by.inputEachAmt();
		System.out.println(by.toString());
		
//		System.out.printf(" ▷ 구매 가능한 로또는 %d장 입니다.\n", u.totalAmt);
//		u.eachAmt = in.inputLottoNum(u.totalAmt);
//		u.createLotto();
	}
}

package com.min.method;

public class Process {
	public void purchase() {
		Input in = new Input();
		Print p = new Print();

		System.out.println("☆★☆★☆★☆★☆★ 행복복권 ☆★☆★☆★☆★☆★");
		User u = new User(in.inputDeposit());
		System.out.printf(" ▷ 구매 가능한 로또는 %d장 입니다.\n", u.totalAmt);
		u.eachAmt = in.inputLottoNum(u.totalAmt);
		u.createLotto();
	}
}

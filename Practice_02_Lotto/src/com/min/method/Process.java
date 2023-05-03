package com.min.method;

public class Process {
	public void purchase() {
		Input i = new Input();
		Print p = new Print();

		System.out.println("☆★☆★☆★☆★☆★ 행복복권 ☆★☆★☆★☆★☆★");
		User u = new User(i.inputDeposit());
		p.confirm(u.amount);
	}
}

package com.min.method;

public class User {
	Lotto[] lottos;
	int deposit;
	int amount;
	
	public  User(int dep) {
		deposit = dep;
		amount = dep/1000;
		lottos = new Lotto[amount];
	}
	
	
}

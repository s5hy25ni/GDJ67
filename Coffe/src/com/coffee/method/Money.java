package com.coffee.method;

public class Money {

	static int totalMoney; // 총 입금(누적)
	static int totalPrice; // 총 가격(누적)

	// 거스름돈 계산
	int chargeCal() {

		return totalMoney - totalPrice;

	} // chargeCal()

}

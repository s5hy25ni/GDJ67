package com.coffee.method;

import java.util.Arrays;

public class Money {
	Util util = new Util();
	Menu menu = new Menu();
	
	// 입금을 받는 메소드
	void payment(){
		int money = 0;
		while(true){
			System.out.printf(" ▶ 입금해주세요 : ");
			money = util.inputIntValue();
			
			/* 
			 * 최소 입금 금액 = 최저 가격(pirces[0])에서 현재 남아있는 잔액(chargeCal()을 뺀 금액
			 * 입금 금액(money)이 최소 입금 금액보다 작으면 다시 입금을 받는다.
			 */
			int[] prices = new int[menu.menus.length];
			for (int i = 0; i < menu.menus.length; i++) {
				prices[i] = menu.menus[0][i];
			}
			Arrays.sort(prices);	
			System.out.println(prices[0]);
			if(money<(prices[0]-chargeCal())){
				System.out.printf(" ▷ 최소 %d원 이상 입금하셔야 합니다.\n", (prices[0]-chargeCal()));
			} else {
				break;
			}
		}
		
		// 현재까지 총 입금받은 금액에 현재 입금한 금액을 더한다.
		DTO.totalMoney += money;
	 } // payment()
	
	/**
	 * 입금 총 누적액에서 지불 총 누적액을 빼서 현재 잔액을 반환하는 메소드
	 * @return int 잔액
	 */
	static int chargeCal(){
		return DTO.totalMoney-DTO.totalPrice;
	} // chargeCal()S
	
}

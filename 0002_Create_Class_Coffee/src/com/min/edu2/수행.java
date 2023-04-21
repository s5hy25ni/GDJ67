package com.min.edu2;

public class 수행 {

	public static void main(String[] args) {
		
		커피주문서 order = new 커피주문서();
		order.coffeeName = "아메리카노";
		order.coffeeNum = 20;
		
		금천구커피숍 ceo = new 금천구커피숍();
		System.out.println(ceo.주문받는사장님(order));

	}

}

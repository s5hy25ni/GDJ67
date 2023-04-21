package com.min.edu2;

public class 금천구커피숍 {

	public String 주문받는사장님(커피주문서 order) {
		String bar = 바리스타(order);	
		return bar;
	}
	
	private String 바리스타(커피주문서 order) {
		String name = order.coffeeName;
		int num = order.coffeeNum;
		
		String result = "주문하신 "+name+" "+num+"잔 나왔습니다.";;
		
		return result; 
	}
	
}

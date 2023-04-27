package com.coffe;

public class Coffe_Main {
	public static void main(String[] args) {
		
		Coffe_Method cm = new Coffe_Method();
		
		while(true) {
			
			cm.coffeeOrder();
			int num = cm.endOrNot();
			System.out.println();
			if(num == 1) {
				continue;
			} else if (num == 2) {
				cm.printBill();
				break;
			} else {
				break;
			}
			
		}
		
	}
}

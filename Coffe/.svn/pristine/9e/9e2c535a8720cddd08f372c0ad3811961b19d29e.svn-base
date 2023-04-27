package com.coffee.test;

import com.coffee.method.Add;
import com.coffee.method.Basics;

public class CoffeeMachineTest {

	public static void main(String[] args) {
		Basics b = new Basics();
		Add a = new Add();
		
		while(true) {
			
			b.order();
			int num = a.endOrNot();
			
			if(num==1) {
				continue;
			} else if(num==2) {
				System.out.println("영수증 출력");
				break;
			} else {
				break;
			}
		}		
	}
}

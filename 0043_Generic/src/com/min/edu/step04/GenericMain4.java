package com.min.edu.step04;

public class GenericMain4 {
	
	public static void main(String[] args) {
		Printer p1 = new Printer(new Cat("냥냥이"));
		Printer p2 = new Printer(new Cat(null));
//		Printer p3 = new Printer(new String("냥냥이"));
		
		p1.print();
		p2.print();
	
	}
}

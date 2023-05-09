package com.min.edu;

public class Inheritance_Main {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.n);
		c.parentMake();
		
		// up-casting
		Parent p = c;
		System.out.println(p.n);
		p.parentMake();
		
		c.callParent();
		
	}

}

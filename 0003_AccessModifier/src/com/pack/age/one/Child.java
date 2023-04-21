package com.pack.age.one;

public class Child extends TestAccessClass {

	//TODO TEST004 extends를 통해 보무의 기능을 확장하여 사용
	// protected는 자식클래스가 사용할 수 있음을 표시한다.
	public Child() {

		protectedMethod();
		protectedMethod();
		defaultMethod();
		
	}
	
}

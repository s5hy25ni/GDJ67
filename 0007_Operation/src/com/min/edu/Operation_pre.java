package com.min.edu;

// 연산자 우선순위
public class Operation_pre {
	
	// 1. 연산순위 중 가장 최우선은 ()
	// 2. ++ -- ! ~
	// 3. * / %
	// 4. + -
	// 5. 마지막은 =
	
	public void Operation( ) {
		boolean isc1 = 2+3 > 1*4 && 5/5 == 1; // true
		System.out.println(isc1);
	}
}

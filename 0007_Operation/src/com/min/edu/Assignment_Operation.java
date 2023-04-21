package com.min.edu;

public class Assignment_Operation {
	public void assigment() {
		// 일반적인 대입 연산
		int i = 0;
		
		// 단축 연산
		// 변수에 대해 연산을 수행한 다음 결과를 동일한 변수에 다시 저장
		i += 1; // i = i+5
		System.out.println(i); 

	} // assigment()
	
	// 증감연산자 1) 선처리 후증가 2) 선증가 후처리
	public void in_decrement() {
		
		// 변수를 1씩만 증가 ++
		// 변수를 1씩만 감소 --
		
		// 변수++ : 선처리 후증가		
		// ++변수 : 선증가 후처리
		int y = 100;
		
		System.out.println(++y); // 101
		System.out.println(--y); // 100
		System.out.println(++y); // 101
		System.out.println(--y); // 100
		System.out.println(y++); // 100 -> y = 101 
		System.out.println(y++); // 101 -> y = 102 
		System.out.println(y--); // 102 -> y = 101
		System.out.println(y); // 101
		
		int m, n, x, z = 10; // m, n, x는 선언 z는 대입
		
		int i, j;
		m=5;
		n=m++; // n=5, m=6
		System.out.println(m+"/"+n); //  6/5
		m=5;
		n=++m; // m=6, n=6
		System.out.println(m+"/"+n); // 6/6
		
		
	} // in_decrement()
}

package com.min.edu;

// 생성자의 Chaining
/*
 * this 키워드를 사용하여 생성자에서 같은 클래스의 오버로딩된 생성자를 호출할 수 있음
 * 생성자 체이닝? 생성자의 활용을 통해 더 많은 코들르 재사용 할 수 있다.
 */

/*
 * 생성자 체이닝 사용시 주의점
 */
public class ParentClass {

	// default 생성자
	public ParentClass() {
		
		this("안녕");
	}

	public ParentClass(String string) {
		super();
		System.out.println("부모의 생성자 : "+string);
	}
	
	
}

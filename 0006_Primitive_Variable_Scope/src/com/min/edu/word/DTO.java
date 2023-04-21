package com.min.edu.word; // 첫 번째, 패키지, 소문자

import java.util.Date; // import 외부패키지의 클래스를 사용시 어떠한 곳의 클래스를 사용하는지 명시적으로 나타냄
						// java.lang 패키지의 클래스는 암묵적으로 import
						// java.util.* 의 문법은 *(wild card) java.util의 모든 클래스를 import 한다는 의미

public class DTO { // 접근제어자 클래스 클래스명 { code block } : block 안에는 모든 요소는 멤버(member)라고 한다.

	// 멤버 필드 영역 : 접근제한자 타입 -> 선언시 자동으로 default 값으로 초기화된다.(heap)
	
	public String name; // instance(class) 변수 : 외부에서 사용시 new를 해야 함
	public static String hobby; // static 변수 : 외부에서 사용시 class명.멤버로 사용(new 필요 없음)
								//class명만 사용하면 접근 및 수정이 가능, 최초에 1번만 생성
	// -----------------------------
	
	// 생성자(constructor) : 클래스 생성시 자동으로 생성됨, 반환타입이 없는 메소드
						// 클래스명과 메소드명이 같다.
						// 외부에서 new를 통해 생성자를 호출하고 객체를 메모리에 할당한다.
	public DTO() {
		
	}
	// -----------------------------
	
	// 멤버 메소드 영역 : 접근제한자 [static] [final] 반환타입 메소드명([arguments parameter]) { code block }
	public void make(int n) { // arguments는 외부에서 넣어줘야 할 값, parameter는 메서드 내부에서 값을 호출할 이름
		int a = n; // local variable : 메소드 내부에서만 사용하고 사라지는 변수
		new Date(); // 다른 패키지에 있는 클래스를 생성한 것, 외부이기 때문에 import 되어야 한다.
		new java.sql.Date(2023); // 먼저 import된 같은 클래스가 있다면, 소스 파일 내부에 명시적으로 package가 작성된다.
	}
	// ------------------------------
	
}

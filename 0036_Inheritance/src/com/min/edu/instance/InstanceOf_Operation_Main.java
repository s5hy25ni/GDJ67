package com.min.edu.instance;

public class InstanceOf_Operation_Main {

	/*
	 * 안전 예방책 instanceof 연산자를 사용하여 
	 * 객체의 특정 클래스로 캐스팅 할 수 있는지 여부를 
	 * 런타임 중에 테스트
	 * 
	 * 이 연산자는 예외를 일으키지 않음
	 * 왼쪽 객체를 오른쪽 유형(타입) 캐스팅 할 수 있는 경우 true
	 * 
	 */
	public static void main(String[] args) {

		Apple a = new Apple(); 	// 자식의 타입으로 자식 생성
		Fruit f = a;			// 자식의 타입을 부모의 타입으로 변경
		
		// a는 extends된 부모(Fruit)에 속할 수 있다. == 변경할 수 있다.
		// f는 원래 생성된 타입인 Apple로만 타입 변경이 가능하다. => Apple이 아닌 경우 ClassCastException
		
		// ******** 객체의 형변환은 타입의 Arguments가 부모의 타입으로 넘어오기 때문에
		// 			ClassCastException이 발생할 확률이 높다.
		//			확인 방법은 instanceof 예약어
		//			처리 방법은 try~catch의 Excetion으로 처리
		if(f instanceof Apple) { // f의 객체가 Apple 타입으로 변경이 가능하냐?
			Apple myApple = (Apple)f;
			System.out.println("f 객체는 Apple이 될 수 있다.");
			
		}
		try {
			Apple myApple = (Apple)f;
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("f 객체는 Apple이 될 수 없다."+e.getMessage());
		}
		
		if(f instanceof Apple myApple) { // 일반적으로 casting과 같이 연결하여 사용
			System.out.println("f 객체는 Apple이 될 수 있다.");
		}
		
		if(!(f instanceof Vegetable)) {
			System.out.println("f 객체는 Vegetable은 될 수 없습니다.");
		}
		
	}

}

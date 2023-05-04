package com.min.edu;

/*
 * class에 final에 작성한다면 상속 금지
 * <-> 상속 강요 : abstract/interface
 */
public /*final*/ class FinalClass {

	// 멤버필드는 외부에서 new를 했을 때 혹은 static이 메모리에 올라갈 때 선언만 되어졌다면 자동으로 타입의 초기값이 대입됨
	// final로 되어 있다면 재입력으로 인식되기 때문에 재입력 할 수 없음
	// 하지만 static은 static 생성자가 생성의 우선순위와 같은 시점을 갖기 때문세 static 생성자를 통해 단 1회 입력 가능
	public static final int[] ARR;

	static {
		ARR = new int[3];
	}
	
	public static final int AGE = 10;
	
	public void change() {
//		ARR = new int[4]; 참조 타입은 주소가 고정되기 때문에 새로운 주소를 입력할 수 없다.
		ARR[0] = 100; //			주소가 고정되는 것이지 객체 내부의 값이 고정되는 것은 아니다.
		
		final int a; // local variable은 선언만 하고 사용하지 않으면 오류 발생, 선언만 하면 사용되지 않는 변수이므로 의미 없음
		a = 10;		//					선언 후 입력이 가능 -> 생성 시점과 입력 시점이 같기 때문
//		a = 20;		//					재입력은 안됨
		
	}
	
	public static int[] getArr() { // static 메소드는 override가 안됨 (final 메소드, 생성자도 마찬가지)
		// object 생성자 - 내 생성자 - object ref
		return ARR.clone(); // 깊은 복사
	}
	
	public /*final*/ String callMethod() {
		return "난 부모임";
	}
}

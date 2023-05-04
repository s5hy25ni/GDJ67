package com.min.edu;

public class Final_Main {

	public static void main(String[] args) {
		// up-casting(자식으로 생성, 부모 타입) -> 사용 가능한 메서드는 타입에 따라 달라짐(private은 빼고!) 생성이나 실행은 new에 따라
		FinalClass f =new ChildClass();
		
		// 부모를 실행 -> 타입? 부모꺼 but 생성된 것은 자식 -> override가 되어 있으면 vmi 동작 자식을 찾음 -> 실행
		System.out.println(f.callMethod());
		
		// 부모 생성, 부모 타입
		FinalClass fo = new FinalClass();
		System.out.println(fo.callMethod());
		
		// 자식 생성, 자식 타입
		ChildClass cc = new ChildClass();
		System.out.println(cc.callMethod()); // 부모의 메소드가 final이면 실행을 부모걸로 함(자식이 override 못함)
	}

}

package com.min.edu;

/*
 * 람다식 실행 블럭(코드 블럭)에서는 클래스인 멤버필드와 멤버메소드를 제약 없이 사용 가능
 * 람다식 실행 블럭 내에서는 this는 람다식을 실행하는 객체를 참조
 */
public class LamdaExam1_inner {
	
	public int memberField = 10; // 인스턴스 변수
	
	class inner{
		int innerField = 20;
		
		void method() {
			MyFunction f = () -> {
				System.out.println("memberField : "+memberField);
				System.out.println("memberField : "+LamdaExam1_inner.this.memberField);
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : "+this.innerField);
			};
			f.method();
		}
	}
}

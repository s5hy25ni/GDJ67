package com.min.edu;

// 게임의 구현해야할 주 기능을 선언하는 interface
//TODO 001 같은 타입의 interface는 extends를 통해 여러개 확장이 가능하다.
public interface IGame extends IGame_Conf, IGame_Bin{

	public int AGE = 100;
//	private int NUM = 200; //private(상속X)나 protected(당연함)는 안된다. => 다른 자식클래스의 구현체이기 때문
//	protected int NUM = 200;
	
	// interface는 추상메소드의 집합체이다.
	public String makeA(); // 메소드의 선언, { code block 구현 }
	String makeB();  // public을 명시하지 않아도 public
	
	// java8
	// 인터페이스에 기본 메소드를 정의하는 기능이 추가되었다.(공통메소드)
	// 이러한 메소드는 기본 키워드(default)를 사용하여 지정되어 인터페이스 내부에 구현을 포함할 수 있다.
	// 구현 클래스에 의해서 재정의(Override)되지 않는 한(전제조건) 기본메서드가 사용됨
	// why? default method는 인터페이스를 사용할 때 기존의 클래스를 손상하시키지 않고 인터페이스에 메소드를 추가하기 위해서
	
	default void print(String a) {
		System.out.println("interface 메소드");
	}
	
	// java 8
	// static (정적) 메소드
	// 일반 클래스의 static 메소드와 유사하게 작동
	// 인터페이스에 속하여 context(인터페이스 이름, 주소가 고정되어 있기 때문에)를 통해서만 호출할 수 있음.
	static int sum(int n) {
		return n+10;
	}
	
	// 연산의 기능은 복잡도가 높을 경우 메소드를 분리하여 코드를 작성
	// Java9에서 static 메소드를 위한 연산을 비공개로 처리해주는 분리코드를 작성할 수 있음
	// 코드의 중복 제거
	private static String getString() {
		return "string";
	}
	
	default void printString() {
		System.out.println(getString());
	}
	
	// 숨기는 class를 작성할 수 있다.
	// innerClass를 생성할 수 있다.
	class HelperClass {
		public void helperMethod() {
			System.out.println("인터페이스에 선언한 innerClass");
		}
	}
}

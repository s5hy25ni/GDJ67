package com.min.edu;

// Child의 부모 클래스
// 생성자를 오버라이드
// 메소드를 생성 -> 자식이 오버라이드
// 오버로딩을 같은 클래스가 아닌 부모가 가지고 있는 메소드명으로 생성
public class Parent {

	// 멤버필드
	public int num;
	
	// default 생성자 : 클래스명과 같고 반환타입이 없으며 외부에서 instance를 만들기 위해 단 1회 호출
	public Parent() { //TODO 05
//		print(); // 자신의 멤버를 호출하기 위해서는 부모가 메모리에 생성되어야 함 => super()
		super(); // 최상위 부모인 Object의 생성자 //TODO 06
		print(); // this.print(); TODO 07
		System.out.println("부모의 생성자"); //TODO 08
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	// 멤버메소드
	public void print() {
		System.out.println("부모의 print");
	}

	public int getNum() {
		return num;
	}
	
	
	
}

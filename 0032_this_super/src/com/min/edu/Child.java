package com.min.edu;

public class Child extends Parent {
	
	// 멤버필드
	public int num;
	private int age;
	
	public Child() { //TODO 03
//		super(); // 자동 호출
		this(2); //TODO 04
		System.out.println("자식의 생성자"); //TODO 14
	}
	
	public Child(int num) { // 생성자 오버로딩
		super(); //TODO 05
		this.num = num; //TODO 09
		 
		System.out.println(age); //TODO 10
		System.out.println("num 출력(local variable) : "+num); //TODO 11
		System.out.println("자신의 멤버 : "+this.num); //TODO 12
		System.out.println("부모의 멤버 : "+super.num); //TODO 13
	}

	@Override
	public void print() {
		System.out.println("자식의 print method");
	}
	
	public void callParentPrint() {
		super.print();
	}

	// @Override(java.lang.*)는 없어도 됨 ▲가 Override 표시
	// 같은 접근제한자, 반환타입, 메소드명, 아규먼트를 구현 -> 오버라이드
	// 메소드만 오버라이드가 됨(멤버필드 XX)
	public int getNum() {
		return num;
	}
	
	public void pirnt(int n) {
		System.out.println("부모가 가지고 있는 메소드 명과 같은 메소드");
	}
}

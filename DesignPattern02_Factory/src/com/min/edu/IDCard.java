package com.min.edu;

/**
 * TODo 006
 * abstract 클래스인 Product를 extends하여
 *  use 메소드를 구현
 * 입력받은 문자열(owner)의 값을 멤버필드에 저장
 */
public class IDCard extends Product{

	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner+"의 카드를 만듭니다.");
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}

	@Override
	public void use() {
		System.out.println(owner+"의 카드를 사용했습니다.");
	}

}

package com.coffee.machine;

/**
 * 67기에서 나온 요청사항에 따라 작성한 커피 연산 클래스
 * @author GDJ67
 * @since 2023.04.20
 */
public class Money {
	/**
	 *  잔돈
	 */
	private int money;
	
	/**
	 *  잔수
	 */
	private int cup;
	
	/**
	 * 돈을 입력받아 잔돈과 잔수를 계산한느 로직을 구현한 메소드
	 * @param money
	 */
	public void coffee_cal(int money) {
		cup = money / 1000;
		this.money = money % 1000;
	}

	/** 
	 * 멤버필드의 잔돈으로 반환해주는 메소드
	 * @return 잔돈 int
	 */
	public int getMoney() {
		return money;
	}

	/** 
	 * 멤버필드의 잔수를 반환하는 메소드
	 * @return 잔수 int
	 */
	public int getCup() {
		return cup;
	}
	
	
	
//	public int exchange() {
//		int m = 0;
//		
//		return m;
//	}
//	
//	public int leftCup() {
//		int c = 0;
//		return c;
//	}
}

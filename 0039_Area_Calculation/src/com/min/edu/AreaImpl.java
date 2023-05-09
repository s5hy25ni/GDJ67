package com.min.edu;

/**
 * Abstract 클래스로 각 면적을 계산하는 자식 클래스들이
 * extends하여 멤버 필드를 통해 필요한 x와 y값을 입력받고<br>
 * 결과를 담을 수 있는 멤버필드를 가지고 있는 클래스<br>
 * 공통기능인 print()를 구현
 *
 */
public abstract class AreaImpl implements IArea {

	/**
	 * 자식 클래스에서 사용하는 공통 변수 x
	 */
	protected int x;

	/**
	 * 자식 클래스에서 사용하는 공통 변수 x
	 */
	protected int y;
	
	/**
	 * 자식 클래스에서 cal을 통해 연산된 결과를 담는 변수 result
	 */
	protected double result;

	
	public AreaImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 각 면적을 계산하는 자식의 클래스에게구현 강요<br>
	 * <b>Interface - &gt; class - &gt, abstrac 메소드 -&gt, 자식이 구현<b>
	 */
	@Override
	public void cal() {
	}

	/**
	 * 면적의 결과를 출력하는 공통 메소드
	 */
	@Override
	public void print() {
		System.out.printf("%d와 %d의 면적의 결과는 %f\n", x, y, result);
	}

}

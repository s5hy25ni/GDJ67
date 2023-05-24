package com.min.edu;

/**
 * TODO 001 각 클래스에서 extends를 통해서 구현해야 될 추상메소드들을 가지고 있는 집합체
 *
 */
public abstract class Factory {
	/**
	 * TODO 005
	 * 클로저 함수
	 */
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registProduct(p);
		return p;
	}

	/**
	 * TODO 002
	 * 값을 입력 받아 Product 객체를 생성하는 메서드
	 */
	protected abstract Product createProduct(String owner);
	
	/**
	 * TODO 003
	 * 생성된 Product 객체를 모아서 관리해주는 메소드
	 */
	protected abstract void registProduct(Product product);
}

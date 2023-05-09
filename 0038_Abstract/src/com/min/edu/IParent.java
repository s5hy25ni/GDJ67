package com.min.edu;

/**
 * interface로 사용되어 구현해야 할 기능을 미리 정의해 놓는다.
 *
 */
public interface IParent {
	
	/**
	 *  기능의 구현을 위한 메소드 선언
	 */
	public void make();
	
	/**
	 * comm 기능으로(공통기능) 결과를 출력해주는 메소드 선언
	 */
	public void print();
	
}

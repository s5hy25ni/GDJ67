package com.min.edu;

public class UserDefindException extends Exception {

	/**
	 * jvm한테 알아먹으라고 던져주는 id
	 */
	private static final long serialVersionUID = -2934992277101747455L;

	public UserDefindException() {
//		super(); // -> Exception
		this("사용자 예외처리 클래스");
	}

	public UserDefindException(String message) {
		super(message); // -> Exception(String message)
	}
	
	
	
	
}

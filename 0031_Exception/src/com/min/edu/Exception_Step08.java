package com.min.edu;

public class Exception_Step08 {
	// throw와 throws를 통해서 예외처리 메세지를 전달하여 원하는 메시지를 처리할 수 있다.
	// throws가 된 메소드는 사용할 떄 반드시 호출한 곳에서 예외처리를 해줘야 한다.
	
	public void makeException() throws Throwable {
		throw new Exception("예외처리의 글자를 바꿔봅니다.");
	}
}

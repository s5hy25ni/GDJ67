package com.min.edu;

/**
 * TODO001 Skip Return 문법
 * 1) 반환타입이 있다면 반드시 return 예약어를 사용하여 값을 반환해줘야 함.
 * 2) return문은 끝 블록에 도달하기 전에 종료하기 위해 반환타입은 void 만들고 return 작성
 */
public class SkipReturn {
	// 입력받은 arguments의 값이 비어있다면("") 출력을 하지 않고 메소드 종료
	public void flagPrint(String msg) {
		if(msg == "") {
			// 하위에 있는 모든 코드를 실행하지 XX
			return;
		}
		System.out.println("전달받은 message 값 : "+msg);
		
//		if(msg != "") {
//			System.out.println("전달받은 message 값 : "+msg);
//		}
		
//		if(msg == "") {
//			
//		} else {
//			System.out.println("전달받은 message 값 : "+msg);
//		}
	}
}

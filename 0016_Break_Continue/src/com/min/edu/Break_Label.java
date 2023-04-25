package com.min.edu;

public class Break_Label {
	
	// 이중for문이나 다중for문의 경우 현재 루프를 특정 루프로 이동 -> 쓰지 말 것
	public static void main(String[] args) {
		myLoop:for(int i = 0; i<10; i++) {
			System.out.println("상위 i for문 : "+i);
			for (int j = 0; j < 10; j++) {
				System.out.println("하위 j for문 : "+j);
//				break; // 도달하지 않는 코드가 생김
				break myLoop;
			}
		}
	}
}

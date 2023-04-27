package com.min.edu;

public class GeneralClass {
	/*
	 * TODO 001 클래스를 만들면 자동으로 클래스명과 같은 이름의 반환이 없는 메소드가 생성
	 * 			보이지 않음
	 * 			-> default 생성자
	 */
	
	private static int cnt;
	
	/*
	 * TODO 002 메소드이기 때문에 접근제한자를 private로 하면 외부에서 접근이 불가능 -> 인스턴스화 불가능
	 * 			멤버필드 없이 멤버메소드만 존재할 경우 new를 통해 계속 객체를 생성하거나 static으로 만들 경우 메모리 낭비가 심함
	 *  		private로 만들어 사용시 1번만 호출하도록 함
	 */
	public GeneralClass() { 
		System.out.println("이전의 객체 갯수 : "+cnt);
		cnt++;
	}

	public int getCnt() { // non-static이  static 접근 가능
		return cnt;
	}
}

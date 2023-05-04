package com.min.seq;

/**
 * 개미수열의 연산 클래스
 * 11 -> 12
 * 
 */
public class AntSeq_Process {
	
	public void ant_Iterator(int stage) {
		String val = "11";
		System.out.println(val);
		for (int i = 1; i < stage; i++) {
			val = process(val);
			System.out.println(val);
		}
	}
	
	/**
	 * 
	 * @param x 처음 시작하는 개미수열의 값 문자열 "11"
	 */
	public String process(String x) {
		String result = "";
		int count = 1; // 자신의 갯수 1개는 기본으로 가지고 있음
		char initValue = x.charAt(0); // 비교할 대상 첫 번째 초기값
		
		for (int i = 1; i < x.length(); i++) {
			if(initValue == x.charAt(i)) {
				count++;
			} else {
				result = result+initValue+count;
				initValue = x.charAt(i);
				count = 1;
			}
		}	
		result = result+initValue+count;
		return result;
	}
}

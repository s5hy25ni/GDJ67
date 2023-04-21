package com.min.edu;

// 논리 연산자 && || (short circuit)
public class Logical_Operation {
	public void logical() {
		boolean isc1 = true & false; // false;
		boolean isc2 = true | false; // true;
		boolean isc3 = !(true); // false; 부정연산자
	}
	
	// & 선행 연산과 후행 연산을 모두 확인
	// && 선행의 연산 결과에 따라 후행 연산 여부가 정해짐 -> 선행 연산이 false이면 후행 연산 X
	public void shortcircuit() {
			
		// 1) 선행이 true라면 후행이 실행되는 시나리오 증명
		boolean isc1 = trueValue() && falseValue();
		System.out.println();
		// 2) 선행이 false라면 후행이 실행되지 않는 시나리오 증명
		boolean isc2 = falseValue() && trueValue();
	}
	
	public boolean trueValue() {
		System.out.println("trueValue 실행");
		return true;
	}
	
	public boolean falseValue() {
		System.out.println("falseValue 실행");
		return false;
	}
}

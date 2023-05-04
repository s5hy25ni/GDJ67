package com.min.edu;

import java.util.Arrays;

// FinalClass가 extends가 가능한 클래스이다.
// 만약 FinalClass가 final로 작성되어 있다면 extends는 문법 오류
public class ChildClass extends FinalClass {
	
	public ChildClass() {
		parentUserMethod();
	}

	private void parentUserMethod() {
//		ARR = null; final은 재입력 XX
//		AGE = 100; final은 재입력 XX
//		change(); // extends
		
		ARR[0] = 100;
		int[] copyARR = getArr();
		copyARR[0] = 999;
		System.out.println("원본 : "+Arrays.toString(ARR));
		System.out.println("복사 : "+Arrays.toString(copyARR));		
		
	}

	@Override
	public String callMethod() { // 부모가 final로 선언하면 override 안됨
		return "난 자식임";
	}
	
	
}

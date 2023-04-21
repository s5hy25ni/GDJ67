package com.min.edu.bmi;

/**
 * bmi를 계산하는 메소드가 있는 클래스
 * @author GDJ67
 *
 */
public class BmiClass {

	/*
	 * <요구사항>
	 * bmi_caculation 메소드명
	 * 실수(double) 반환
	 * 입력 정수(몸무게), 실수(키)
	 * 연산 몸무게/(키*키)
	 */
	
	public double bmi_caculation(int kg, double m) {
		double result = kg/(m*m);
		
		return result;
	}
}

package com.min.edu;

/**
 * 삼각형 면적을 계산하는 클래스
 *
 */
public class Triangle extends AreaImpl {

	public Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	public void cal() {
		result = x * y * 0.5;
	}
	
		
}

package com.min.edu;

//TODO 001 전달받은 arguments 실제의 값을 기본타입과 참조타입을 받는 메소드를 통해서 arguments의 값 변경
public class ValueChange {
	
	/**
	 * 기본타입을(pbv)은 값을 복제해준다. 따라서 메소드에서 전달받은 num을 변경해도 원본값은 유지한다.
	 * @param num 기본 타입
	 */
	public void changePrimitive(int num) {
		num += 100;		
	}
	
	/**
	 * 참조타입(pbr)은 주소를 전달해준다. 따라서 주소를 전달받은 어떠한 곳에서도 원본의 값 변경이 가능하다.  
	 * @param nums 참조 타입
	 */
	public void changeReference(int[] nums) {
		nums[0] += 100;
	}
}

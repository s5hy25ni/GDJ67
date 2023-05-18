package com.min.edu;

import java.util.regex.Pattern;

import com.edu.util.DefineUtil;

public class Hitter extends GamerImpl {
	
	public Hitter() {
		this(3);
	}

	public Hitter(int n) {
		super(n);
	}
	
	// 사용자가 유효값이 처리된 비교 숫자의 Array 생성
	@Override
	public void make() {
		int n = box.length;
		System.arraycopy(makeNum(), 0, box, 0, n);
		while(true) {
			if(checkArray()) {
				System.out.println("중복된 값을 입력하셨습니다.");
				System.arraycopy(makeNum(), 0, box, 0, n);
			} else {
				break;
			}
		}
	}
	
	private int[] makeNum() {
		int[] tmp = new int[box.length];
		
		System.out.println("정수 3개를 붙여서 입력해주세요.");
		
		String str = DefineUtil.getString();
		System.out.println("입력하신 숫자는 !! "+str);
		
		// 정규화 표현식 문자열 검증 java.util.regex.Pattern maches();
		// 숫자만 입력 받음
		String pattern = "^[1-9]*$";
		while(str.trim().equals("") || str.trim().length() != box.length || !Pattern.matches(pattern, str)) {
			System.out.println("다시 입력해 주세요");
			str = DefineUtil.getString();
		}
//		String testValue = "123";
//		boolean regex = Pattern.matches(pattern, testValue); // false하면 사용할 수 없음
//		System.out.println("입력한 값이 1~9까지 숫자입니까? " + regex);
		
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = Character.getNumericValue(str.charAt(i));
		}
		
		return tmp;
	}
	
	private boolean checkArray() {
//		box = new int[] {1,2,1};
		boolean isc = false;
		
		int n = box.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i != j && box[i] == box[j]) {
					isc = true;
				}
			}
		}
		
		return isc;
	}
	
}

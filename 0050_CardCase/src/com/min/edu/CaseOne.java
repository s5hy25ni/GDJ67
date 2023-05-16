package com.min.edu;

import java.util.Objects;

/**
 * 모양과 숫자를 랜덤으로 조합하여 카드 한 장을 만들어 냄
 * @author GDJ67
 *
 */
public class CaseOne {

	private String one;
	
	public static final String[] SHAPE = {"◆", "♥"};
	public static final String[] NUMBER = {"1","2","3","4"};
	
	public CaseOne() {
		int s = (int)(Math.random()*SHAPE.length);
		int n = (int)(Math.random()*NUMBER.length);
		one = SHAPE[s]+NUMBER[n];
	}

	public String getOne() {
		return one;
	}

	@Override
	public String toString() {
		return String.format("%s", one);
	}

	@Override
	public int hashCode() {
		return Objects.hash(one);
	}

	@Override
	public boolean equals(Object obj) {
		boolean isc = false;
		CaseOne other = (CaseOne) obj;
		if(one.equals(other.getOne())) {
			isc = true;
		}
		
		return isc;
	}
	
	
}

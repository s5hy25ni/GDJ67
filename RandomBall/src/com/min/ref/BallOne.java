package com.min.ref;

import java.util.Objects;

/**
 * 랜덤 숫자 1개를 생성하는 클래스
 * @author GDJ67
 *
 */
public class BallOne {
	private int ball;
	
	public BallOne() {
		ball = (int)(Math.random()*45)+1;
	}

	public int getBall() {
		return ball;
	}

	@Override
	public String toString() {
		return "[ " + ball + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ball); // ball로 hashcode를 만들어서 object에 넘김
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // this 패키지명.클래스를 비교
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // getClass() 패키지명
			return false;
		BallOne other = (BallOne) obj;
		return ball == other.ball;
	}
	
	
}

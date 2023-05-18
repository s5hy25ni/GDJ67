package com.min.edu;

/**
 * 컴퓨터가 자동으로 숫자를 생성
 * @author GDJ67
 * @since 2023.05.18
 */
public class Pitcher extends GamerImpl {
	
	public Pitcher() {
		this(3);
	}

	public Pitcher(int n) {
		super(n);
	}

	/**
	 * 난수를 발생시키는 메소드와 중복 검사 메소드를 사용<br>
	 * 멤버필드의 랜덤 숫자의 묶음을 만들어 줌
	 */
	@Override
	public void make() {
		int idx = 0;
		while (true) {
			int num = makeNum();
			if(!checkBox(num)) {
				box[idx++] = num;
			}
			if(idx==box.length) {
				break;
			}
		}
	}
	
	/**
	 * 난수를 발생시키는 메소드
	 */
	private int makeNum() {
		return (int)(Math.random()*9)+1;
	}
	
	/**
	 * 멤버필드의 array에서 중복되는 값의 여부 판단
	 * @param 무작위 숫자
	 * @return 중복이면 true, 아니라면 false
	 */
	private boolean checkBox(int randomNum) {
		boolean isc = false;
		
		for (int i = 0; i < box.length; i++) {
			if(box[i]==randomNum) {
				isc = true;
				return isc;
			}
		}
		
		return isc;
	}

}

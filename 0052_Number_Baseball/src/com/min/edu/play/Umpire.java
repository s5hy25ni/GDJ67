package com.min.edu.play;

// Dto -> get, set만
// Bean -> 기능 추가
/**
 * 생성된 pitcher와 hitter를 사용하여 strike과 ball을 판단하는 bean 클래스
 * @author GDJ67
 *
 */
public class Umpire {
	private int[] pBall;
	private int[] hBall;

	public void setpBall(int[] pBall) {
		this.pBall = pBall;
	}

	public void sethBall(int[] hBall) {
		this.hBall = hBall;
	}
	
	/**
	 * 멤버필드의 pBall과 hBall을 판단하여 같은 index와 같은 값을 판단하여 cnt 반환
	 */
	public int getStrike() {
		int cnt = 0;
		for(int i = 0; i < hBall.length; i++) {
			if(pBall[i]==hBall[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	/**
	 * 멤버필드의 pBall과 hBall을 판단하여 같은 index는 다르지만 같은 값을 판단하여 cnt 반환
	 */
	public int getBall() {
		int cnt = 0;
		for (int i = 0; i < pBall.length; i++) {
			for (int j = 0; j < hBall.length; j++) {
				if(i != j && pBall[i] == hBall[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}

package com.min.edu.play;

import java.util.Scanner;

import com.edu.util.DefineUtil;
import com.min.edu.Hitter;
import com.min.edu.Pitcher;
import com.min.edu.comm.BaseBallConst;

/**
 * 게임의 전반적인 생성과 판단 종료
 * @author GDJ67
 *
 */
public class BaseBallGame {

	private int len; // 전체적인 게임의 배열의 길이
	private Pitcher pBox; // 컴퓨터 숫자를 생성하고 가지고 있는 클래스
	private Hitter hBox; // 사용자가 숫자를 입력하는 클래스
	private Umpire ump; // 판단하는 객체
	
	private static BaseBallGame instance;
	
	public BaseBallGame getInstance(int n) {
		if(instance == null) {
			instance = new BaseBallGame();
		} 
		return instance;
		
	}
	public BaseBallGame() {
		this(3);
	}
	public BaseBallGame(int n) {
		this.len = n;
		this.pBox = new Pitcher(n);
		this.hBox = new Hitter(n);
		this.ump = new Umpire();		
	}
	
	public void newGame() {
		String answer;
		do {
			play();
			answer = DefineUtil.getAnswer("게임을 다시 시작하시겠습니까? Y or N");
			if(answer.equalsIgnoreCase("N")){
				System.out.println("겜 종료");
			}
		} while(answer.equalsIgnoreCase("Y"));
	}
	
	private void play() {
		int num = 0;
		int strike = 0;
		int ball = 0;
		
		// 자동 번호 생성
		pBox.make();
//		pBox.print(pBox.getBox()); // 출력 테스트
		ump.setpBall(pBox.getBox());
		
		while(num != BaseBallConst.ITERATOR) {
			num++;
			System.out.println("현재 남은 게임의 횟수 : "+(BaseBallConst.ITERATOR - num));
			
			hBox.make();
//			System.out.println("사용자가 입력한 숫자는? :"+hBox.toString());
			ump.sethBall(hBox.getBox());
			
			strike = ump.getStrike();
			ball = ump.getBall();
			
			System.out.printf("당신의 결과는 Strike : %d, Ball : %d\n",strike, ball);
			
			if(strike == BaseBallConst.STRIKE) {
				break;
			}
			
		}
		
		if(strike==BaseBallConst.STRIKE) {
			System.out.println("맞췄습니당. 츄캬");			
		}else {
			System.out.println("졌습니당ㅜㅜ");
			System.out.printf("Pitcher의 숫자는 ===> %s\n", pBox.toString());
		}
	}
	
}

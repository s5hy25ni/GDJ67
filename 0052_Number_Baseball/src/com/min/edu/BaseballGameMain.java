package com.min.edu;

import com.edu.util.DefineUtil;
import com.min.edu.play.BaseBallGame;
import com.min.edu.play.Umpire;

public class BaseballGameMain {

	public static void main(String[] args) {

		//TODO 001 라이브러리 생성 및 테스트
//		System.out.println(DefineUtil.getNum());
//		System.out.println(DefineUtil.getString());
		
		//TODO 002 pitcher 관련 테스트
//		Pitcher p = new Pitcher();
//		int num = p.makeNum();
//		System.out.println(num);
//		boolean isc = p.checkBox(num);
//		System.out.println(isc);
//		boolean isc2 = p.checkBox(-1);
//		System.out.println(isc2);
		
//		p.make();
//		System.out.println(p);
//		p.print();
		
		//TODO 003 hitcher 관련 테스트
//		Hitter h = new Hitter();
//		boolean isc = h.checkArray();
//		System.out.println(isc);
//		int[] textBox = h.makeNum();
//		System.out.println(Arrays.toString(textBox));
		
//		h.make();
//		h.print();
//		int[] box = h.getBox();
//		h.print(box);
		
		//TODO 004 umpire 관련 테스트
//		int[] h1 = {1,2,3};
//		int[] p1 = {3,2,4};
//		Umpire u1 = new Umpire(h1, p1);
//		
//		int strike1 = u1.getStrike();
//		int ball1 = u1.getBall();
//		
//		System.out.printf("스트라이크 : %d, 볼 : %d\n",strike1, ball1);
//		
//		int[] h2 = {1,2,3};
//		int[] p2 = {1,2,3};
//		Umpire u2 = new Umpire();
//		u2.setpBall(p2);
//		u2.sethBall(h2);
//		
//		int strike2 = u2.getStrike();
//		int ball2 = u2.getBall();
//		
//		System.out.printf("스트라이크 : %d, 볼 : %d\n",strike2, ball2);
		
		//TODO 005 게임 로직 테스트
//		BaseBallGame game = new BaseBallGame();
//		game.play();
		
		//TODO 006 라이브러리 테스트
//		String answer = DefineUtil.getAnswer("게임을 다시 시작하시겠습니까? Y or N");
//		System.out.println(answer);
		
		//TODO 007 숫자 야구 게임 완료 테스트 - 시나리오 테스트
		
		BaseBallGame game = new BaseBallGame();
		game.newGame();
	}

}

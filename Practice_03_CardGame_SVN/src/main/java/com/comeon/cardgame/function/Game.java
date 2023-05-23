package com.comeon.cardgame.function;

import com.comeon.cardgame.tool.Player;
import com.comeon.cardgame.tool.Room;

public class Game {
	Dealer dealer;
	static Room room;
	Change change;
	Betting betting;
	CompareImpl compare;

	boolean isUserWin;
	boolean isGameEnd;

	public Game() {
		dealer = Dealer.getInstance();
		change = new Change();
		betting = new Betting();
		isUserWin = false;
		isGameEnd = false;
	}

	public void play() {
		String name = "유저"; // 입력받아야 함
		int mode = 1; // 입력받아야 함
		room = dealer.createRoom(mode);
		dealer.addUser(name);
		newGame();
	}

	public void newGame() {
		while (true) {
			dealer.clear();
			dealer.addUser();
			// 참가비 지불
			// 보스 선정
			// 룸의 게임 모드, 현재 판 돈, boss를 출력한다.
			// 첫 카드 분배
			compare.makeJokboAndChange();
			// 유저 info 알림
			// 첫 베팅 -> player들의 베팅이 끝날 때마다 콜 금액을 알려줌
			changeAndBetting();
			if (isUserWin) {
				// 유저한테 판 돈 주고, 딜리버 지급함
				break;
			} else if (isGameEnd) {
				break;
			}
		}
	}

	private void changeAndBetting() {
	 for(int i = 0; i<3; i++){
	  // 교환
		 compare.makeJokboAndChange();
		// 유저 info 알림
	  // 베팅 -> player들의 베팅이 끝날 때마다 콜 금액을 알려줌
	  // 유저 info 알림
	  betting.베팅();
	  if((dieCnt == room.getPlayers.size()-1)){
	    gameEnd = true;
	    isUserWin = true;
	    break;
	   } elas if( room.getPlayers.get(0).getIsDie ){
	    gameEnd = true;
	    break;
	   } 
	 }
	}
}

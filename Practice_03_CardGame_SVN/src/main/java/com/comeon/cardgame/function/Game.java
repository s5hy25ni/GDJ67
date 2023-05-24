package com.comeon.cardgame.function;

import com.comeon.cardgame.tool.Room;

public class Game {
	Dealer dealer;
	static Room room; // player -> room.getPlayers().get(idx);
	Change change;
	Betting betting;
	CompareImpl compare;

	boolean isUserWin;
	boolean isGameEnd;
	int dieCnt;

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
		compare = dealer.createCompare(mode);
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
		for (int i = 0; i < 4; i++) {
			// if(첫교환이면 -> 분배, 그 이후는 교환)
			compare.makeJokboAndChange();
			// 유저 info 알림
			// 베팅 -> player들의 베팅이 끝날 때마다 콜 금액을 알려줌
			// 유저 info 알림
			if ((dieCnt == room.getPlayers().size() - 1)) {
				isGameEnd = true;
				isUserWin = true;
				break;
			} else if (room.getPlayers().get(0).getIsDie()) {
				isGameEnd = true;
				break;
			}
		}
	}
}

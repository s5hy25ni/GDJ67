package com.comeon.cardgame.tool;

import java.util.Arrays;

public class Player {
	private static int computerCnt = 0;
	private String name;
	private int[] changeCnt;
	private int money;
	private String jokbo;
	
	public Player() {
		this("Computer_"+computerCnt);
		computerCnt++;
	}

	public Player(String name) {
		this.name = name;
		changeCnt= new int[3];
		Arrays.fill(changeCnt, -1);
		money = 1000000000;
		jokbo = "";
	}

}

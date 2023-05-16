package com.comeon.badugi.process;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Objects;

public class Player {
	private static int cnt = 1;
	private String name;
	private int[] changeNum;
	private int money;
	private CardOne[] myCard;
	
	public Player() {
		this("computer_"+cnt);
		// 플레이어의 타입은
	}

	public Player(String name) {
		this.name = name;
		changeNum = new int[3];
		money = 1000000000;
		myCard = new CardOne[4];
	}

	public String getName() {
		return name;
	}

	public String getChangeNum() {
		return changeNum[0]+"/"+changeNum[1]+"/"+changeNum[2];
	}

	public void setChangeNum(int idx, int num) {
		changeNum[idx] = num;
	}

	public String getMoney() {
		DecimalFormat df = new DecimalFormat("\u00A4 ###,###");
		
		return df.format(money);
	}

	public void setMoney(int sum) {
		money += sum;
	}

	public CardOne[] getMyCard() {
		return myCard;
	}

	public void setMyCard(int idx, CardOne one) {
		myCard[idx] = one;
	}

	@Override
	public String toString() {
		return "[" + name + "]\t" + getChangeNum() +"\t"+ getMoney();
	}

	
	
	
}
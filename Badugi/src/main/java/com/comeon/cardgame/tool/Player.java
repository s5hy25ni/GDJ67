package com.comeon.cardgame.tool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Player {

	private static int comCnt = 1;
	private String name;
	private int[] cutCnt;
	private int money;
	private CardOne[] myCard;
	private String jokbo;
	private Set<Integer> cutIdx;
	
	public Player() {
		this("computer_"+(comCnt++));
	}

	public Player(String name) {
		this.name = name;
		cutCnt = new int[3];
		Arrays.fill(cutCnt, -1);
		money = 1000000000;
		myCard = new CardOne[4];
		jokbo = "";
		cutIdx = new HashSet<Integer>();
	}

	public int[] getCutCnt() {
		return cutCnt;
	}

	public void setCutCnt(int[] cutCnt) {
		this.cutCnt = cutCnt;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public CardOne[] getMyCard() {
		return myCard;
	}

	public void setMyCard(CardOne[] myCard) {
		this.myCard = myCard;
	}

	public String getJokbo() {
		return jokbo;
	}

	public void setJokbo(String jokbo) {
		this.jokbo = jokbo;
	}

	public String getName() {
		return name;
	}
	
	public Set<Integer> getCutIdx() {
		return cutIdx;
	}

	public void setCutIdx(Set<Integer> cutIdx) {
		this.cutIdx = cutIdx;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", cutCnt=" + Arrays.toString(cutCnt) + ", money=" + money + ", myCard="
				+ Arrays.toString(myCard) + ", jokbo=" + jokbo + "]";
	}
	
	

}

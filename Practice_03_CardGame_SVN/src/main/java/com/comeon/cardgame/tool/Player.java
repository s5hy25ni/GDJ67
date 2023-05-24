package com.comeon.cardgame.tool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Player {
	
	private String name;
	private int[] changeCnt;
	private int money;
	private CardOne[] myCard;
	private String jokbo;
	private Set<Integer> changeIdx;
	private boolean isDie;
	private boolean isCom = false;
	
	public Player(String name) {
		this.name = name;
		changeCnt = new int[3];
		Arrays.fill(changeCnt, -1);
		money = 1000000000;
		myCard = new CardOne[4];
		jokbo = "";
		changeIdx = new HashSet<Integer>();
		isDie = false;
	}

	public String getName() {
		return name;
	}
	
	public int[] getChangeCnt() {
		return changeCnt;
	}

	public void setChangeCnt(int[] changeCnt) {
		this.changeCnt = changeCnt;
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

	public Set<Integer> getChangeIdx() {
		return changeIdx;
	}

	public void setChangeIdx(Set<Integer> changeIdx) {
		this.changeIdx = changeIdx;
	}

	public boolean getIsDie() {
		return isDie;
	}

	public void setIsDie(boolean isDie) {
		this.isDie = isDie;
	}

	public boolean isCom() {
		return isCom;
	}

	public void setCom(boolean isCom) {
		this.isCom = isCom;
	}

}

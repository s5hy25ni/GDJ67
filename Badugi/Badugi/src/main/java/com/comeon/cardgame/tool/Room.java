package com.comeon.cardgame.tool;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private String mode;
	private CardCase cards;
	private List<Player> players;
	private int seed;
	private int boss;
	
	public Room(String mode) {
		this.mode = mode;
		cards = new CardCase();
		players = new ArrayList<Player>();
		seed = 0;
		boss = -1;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
	}

	public int getBoss() {
		return boss;
	}

	public void setBoss(int boss) {
		this.boss = boss;
	}

	public String getMode() {
		return mode;
	}

	public CardCase getCards() {
		return cards;
	}

	//TODO 001 toString()
	@Override
	public String toString() {
		return "mode=" + mode + ",cards=" + cards.getCardcase().size() + ", players=" + players + ",seed=" + seed + ", boss=" + boss;
	}
	
}
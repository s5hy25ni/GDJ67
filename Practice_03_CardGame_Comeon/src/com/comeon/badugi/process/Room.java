package com.comeon.badugi.process;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private int mode;
	private CardCase cards;
	private List<Player> players;
	private int seed;
	
	public Room(int mode) {
		this.mode = mode;
		cards = CardCase.getInstance();
		players = new ArrayList<Player>();
		seed = 0;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Player player) {
		players.add(player);
	}

	public int getSeed() {
		return seed;
	}

	public void setSeed(int sum) {
		seed += sum;
	}

	public int getMode() {
		return mode;
	}

	public CardCase getCards() {
		return cards;
	}
	
	
	
}

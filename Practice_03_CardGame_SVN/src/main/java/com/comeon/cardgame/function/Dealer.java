package com.comeon.cardgame.function;
import com.comeon.cardgame.tool.Player;
import com.comeon.cardgame.tool.Room;

public class Dealer {
	
	private static Dealer dealer;
	private int comCnt;
	
	private Dealer() {
		comCnt = 0;
	}
	
	public static Dealer getInstance() {
		if(dealer==null) {
			dealer = new Dealer();
		}
		return dealer;
	}
	
	public Room createRoom(int intMode) {
		String strMode = modeToStr(intMode);
		return new Room(strMode);
	}

	private String modeToStr(int intMode) {
		String strMode = switch (intMode) {
		case 2-> "하이바둑이";
		case 3->"리버스바둑이";
		default ->"로우바둑이";
		};
		return strMode;
	}
		
	public void addUser() {
		addUser(2);
	}
	
	public void addUser(int number) {
		for (int i = 0; i < number-1; i++) {
			addUser("computer_"+(++comCnt));			
		}
	}
	
	public void addUser(String name) {
		Player player = new Player(name);
		Game.room.getPlayers().add(player);
	}
	
	public CompareImpl createCompare(int mode) {
		CompareImpl compare = switch (mode) {
		case 1 ->new CompareLow();
		case 2 ->new CompareHigh();
		default ->new CompareReverse();
		};
		
		return compare;
	}
	
	public void clear() {
		comCnt = 0;
		Game.room.getPlayers().subList(1, Game.room.getPlayers().size()-1).clear();
	}

}

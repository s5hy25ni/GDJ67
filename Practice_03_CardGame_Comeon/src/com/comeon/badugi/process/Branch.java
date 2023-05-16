package com.comeon.badugi.process;

public class Branch {

	private static Branch branch;
	
	public static Branch getInstance() {
		if(branch == null) {
			branch = new Branch();
		}
		return branch;
	}
	
	public GameImpl choiceMode(int choice) {
		GameImpl game = switch(choice) {
		case 1->game = new GameLow();
		case 2->game= new GameHigh();
		default ->game = new GameReverse();
		};
		return game;
	}
	
}

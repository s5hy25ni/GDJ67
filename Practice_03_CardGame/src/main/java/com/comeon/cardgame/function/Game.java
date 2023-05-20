package com.comeon.cardgame.function;

import com.comeon.cardgame.tool.Player;
import com.comeon.cardgame.tool.Room;

public class Game {
	
	private Player gamer;
	private String mode;
	private Room room;
	
	public Game() {
		mode = "";
	}
	
	public void enterPlayer() {

		// 닉네임을 입력 받는다.
		gamer = new Player("닉네임");
		
	}
	
	public void play() {
		
		// if(mode != "") {게임 모드를 입력받는다.} 
		
		  
		
	}
	
	public void newGame() {
		
	}
	

}

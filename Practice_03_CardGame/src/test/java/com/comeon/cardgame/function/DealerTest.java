package com.comeon.cardgame.function;

import static org.junit.Assert.*;

import org.junit.Test;

import com.comeon.cardgame.tool.Player;
import com.comeon.cardgame.tool.Room;

public class DealerTest {

	@Test
	public void test() {
//		Dealer dealer1 = Dealer.getInstance();
//		dealer1.createRoom(1);
//		Room room1 = dealer1.getRoom();
//		System.out.printf("dealer1의 room : %s\n", room1.toString());
//		Dealer dealer2 = Dealer.getInstance();
//		Room room2 = dealer2.getRoom();
//		room2.setSeed(2000);
//		System.out.printf("dealer1의 room : %s", room1.toString());
		
		Dealer dealer = Dealer.getInstance();
		dealer.createRoom(1); // 숫자는 1,2,3 중 하나
		Room room = dealer.getRoom();
		dealer.addUser(new Player("user"));
		dealer.addUser(new Player());
//		System.out.println(room.toString());
		
	}

}

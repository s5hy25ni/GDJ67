package com.comeon.badugi.process;

public abstract class GameImpl implements IGame {

	public static int seed;
	public static Player[] players;
	public CardCase bundle = CardCase.getInstance();
	
	@Override
	public abstract void test();
	
}

package com.min.edu;

public class GameImpl implements IGame {

	@Override
	public String makeA() { //IGame
		System.out.println("일반 클래스가 구현했다.");
		return null;
	}

	@Override
	public String makeB() {
		System.out.println("일반 클래스가 구현했다.");
		return null;
	}
	
	@Override
	public void print_Conf() {
		System.out.println("일반 클래스가 구현했다.");
	}

}

package com.sh.test;

public class AntSeq_Main {

	public static void main(String[] args) {
		Util util = new Util();
		AntSeq ant = new AntSeq();
		
		System.out.print("층수를 입력해 주세요 : ");
		int stage = util.inputIntValue();
		ant.printAnt(stage);
	}

}

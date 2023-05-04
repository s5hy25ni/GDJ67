package com.min.seq;

import com.min.util.InputUtil;

public class AntSeq_Main {

	public static void main(String[] args) {
		AntSeq_Process ant = new AntSeq_Process();
		System.out.println("층수를 입력해주세요!");
		int stage = InputUtil.inputNum();
		ant.ant_Iterator(stage);
	}

}

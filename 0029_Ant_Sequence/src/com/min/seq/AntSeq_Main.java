package com.min.seq;

import com.min.util.InputUtil;

public class AntSeq_Main {

	public static void main(String[] args) {
		int stage = InputUtil.inputNum();
		System.out.println("입력받은 값 : "+stage);
		AntSeq_Process ant = new AntSeq_Process();
		ant.process("1112222");
	}

}

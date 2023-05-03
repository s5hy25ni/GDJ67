package com.min.method;

import java.util.Arrays;

public class User {
	Input in = new Input();
	
	Lotto[] lottos;
	int[] eachAmt;
	int totalAmt;
	int deposit;
	
	public User(int dep) {
		deposit = dep;
		totalAmt = dep/1000;
		lottos = new Lotto[totalAmt];
	}
	
	public void createLotto(){
		int halfStart = 0;
		for(int i = 0; i<eachAmt[0]; i++) {
			System.out.printf(" ▷ %d번째 Lotto는 수동입니다.\n",i+1);
			lottos[i] = new Lotto(in.inputManualNum());
		}
		for(int i = eachAmt[0]; i<eachAmt[1]; i++) {
			System.out.printf(" ▷ %d번째 Lotto는 수동+자동입니다.\n",i+1);
			System.out.println(" ▷ 0을 입력하시거나 5번째 숫자까지 입력하시면 수동 입력이 종료됩니다.");
			lottos[i] = new Lotto(in.inputHalfNum());
		}
	}
	
	private int getAutoStart(Lotto halfLotto) {
		int start=0;
		
		for (int i = 0; i < halfLotto.length; i++) {
			if(halfLotto[i]==0) {
				start = i;
				break;
			}
		}
		return start;
	}

	@Override
	public String toString() {
		return "User [lottos=" + Arrays.toString(lottos) + ", eachAmt=" + Arrays.toString(eachAmt) + ", totalAmt="
				+ totalAmt + ", deposit=" + deposit + "]";
	}
}

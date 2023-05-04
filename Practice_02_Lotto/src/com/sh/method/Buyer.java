package com.sh.method;

import java.util.Arrays;

public class Buyer {
	Seller sel = new Seller();
	Util ut = new Util();
	
	int deposit;
	int totalAmt;
	int[] eachAmt = new int[3];
	Lotto[] lottos;	
	
	/**
	 * 총 로또 구매 금액(deposit)을 입력받아 멤버필드에 입력하는 메소드<br>
	 * 1,000원 이상부터 1,000원 단위로 받음<br>
	 * deposit = 입력 받은 금액;<br>
	 * totalAmt = deposit/1000;<br>
	 * lottos = new Lotto[totalAmt];
	 */
	void inputDeposit() {
		int dep = 0;
		
		while(true) {
			dep = ut.inputIntValue(" ▶ 입금해주세요 : ");
			if(dep < 1000 || dep%1000 != 0) {
				System.out.println(" ▷ 최소 1,000원 이상 1,000원 단위로 입금해주세요.");
			} else {
				break;
			}
		}
		
		deposit = dep;
		totalAmt = deposit/1000;
		lottos = new Lotto[totalAmt];
	} // inputDeposit()
	
	/**
	 * 각각 로또 장수를 입력받는 메소드<br>
	 * eachAmt[0] = 입력받은 자동 로또 수<br>
	 * eachAmt[1] = 입력받은 반자동 로또 수<br>
	 * eachAmt[2] = 나머지 = 수동 로또 수
	 */
	void inputEachAmt() {
		while(true) {
			eachAmt[0] = ut.inputIntValue(" ▶ 수동 : ");
			if(eachAmt[0]<0 || eachAmt[0]>totalAmt) {
				System.out.printf(" ▷ 0 이상 %d 이하 숫자를 입력해주세요.\n", totalAmt);
			} else {
				break;
			}
		}
		while(true) {
			eachAmt[1] = ut.inputIntValue(" ▶ 수동+자동 : ");
			if(eachAmt[1]<0 || eachAmt[1]>(totalAmt-eachAmt[0])){
				System.out.printf(" ▷ 0 이상 %d 이하 숫자를 입력해주세요.\n", totalAmt-eachAmt[0]);
			} else {
				break;
			}
		}
		eachAmt[2] = totalAmt-eachAmt[0]-eachAmt[1];
		System.out.printf(" ▷ 자동 : %d\n", eachAmt[2]);		
	} // inputLottoNum(int)
	
	void selectHandNums(){
		int halfStart = 0;
		for(int i = 0; i<eachAmt[0]; i++) {
			System.out.printf(" ▷ %d번째 Lotto는 수동입니다.\n",i+1);
			lottos[i] = new Lotto(sel.inputHandNum());
		}
		for(int i = eachAmt[0]; i<eachAmt[1]; i++) {
			System.out.printf(" ▷ %d번째 Lotto는 수동+자동입니다.\n",i+1);
			System.out.println(" ▷ 0을 입력하시거나 5번째 숫자까지 입력하시면 수동 입력이 종료됩니다.");
			lottos[i] = new Lotto(sel.inputHalfNum());
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
		return "deposit = "+deposit+
				"\ntotalAmt = "+totalAmt+
				"\neachAmt = "+Arrays.toString(eachAmt)+
				"\nlottos = " + Arrays.toString(lottos);
	}
}

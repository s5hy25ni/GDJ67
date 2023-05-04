package com.sh.method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seller {
	Util u = new Util();
	
	/**
	 * 수동 로또는 6개의 숫자를 입력받는다.\n
	 * 수동+자동 로또는 사용자가 원하는 만큼 숫자를 입력받는다.
	 * @param manualNum 수동으로 입력할 숫자 개수
	 * @return int[] 사용자가 수동으로 입력한 숫자들 array
	 */
	int[] inputHandNum() {
		int[] num = new int[6];
		int chkNum;
		
		for(int i=0; i<num.length; i++) {
			while(true) {
				chkNum = u.inputIntValue(" ▶ 수동 "+(i+1)+"번째 숫자 : ");
				if(chkNum<1 || chkNum>45) {
					System.out.println(" ▷ 1 이상 45 이하 숫자를 입력해주세요.");
				} else if(u.checkDup(num, chkNum)){
					System.out.printf(" ▷ [%d]는 중복된 숫자입니다. 다시 입력해주세요.\n",chkNum);
				} else {
					num[i] = chkNum;
					break;
				}
			}
		}
		
		return num;
	} // inputManualNums(int)
	
	int[] inputHalfNum() {
		int[] num = new int[6];
		int chkNum;
		
		for(int i=0; i<num.length; i++) {
			while(true) {
				chkNum = u.inputIntValue(" ▶ 수동 "+(i+1)+"번째 숫자 : ");
				if(i == 0 && chkNum == 0) {
					System.out.println(" ▷ 1번재 숫자는 무조건 입력해주셔야 합니다.");
					System.out.println(" ▷ 1 이상 45 이하 숫자를 입력해주세요.");
				} else if(chkNum<0 || chkNum>45) {
					System.out.println(" ▷ 0 이상 45 이하 숫자를 입력해주세요.");
				} else if(chkNum==0 || i==5){
					System.out.println(" ▷ 수동 입력을 종료합니다.");
					break;
				} else if(u.checkDup(num, chkNum)){ // 먼저 쓰면 0이 초기값이라 중복 체크 됨
					System.out.printf(" ▷ [%d]는 중복된 숫자입니다. 다시 입력해주세요.\n",chkNum);
				} else {
					num[i] = chkNum;
					break;
				}
			}
		}
		return num;
	} // inputManualNums(int)

}

package com.min.method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	Util u = new Util();
	
	// 다른 메소드들의 기초가 되는 inputUtil 메소드
	private int inputIntValue(String req) {
		int value = 0;

		while (true) {
			System.out.print(req);
			try {
				Scanner scan = new Scanner(System.in);
				value = scan.nextInt();
				return value;
			} catch (Exception e) {
				System.out.println(" ▷ 숫자만 입력해주세요.");
			} 
		}
	} // inputIntValue(String)
	
	/**
	 * 총 로또 구매 금액을 입력받는 메소드\n
	 * 1,000원 이상부터 1,000원 단위로 받음
	 * @return int 총 로또 구매 금액==총입금액 
	 */
	int inputDeposit() {
		int dep = 0;
		
		while(true) {
			dep = inputIntValue(" ▶ 입금해주세요 : ");
			if(dep < 1000 || dep%1000 != 0) {
				System.out.println(" ▷ 최소 1,000원 이상 1,000원 단위로 입금해주세요.");
			} else {
				break;
			}
		}
		
		return dep;
	} // inputDeposit()
	
	/**
	 * 각각 로또 장수를 입력받는 메소드
	 * @param total 총 로또 장 수
	 * @return int[] {수동 장수, 수동+자동 장수, 자동 장수}
	 */
	int[] inputLottoNum(int total) {
		int[] num = new int[3];
		while(true) {
			num[0] = inputIntValue(" ▶ 수동 : ");
			if(num[0]<0 || num[0]>total) {
				System.out.printf(" ▷ 0 이상 %d 이하 숫자를 입력해주세요.\n", total);
			} else {
				break;
			}
		}
		while(true) {
			num[1] = inputIntValue(" ▶ 수동+자동 : ");
			if(num[1]<0 || num[1]>(total-num[0])){
				System.out.printf(" ▷ 0 이상 %d 이하 숫자를 입력해주세요.\n", total-num[0]);
			} else {
				break;
			}
		}
		num[2] = total-num[0]-num[1];
		System.out.printf(" ▷ 자동 : %d\n", num[2]);
		return num;
	} // inputLottoNum(int)
	
	/**
	 * 수동 로또는 6개의 숫자를 입력받는다.\n
	 * 수동+자동 로또는 사용자가 원하는 만큼 숫자를 입력받는다.
	 * @param manualNum 수동으로 입력할 숫자 개수
	 * @return int[] 사용자가 수동으로 입력한 숫자들 array
	 */
	int[] inputManualNum() {
		int[] num = new int[6];
		int chkNum;
		
		for(int i=0; i<num.length; i++) {
			while(true) {
				chkNum = inputIntValue(" ▶ 수동 "+(i+1)+"번째 숫자 : ");
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
				chkNum = inputIntValue(" ▶ 수동 "+(i+1)+"번째 숫자 : ");
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

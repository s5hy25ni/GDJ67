package com.sh.method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Buyer {
	Util u = new Util();
	
	private int deposit;
	private int totalAmt;
	private int[] accAmt = new int[2];
	private Lotto[] lottos;
	
	public void inputDeposit() {
		int dep = 0;
		
		while(true) {
			dep = inputIntValue(" ▶ 입금\t>\t ");
			if(dep < 1000 || dep%1000 != 0) {
				System.out.println(" ▷ 최소 1,000원 이상 1,000원 단위로 입금해주세요.");
				System.out.println();
			} else {
				break;
			}
		}
		
		deposit = dep;
		totalAmt = deposit/1000;
		lottos = new Lotto[totalAmt];
		
		System.out.printf(" ▷ 구매 가능한 로또는 %d개 입니다.\n", totalAmt);
		System.out.println();
	} // inputDeposit()
	
	public void inputEachAmt() {
		while(true) {
			accAmt[0] = inputIntValue(" ▶ 수동\t\t>\t");
			if(accAmt[0]<0 || accAmt[0]>totalAmt) {
				System.out.printf(" ▷ 0 이상 %d 이하 숫자를 입력해주세요.\n", totalAmt);
			} else {
				break;
			}
		}
		while(true) {
			if(accAmt[0]==totalAmt) {
				System.out.println(" ▷ 반자동\t>\t0");
				accAmt[1] += accAmt[0];
				break;
			}
			accAmt[1] = inputIntValue(" ▶ 반자동\t>\t");
			if(accAmt[1]<0 || accAmt[1]>(totalAmt-accAmt[0])){
				System.out.printf(" ▷ 0 이상 %d 이하 숫자를 입력해주세요.\n", totalAmt-accAmt[0]);
			} else {
				accAmt[1] += accAmt[0];
				break;
			}
		}
		System.out.printf(" ▷ 자동\t\t>\t%d\n", totalAmt-accAmt[1]);	
		System.out.println();
	} // inputEachAmt()

	public Lotto[] getLottos() {
		return lottos.clone();
	}

	public void inputNums(){
		for(int i = 0; i<accAmt[0]; i++) {
			System.out.printf(" ▷ %d번 로또는 수동입니다.\n",i+1);
			System.out.println();
			lottos[i] = new Lotto("수동", inputHandNum());
		}
		for(int i = accAmt[0]; i<accAmt[1]; i++) {
			System.out.printf(" ▷ %d번 로또는 반자동입니다.\n", i+1);
			System.out.println(" ▷ 0을 입력하시거나 다섯 번째 숫자까지 입력하시면 수동 입력이 종료됩니다.");
			System.out.println();
			lottos[i] = new Lotto("반자동", inputHalfNum());
		}
		System.out.printf(" ▷ 남은 로또는 자동으로 생성됩니다.\n",totalAmt-accAmt[1]);
		System.out.println();
		for(int i = accAmt[1]; i<totalAmt; i++) {
			lottos[i] = new Lotto("자동");
		}
		System.out.println(" ▷ 로또가 모두 생성되었습니다.");
		System.out.println();
	} // addLottos()

	private int[] inputHandNum() {
		int[] nums = new int[6];
		int chkNum;
		
		for(int i=0; i<nums.length; i++) {
			while(true) {
				chkNum = inputIntValue(" ▶ 수동 "+(i+1)+"번 숫자 입력 >\t ");
				if(chkNum<1 || chkNum>45) {
					System.out.println(" ▷ 1 이상 45 이하 숫자를 입력해주세요.");
				} else if(u.checkDup(nums, chkNum)){
					System.out.printf(" ▷ [%d]는 중복된 숫자입니다. 다시 입력해주세요.\n",chkNum);
				} else {
					nums[i] = chkNum;
					break;
				}
			}
		}
		
		System.out.println();
		return nums;
	} // inputHandNum()

	private int[] inputHalfNum() {
		int[] nums = new int[6];
		int chkNum;
		
		for(int i=0; i<nums.length; i++) {
			while(true) {
				chkNum = inputIntValue(" ▶ 반자동 "+(i+1)+"번 숫자 입력 >\t");
				if(i == 0 && chkNum == 0) {
					System.out.println(" ▷ 첫 번째 숫자는 무조건 입력해주셔야 합니다.");
					System.out.println(" ▷ 1 이상 45 이하 숫자를 입력해주세요.");
				} else if(chkNum<0 || chkNum>45) {
					System.out.println(" ▷ 0 이상 45 이하 숫자를 입력해주세요.");
				} else if(chkNum != 0 && u.checkDup(nums, chkNum)){ // 먼저 쓰면 0이 초기값이라 중복 체크 됨
					System.out.printf(" ▷ %d는 중복된 숫자입니다. 다시 입력해주세요.\n",chkNum);
				} else {
					nums[i] = chkNum;
					break;
				}				
			}
			
			if(nums[i]==0 || i==4){
				System.out.println();
				System.out.println(" ▷ 수동 입력을 종료합니다.");
				System.out.println();
				break;
			}
			
		}
		return nums;
	} // inputHalfNum()
	
	private int inputIntValue(String req) {
		int value = 0;
		
		while (true) {
			System.out.print(req);
			try {
				Scanner scan = new Scanner(System.in);
				value = scan.nextInt();
				return value;
			} catch (InputMismatchException e) {
				System.out.println(" ▷ 숫자만 입력해주세요.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // inputIntValue(String)
	
}

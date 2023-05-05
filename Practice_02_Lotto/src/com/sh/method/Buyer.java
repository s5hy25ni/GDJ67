package com.sh.method;

public class Buyer {
	Util u = new Util();
	
	private int deposit;
	private int totalAmt;
	private int[] eachAmt = new int[2];
	private Lotto[] lottos;	
	
	public Lotto[] getLottos() {
		return lottos.clone();
	}

	/**
	 * 총 로또 구매 금액(deposit)을 입력받아 멤버필드에 입력하는 메소드<br>
	 * 1,000원 이상부터 1,000원 단위로 받음<br>
	 * deposit = 입력 받은 금액;<br>
	 * totalAmt = deposit/1000;<br>
	 * lottos = new Lotto[totalAmt];
	 */
	public void inputDeposit() {
		int dep = 0;
		
		while(true) {
			dep = u.inputIntValue(" ▶ 입금 : ");
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
	
	/**
	 * 각각 로또 장수를 입력받아 누적하는 메소드<br>
	 * eachAmt[0] = 입력받은 수동 로또 수<br>
	 * eachAmt[1] = 수동 로또 수에 입력받은 반자동 로또 수를 더함
	 */
	public void inputEachAmt() {
		while(true) {
			eachAmt[0] = u.inputIntValue(" ▶ 수　동 개수 : ");
			if(eachAmt[0]<0 || eachAmt[0]>totalAmt) {
				System.out.printf(" ▷ 0 이상 %d 이하 숫자를 입력해주세요.\n", totalAmt);
			} else {
				break;
			}
		}
		while(true) {
			if(eachAmt[0]==totalAmt) {
				System.out.println(" ▷ 반자동 개수 : 0");
				eachAmt[1] += eachAmt[0];
				break;
			}
			eachAmt[1] = u.inputIntValue(" ▶ 반자동 개수 : ");
			if(eachAmt[1]<0 || eachAmt[1]>(totalAmt-eachAmt[0])){
				System.out.printf(" ▷ 0 이상 %d 이하 숫자를 입력해주세요.\n", totalAmt-eachAmt[0]);
			} else {
				eachAmt[1] += eachAmt[0];
				break;
			}
		}
		System.out.printf(" ▷ 자　동 개수 : %d\n", totalAmt-eachAmt[1]);	
		System.out.println();
	} // inputEachAmt()
	
	/**
	 * 각각 개수에 맞춰<br>
	 * 수동 -> 로또 번호 입력<br>
	 * 반자동 -> 로또 번호 입력 + 생성<br>
	 * 자동 -> 로또 번호 생성
	 */
	public void inputNums(){
		for(int i = 0; i<eachAmt[0]; i++) {
			System.out.printf(" ▷ %d번째 로또는 수동입니다.\n",i+1);
			System.out.println();
			lottos[i] = new Lotto(inputHandNum(), "수동");
		}
		for(int i = eachAmt[0]; i<eachAmt[1]; i++) {
			System.out.printf(" ▷ %d번째 로또는 반자동입니다.\n", i+1);
			System.out.println(" ▷ 0을 입력하시거나 5번째 숫자까지 입력하시면 수동 입력이 종료됩니다.");
			System.out.println();
			lottos[i] = new Lotto(inputHalfNum(), "반자동");
		}
		System.out.printf(" ▷ 남은 로또는 자동으로 생성됩니다.\n",totalAmt-eachAmt[1]);
		System.out.println();
		for(int i = eachAmt[1]; i<totalAmt; i++) {
			lottos[i] = new Lotto("자동");
		}
	} // addLottos()
	
	/*
	 * 6개의 숫자를 증복없이 입력받아 반환하는 메소드
	 */
	private int[] inputHandNum() {
		int[] nums = new int[6];
		int chkNum;
		
		for(int i=0; i<nums.length; i++) {
			while(true) {
				chkNum = u.inputIntValue(" ▶ 수동 "+(i+1)+"번째 숫자 입력 : ");
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
	
	/*
	 * 1개~5개의 숫자를 중복없이 입력받아 반환하는 메소드
	 */
	private int[] inputHalfNum() {
		int[] nums = new int[6];
		int chkNum;
		
		for(int i=0; i<nums.length; i++) {
			while(true) {
				chkNum = u.inputIntValue(" ▶ 반자동 "+(i+1)+"번째 숫자 입력 : ");
				if(i == 0 && chkNum == 0) {
					System.out.println(" ▷ 1번재 숫자는 무조건 입력해주셔야 합니다.");
					System.out.println(" ▷ 1 이상 45 이하 숫자를 입력해주세요.");
				} else if(chkNum<0 || chkNum>45) {
					System.out.println(" ▷ 0 이상 45 이하 숫자를 입력해주세요.");
				} else if(chkNum != 0 && u.checkDup(nums, chkNum)){ // 먼저 쓰면 0이 초기값이라 중복 체크 됨
					System.out.printf(" ▷ [%d]는 중복된 숫자입니다. 다시 입력해주세요.\n",chkNum);
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

}

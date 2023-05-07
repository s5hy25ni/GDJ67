package com.sh.method;

import java.util.Arrays;

/**
 * 로또 번호 클래스 {<br>
 * int[] lottoNums : 구매자가 구매한 로또 번호 또는 당첨 로또 번호(보너스 번호 미포함)<br>
 * String type : 로또 타입(수동, 반자동, 자동) 또는 당첨 번호(당첨)<br>
 * }
 */
public class Lotto {
	Util u = new Util();
	
	private int[] nums;
	private String type;
	private int ranking;
	
	public int[] getNums() {
		return nums.clone();
	}
	
	public String getType() {
		return type;
	}
	
	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	/**
	 * 자동 로또 번호 또는 당첨 로또 번호 생성
	 * @param type 로또 타입(자동, 당첨)
	 */
	public Lotto(String type) {
		this.type = type;
		nums = new int[6];
		nums = createAutoLotto(nums, 0);
	} // Lotto(int)
	
	/**
	 * 수동 로또 번호 또는 반자동 로또 번호 생성
	 * @param userSelNums 구매자가 선택한 번호들
	 * @param type 로또 타입(수동, 반자동)
	 */
	public Lotto(int[] userSelNums, String type) {
		this.type = type;
		nums = userSelNums.clone();
		int autoStart = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				autoStart = i;
				nums = createAutoLotto(nums, autoStart);
				break;
			}
		}
	} // Lotto(int[])

	
	/*
	 * 자동 로또 번호 생성
	 * 기존에 로또 번호(reqAutoNums)와 자동 생성이 필요한 index 번호(autoStart)를 입력하면
	 * 0 이상 autoStart 미만에는 기존 array의 값을 넣고
	 * autoStart 이상 array.length 미만에는 랜덤값을 넣어 반환(array)한다.
	 */
	private int[] createAutoLotto(int[] reqAutoNums, int autoStart) {
		int[] temp = new int[6];
		for (int i = 0; i < temp.length; i++) {
			if(reqAutoNums[i]==0) {
				break;
			}
			temp[i] = reqAutoNums[i];
		}
		for (int i = autoStart; i < temp.length; i++) {
			temp[i] = randomLottoNum(temp);
		}
		if(!this.type.equals("당첨")) {			
			Arrays.sort(temp);
		}
		return temp.clone();
	} // createAutoLotto(int[], int)
	
	/*
	 * 자동 로또 번호 생성이 필요한 array(reqAutoNums)를 넣으면
	 * 기존 번호들과 중복되지 않은 값(int)를 반환한다. 
	 */
	private int randomLottoNum(int[] reqAutoNums) {
		int num;
		
		while(true) {
			num = u.randomNum(45) + 1;
			if(!u.checkDup(reqAutoNums, num)) {
				return num;
			}			
		}
	} // randomNum(int[])

}

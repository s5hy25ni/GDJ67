package com.sh.method;

import java.util.Arrays;

/**
 * 로또 번호 클래스 {<br>
 * int[] lottoNums : 구매자가 구매한 로또 번호 또는 보너스 번호를 포함한 당첨 로또 번호<br>
 * String type : 로또 타입(auto, hand, half) 또는 당첨 번호(win)<br>
 * }
 */
public class Lotto {
	Util ut = new Util();
	
	private int[] lottoNums;
	private String type;

	/**
	 * 자동 로또 번호 또는 당첨 로또 번호
	 * @param size 6이면 구매자가 자동으로 구매한 로또 번호, 7이면 당첨 로또 번호
	 */
	public Lotto(int size) { // size가 6이면 자동, size가 7이면 winLotto
		lottoNums = new int[size];
		lottoNums = createLottoNums(lottoNums, 0);
		if(size == 6) {
			type = "auto";
		} else {
			type = "win";
		}
	} // Lotto(int)

	/**
	 * 수동 로또 번호
	 * @param userSelNums 구매자가 선택한 번호들이 있는 array
	 */
	public Lotto(int[] userSelNums) { // arguments가 int[]이면 수동
		lottoNums = userSelNums.clone();
		type = "hand";
	} // Lotto(int[])
	
	/**
	 * 반자동 로또 번호
	 * @param userSelNums 구매자가 선택한 번호들이 있는 array
	 * @param autoStart 자동 로또 번호 생성을 시작하는 userSelNums index
	 */
	public Lotto(int[] userSelNums, int autoStart) {
		lottoNums = userSelNums.clone();
		lottoNums = createLottoNums(lottoNums, autoStart);
		type = "half";
	} // Lotto(int[], int)

	
	/*
	 * 자동 로또 번호 생성이 필요할 때
	 * 기존에 로또 번호 array(reqAutoNums)와 auto 생성이 필요한 index 번호(autoStart)를 입력하면
	 * 0 이상 autoStart 미만에는 기존 array의 값을 넣고
	 * autoStart 이상 array.length 미만에는 랜덤값을 넣어 반환(array)한다.
	 * autoStart를 0로 하면 자동 로또 번호가 된다.
	 * autoStart > 0 이면 반자동 로또 번호가 된다.
	 */
	private int[] createLottoNums(int[] reqAutoNums, int autoStart) {
		int[] temp = new int[reqAutoNums.length];
		for (int i = 0; i < temp.length; i++) {
			if(reqAutoNums[i]==0) {
				break;
			}
			temp[i] = reqAutoNums[i];
		}
		for (int i = autoStart; i < temp.length; i++) {
			temp[i] = randomNum(temp);
		}
		Arrays.sort(temp);
		return temp.clone();
	} // createLottoNums(int[], int)
	
	/*
	 * 자동 로또 번호 생성이 필요한 array(reqAutoNums)를 넣으면
	 * 기존 번호들과 중복되지 않은 값(int)를 반환한다. 
	 */
	private int randomNum(int[] reqAutoNums) {
		int num;
		
		while(true) {
			num = (int) (Math.random() * 45) + 1;
			if(!ut.checkDup(reqAutoNums, num)) {
				return num;
			}			
		}
	} // randomNum(int[])

	@Override
	public String toString() {
		return type+" Lotto = " + Arrays.toString(lottoNums);
	} // toString()
}

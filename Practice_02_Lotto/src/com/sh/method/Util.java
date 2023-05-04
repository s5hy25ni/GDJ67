package com.sh.method;

import java.util.Scanner;

public class Util {
	
	// 다른 input 메소드들의 기초가 되는 inputUtil 메소드
	public int inputIntValue(String req) {
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
	 * 기존 array에 중복값이 있는지 확인하는 메소드
	 * @param chkNums 기존 array
	 * @param chkNum 확인이 필요한 값
	 * @return true=중복값이 존재, false=중복값 없음
	 */
	public boolean checkDup(int[] chkNums, int chkNum) {
		boolean isc = false;
		for (int i = 0; i < chkNums.length; i++) {
			if (chkNums[i] == chkNum) {
				isc = true;
				break;
			}
		}
		return isc;
	} // checkDup(int[], int)
}

package com.min.method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	
	int inputDeposit() {
		int inputMoney = 0;
		while(true) {
			inputMoney = inputIntValue(" ▶ 입금해주세요 : ");
			if(inputMoney < 1000) {
				System.out.println(" ▷ 최소 입금액은 1,000원 입니다.");
			} else if(inputMoney%1000 != 0) {
				System.out.println(" ▷ 1,000원 단위로 입금해주세요.");
			} else {
				break;
			}
		}
		return inputMoney;
	} // inputDeposit()
	
	private int inputIntValue(String req) {
		int value = 0;

		do {
			System.out.printf(req);

			try {
				Scanner scan = new Scanner(System.in);
				value = scan.nextInt();
				return value;
			} catch (InputMismatchException e) { // int 이외의 값 입력시 예외처리
				System.out.println(" ▷ 숫자만 입력해주세요.");
				continue;
			}

		} while (true);

	} // inputIntValue(String)
	
	int[] inputLottoNums(int con) {
		int[] values = new int[con];
		
		for(int i=0; i<con; i++) {
			values[i] = inputIntValue((i+1)+"번째 숫자 : ");
		}
		
		return values;
	} // inputLottoNums(int)

}

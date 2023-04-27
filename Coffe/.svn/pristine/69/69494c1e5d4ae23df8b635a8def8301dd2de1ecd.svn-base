package com.coffee.method;

public class Add {
	
	void addPayment(int where) {
		int num = 0;
		int money = 0;
		
		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println("	[1] 추가 입금");
		if(where==0) {
			System.out.println("	[2] 다른 메뉴 선택");
		} else if(where==1) {
			System.out.println("	[2] 다른 수량 입력");
		}
		System.out.println();
		System.out.println("└------------------------------┘");
		System.out.printf(" ▶ 번호를 입력해주세요 : ");
		
		while(true) {
			num = Comm.inputIntValue();
			if(num == 1) {
				System.out.printf(" ▶ 입금해주세요 : ");
				money = Comm.inputIntValue();
				if(money<0) {
					System.out.println(" ▷ 0원 이상 입금가능합니다.");
				}
				Comm.totalMoney += money;
				break;
			} else if(num == 2) {
				break;
			} else {
				System.out.println(" ▷ 1 또는 2만 입력해주세요.");
			}
		}
	}
	
	public int endOrNot() {
		int num = 0;
		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println("	[1] 추가 주문");
		System.out.println("	[2] 영수증 출력 종료");
		System.out.println("	[3] 영수증 미출력 종료");
		System.out.println();
		System.out.println("└------------------------------┘");
		
		while(true) {
			System.out.print(" ▶ 번호를 입력해주세요 : ");
			num = Comm.inputIntValue();
			if(num>0 && num <4) {
				break;
			} else {
				System.out.println("▷ 1 ~ 3만 입력해주세요.");
			}
		}
		
		return num;
	}
	
}

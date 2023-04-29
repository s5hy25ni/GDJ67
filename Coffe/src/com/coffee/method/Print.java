package com.coffee.method;

import java.util.Arrays;

public class Print {

	Util u = new Util();
	Money mo = new Money();

	// 입금
	void payment() {

		int money = 0;

		// 메뉴들 중 최소 가격의 메뉴를 찾기 위함
		int[] prices = new int[Menu.menus.length];
		for (int i = 0; i < Menu.menus.length; i++) {
			prices[i] = Menu.menus[i][0];
		}
		Arrays.sort(prices);

		while (true) {

			// 입력받은 금액이 최소 가격에서 현재 잔액을 뺀 금액보다 작으면 다시 입금 받음
			if (money < (prices[0] - mo.chargeCal())) {
				money = u.inputIntValue(" ▶ 입금해주세요 : ");

				while (true) {

					if (money < (prices[0] - mo.chargeCal())) {
						System.out.printf(" ▷ 최소 %d원 이상 입금하셔야 합니다.\n", (prices[0] - mo.chargeCal()));
					} else {
						break;
					}

				}
			} else {
				break;
			}

		}

		// 입금액이 확정되면 총 입금에 추가
		Money.totalMoney += money;

	} // payment()

	// 메뉴 선택
	int selectMenu() {

		int num = 0;

		while (true) {

			num = u.inputIntValue(" ▶ 메뉴를 선택해주세요 : ");

			// 메뉴판에 있는 번호를 입력할 경우
			if (num > 0 && num < Menu.menus.length) {

				// 현재 잔액보다 비싼 메뉴를 선택할 경우
				if (Money.totalMoney < Menu.menus[num - 1][0]) {
					System.out.printf(" ▷ %d원 부족합니다.\n", Math.abs(Money.totalMoney - Menu.menus[num - 1][0]));
					
					// 추가 입금 또는 다른 메뉴 선택 질문
					// arguments 0은 메뉴 선택 메서드에서 호출함을 뜻함
					addPayment(0);
					continue;
				} else {
					break;
				}

			// 메뉴판에 없는 번호를 입력할 경우
			} else {
				System.out.println(" ▷ 1~3까지 입력해주세요.");
			}

		}

		return num;

	} // selectMenu()

	// 잔수 선택
	int selectCup(int num) {

		int cup = 0;

		while (true) {

			cup = u.inputIntValue(" ▶ 수량을 선택해주세요 : ");

			// 입력한 잔수*선택한 메뉴 가격이 현재 잔액보다 클 경우 잔수 다시 선택
			if ((cup * Menu.menus[num - 1][0]) > mo.chargeCal()) {
				System.out.printf(" ▷ 현재 가능한 최대 수량은 %d잔 입니다.\n", mo.chargeCal() / Menu.menus[num - 1][0]);
				
				// 추가 입금 또는 다른 수량 선택 질문
				// arguments 1은 잔수 선택 메서드에서 호출함을 뜻함
				addPayment(1);
			} else {
				break;
			}

		}

		// 선택한 메뉴에 잔수 추가
		Menu.menus[num - 1][1] += cup;
		
		// 총 가격(비용)에 잔수*선택한 메뉴 가격 더함
		Money.totalPrice += cup * Menu.menus[num - 1][0];

		return cup;

	} // selectCup()

	// 추가 입금 또는 다른 선택
	private void addPayment(int origin) {

		int num = 0;
		int money = 0;

		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println("	[1] 추가 입금");

		// 메뉴 선택 메서드에서 호출시 다른 메뉴 선택 노출
		// 수량 선택 메서드에서 호출시 다른 수량 입력 노출
		if (origin == 0) {
			System.out.println("	[2] 다른 메뉴 선택");
		} else if (origin == 1) {
			System.out.println("	[2] 다른 수량 입력");
		}

		System.out.println();
		System.out.println("└------------------------------┘");

		while (true) {

			num = u.inputIntValue(" ▶ 번호를 입력해주세요 : ");

			// 1번 선택시 0보다 큰 수를 입급받고, 입금받은 금액은 총 입금에 포함
			if (num == 1) {
				money = u.inputIntValue(" ▶ 입금해주세요 : ");
				if (money < 0) {
					System.out.println(" ▷ 0원 이상 입금가능합니다.");
				}
				Money.totalMoney += money;
				break;
			} else if (num == 2) {
				break;
			} else {
				System.out.println(" ▷ 1 또는 2만 입력해주세요.");
			}

		}

	} // addPayment()

	// 주문 확인 메서드
	void confirm(int num, int cup) {

		System.out.printf(" ▷ %s %d잔 주문하셨습니다.\n", Menu.names[num - 1], cup);
		System.out.printf(" ▷ 잔액 : %d원\n", mo.chargeCal());

	} // confirm()

	// 종료 또는 추가 주문 선택
	int endOrNot(int cnt) {

		int num = 0;
		System.out.println("┌------------------------------┐");
		System.out.println();

		if (cnt == 5) {
			System.out.println("    ▷ 주문은 총 5회까지 가능합니다.");
			System.out.println();
		}

		System.out.println("	[1] 영수증 출력 종료");
		System.out.println("	[2] 영수증 미출력 종료");

		// 총 주문횟수 4번까지는 추가 주문을 받는다.
		if (cnt < 5) {

			System.out.println("	[3] 추가 주문");
			
		}

		System.out.println();
		System.out.println("└------------------------------┘");

		while (true) {

			num = u.inputIntValue(" ▶ 번호를 입력해주세요 : ");

			if (num > 0 && num < 4) {
				break;
			} else {
				System.out.println(" ▷ 1 ~ 3만 입력해주세요.");
			}

		}

		return num;

	} // endOrNot()

	
	// 영수증 출력
	void printBill() {

		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.printf(" [1] 총 입금 :\t\t%d원\n", Money.totalMoney);
		System.out.printf(" [2] 총 가격 :\t\t%d원\n", Money.totalPrice);
		System.out.println();

		// 각 메뉴의 총 주문 잔수, 금액 출력
		// 주문 잔수가 0회인 메뉴는 미출력
		for (int i = 0; i < Menu.menus.length; i++) {
			if (Menu.menus[i][1] != 0) {
				System.out.printf("\t%s\t%d잔\t%d원\n", Menu.names[i], Menu.menus[i][1],
						Menu.menus[i][0] * Menu.menus[i][1]);
			}
		}

		System.out.println();
		System.out.printf(" [3] 거스름돈([1]-[2]) :\t%d원\n", mo.chargeCal());
		System.out.println();
		System.out.println("└------------------------------┘");

	} // printBill()

}

package com.coffee.method;

public class Process {

	public void order() {

		Menu m = new Menu();
		Print p = new Print();
		DTO d = new DTO();
		int cnt = 0;

		while (true) {

			++cnt;
			m.printMenu();
			p.payment();
			d.userNum = p.selectMenu();
			d.userCup = p.selectCup(d.userNum);
			p.confirm(d.userNum, d.userCup);
			int num = p.endOrNot(cnt);

			if (num == 1) {
				p.printBill();
				break;
			} else if (num == 2) {
				break;
			}

		}

		System.out.println(" ▷ 주문을 종료합니다.");
		System.out.println(" ▷ 이용해주셔서 감사합니다.");

	}
}

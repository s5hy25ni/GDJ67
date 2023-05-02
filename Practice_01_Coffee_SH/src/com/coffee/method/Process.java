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

			if (num == 1) { // 영수증 출력 종료 선택시
				p.printBill();
				break;
			} else if (num == 2) { // 영수증 미출력 종료 선택시
				break;
			}
			// 3 -> 추가 주문 선택시 반복
		}

		System.out.println(" ▷ 주문을 종료합니다.");
		System.out.println(" ▷ 이용해주셔서 감사합니다.");

	}
}

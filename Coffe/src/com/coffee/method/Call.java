package com.coffee.method;

public class Call {
	Print print = new Print();
	Money money = new Money();
	Menu menu = new Menu();
	DTO dto = new DTO();
	
	/**
	 * 메뉴 출력 - 입금 - 메뉴 선택 - 수량 선택 - 주문 확인
	 * 상위 메소드들을 묶어놓은 메소드이다.
	 */
	public void order() {

		while(true) {
			print.printMenu();
			money.payment();
			dto.num = menu.selectMenu();
			dto.cup = menu.selectCup(dto.num);
			print.confirm(dto.num, dto.cup);
			
			int addNum = 0;
			
			addNum = print.endOrNot();
			if(addNum == 1) {
				continue;
			} else if (addNum == 2) {
				System.out.println("영수증 출력");
				break;
			} else {
				break;
			}
		}

	} // order()
	
}

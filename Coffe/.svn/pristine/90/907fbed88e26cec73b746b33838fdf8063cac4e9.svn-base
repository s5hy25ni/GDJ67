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
		print.printMenu();
		money.payment();
		menu.selectMenu(dto.num);
		menu.selectCup(dto.num);
		confirm();
	} // order()
}

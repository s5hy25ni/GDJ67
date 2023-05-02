package Coffe.Method;

public class Menu {
	Util util = new  Util();
	Money moneyMethod = new Money();
	Print p = new Print();


	
	public int menuSelect () {
		System.out.printf("=================\n");
		System.out.printf("메뉴를 선택해 주세요\n");
		System.out.printf("=================\n");
		return util.checkInt(util.inputIntValue())-1;
	}
	
	public int menuCnt() {

		System.out.printf("============================\n");
		System.out.printf("선택한 메뉴의 수량을 입력해 주세요\n");
		System.out.printf("============================\n");
		return util.inputIntValue();
	}
	

}



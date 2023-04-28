package com.coffee.method;

public class Menu {
	Util util = new Util();
	Money money = new Money();
	Print print = new Print();
	
	/**
	 * 메뉴의 번호를 입력받아 메뉴의 이름을 반환하는 메소드
	 * @param num 메뉴 번호
	 * @return String 메뉴 이름
	 */
	String returnName(int num){
		String name = switch(num){
		case 1->"아메리카노";
		case 2->"카페라떼";
		default->"바닐라라떼";
		};
		return name;
	 } // returnName();
	
	// 메뉴를 선택하는 메소드이다.
	private void selectMenu(int num){
		while(true){
			System.out.printf(" ▶ 메뉴를 선택해주세요 : ");
			num = util.inputIntValue();
			
			if(num>0 && num<4){
				/*
				 * 현재 잔액보다 선택한 메뉴의 가격이 비싸면 부족한 금액을 알려주고 
				 * 추가 입금을 할지 다른 메뉴를 선택할지 묻는다.
				 */
				if(DTO.totalMoney<returnPrice(num)) {
					System.out.printf(" ▷ %d원 부족합니다.\n", Math.abs(DTO.totalMoney-returnPrice(num)));
					// addPayment()에 0을 넣으면 메뉴 선택 여부를 묻는다.
					print.addPayment(0);
					continue;
					
				// 메뉴를 구매할 수 있으면 메뉴 선택 메소드를 빠져나간다.
				} else {					
					break;
				}
			
			// 메뉴판에 없는 메뉴를 입력하면 다시 입력받는다.
			} else {
				System.out.println(" ▷ 1~3까지 입력해주세요.");
			}
		}
	} // selectMenu()

	// 수량을 선택하는 메소드이다.
	private int selectCup(int num){
		int cup = 0;
		while(true){
			System.out.printf(" ▶ 수량을 선택해주세요 : ");
			cup = util.inputIntValue();
			
			/*
			 * 필요 금액 = 잔수(cup)*가격(Comm.returnPrice(num))
			 * 현재 잔액 = Comm.chargeCal()
			 * 필요 금액이 현재 잔액보다 많으면 현재 가능한 최대 수량을 알려주고
			 * 추가 입금을 받을지 다른 수량을 입력할지 묻는다.
			 */
			if((cup*returnPrice(num))>money.chargeCal()){
				System.out.printf(" ▷ 현재 가능한 최대 수량은 %d잔 입니다.\n", money.chargeCal()/returnPrice(num));
				// addPayment()에 1을 넣으면 다른 수량 선택을 묻는다.
				print.addPayment(1);
				
			// 현재 입력한 수량만큼 주문이 가능하면 수량 선택 메소드를 빠져나간다.
			} else {
				break;
			}
		}
		// 각각 메뉴 잔수에 추가(메소드 추가 필요)
		
		// 현재까지 지불한 금액에 현재 지불한 금액을 추가
		DTO.totalPrice += cup*returnPrice(num);
		
		return cup;
	} // selectCup()

	// 주문을 확인하는 메소드이다.
	private void confirm(int num, int cup){
		/*
		 *  현재 선택한 메뉴의 이름 = Comm.returnName(num)
		 *  현재 선택한 수량 = cup
		 *  현재까지 총 입금액 - 현재까지 총 지불액 = Comm.chargeCal() 
		 */
		System.out.printf(" ▷ %s %d잔 주문하셨습니다.\n", returnName(num), cup);
		System.out.printf(" ▷ 잔액 : %d원\n", money.chargeCal());
	 } // confirm()
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	int returnPrice(int num){
		  int price = switch(num){
		  case 1->1500;
		  case 2->2000;
		  default->2500;
		  };
	  return price;
	 } // returnPrice();
}

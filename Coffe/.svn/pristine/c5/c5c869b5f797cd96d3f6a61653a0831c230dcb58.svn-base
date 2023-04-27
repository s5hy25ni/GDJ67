package com.coffee.method;

/**
 * 커피 주문과 관련된 기본 기능들을 모아놓은 클래스
 * @author 정운, 현
 * @since 2023-04-27
 */
public class Basics {
	private static int num;
	private static int cup;
	private static int money;

	Add add = new Add();
	
	/**
	 * 메뉴 출력 - 입금 - 메뉴 선택 - 수량 선택 - 주문 확인
	 * 상위 메소드들을 묶어놓은 메소드이다.
	 */
	public void order() {
		printMenu();
		payment();
		selectMenu();
		selectCup();
		confirm();
	} // order()
	
	// 메뉴판을 출력하는 메소드
	private void printMenu(){
		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println(" [1]	아메리카노 		1,500원");
		System.out.println(" [2]	카페 라떼 		2,000원");
		System.out.println(" [3]	바닐라 라떼 	2,500원");
		System.out.println();
		System.out.println("└------------------------------┘");
	} // printMenu()

	// 입금을 받는 메소드
	private void payment(){
		while(true){
			System.out.printf(" ▶ 입금해주세요 : ");
			money = Comm.inputIntValue();
			
			/* 
			 * 최소 입금 금액 = 최저 가격(아메리카노 1500원)에서 현재 남아있는 잔액(chargeCal()을 뺀 금액
			 * 입금 금액(money)이 최소 입금 금액보다 작으면 다시 입금을 받는다.
			 */
			if(money<(1500-Comm.chargeCal())){
				System.out.printf(" ▷ 최소 %d원 이상 입금하셔야 합니다.\n", (1500-Comm.chargeCal()));
			} else {
				break;
			}
		}
		
		// 현재까지 총 입금받은 금액에 현재 입금한 금액을 더한다.
		Comm.totalMoney += money;
	 } // payment()

	// 메뉴를 선택하는 메소드이다.
	private void selectMenu(){
		while(true){
			System.out.printf(" ▶ 메뉴를 선택해주세요 : ");
			num = Comm.inputIntValue();
			
			if(num>0 && num<4){
				/*
				 * 현재 잔액보다 선택한 메뉴의 가격이 비싸면 부족한 금액을 알려주고 
				 * 추가 입금을 할지 다른 메뉴를 선택할지 묻는다.
				 */
				if(Comm.totalMoney<Comm.returnPrice(num)) {
					System.out.printf(" ▷ %d원 부족합니다.\n", Math.abs(Comm.totalMoney-Comm.returnPrice(num)));
					// addPayment()에 0을 넣으면 메뉴 선택 여부를 묻는다.
					add.addPayment(0);
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
	private void selectCup(){
		while(true){
			System.out.printf(" ▶ 수량을 선택해주세요 : ");
			cup = Comm.inputIntValue();
			
			/*
			 * 필요 금액 = 잔수(cup)*가격(Comm.returnPrice(num))
			 * 현재 잔액 = Comm.chargeCal()
			 * 필요 금액이 현재 잔액보다 많으면 현재 가능한 최대 수량을 알려주고
			 * 추가 입금을 받을지 다른 수량을 입력할지 묻는다.
			 */
			if((cup*Comm.returnPrice(num))>Comm.chargeCal()){
				System.out.printf(" ▷ 현재 가능한 최대 수량은 %d잔 입니다.\n", Comm.chargeCal()/Comm.returnPrice(num));
				// addPayment()에 1을 넣으면 다른 수량 선택을 묻는다.
				add.addPayment(1);
				
			// 현재 입력한 수량만큼 주문이 가능하면 수량 선택 메소드를 빠져나간다.
			} else {
				break;
			}
		}
		// 각각 메뉴 잔수에 추가(메소드 추가 필요)
		
		// 현재까지 지불한 금액에 현재 지불한 금액을 추가
		Comm.totalPrice += cup*Comm.returnPrice(num);
	} // selectCup()

	// 주문을 확인하는 메소드이다.
	private void confirm(){
		/*
		 *  현재 선택한 메뉴의 이름 = Comm.returnName(num)
		 *  현재 선택한 수량 = cup
		 *  현재까지 총 입금액 - 현재까지 총 지불액 = Comm.chargeCal() 
		 */
		System.out.printf(" ▷ %s %d잔 주문하셨습니다.\n", Comm.returnName(num), cup);
		System.out.printf(" ▷ 잔액 : %d원\n", Comm.chargeCal());
	 } // confirm()
	
}

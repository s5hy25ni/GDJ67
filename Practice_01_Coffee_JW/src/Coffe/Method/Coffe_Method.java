package Coffe.Method;


public class Coffe_Method {

	DTO data = new DTO();
	Util util = new Util();
	Print prt = new Print();
	Menu menuMethod = new Menu();
	Money moneyMethod = new Money();

	int totalprice = 0;
	int a; // 메뉴
	int b = 0; // 수량
	int money=0;
	int change = 0;

	public void Menu_select() { 
		System.out.printf("===================================\n");
		prt.printMenu(data.menu,data.price);//메뉴 출력
		System.out.printf("===================================\n");
		a = menuMethod.menuSelect(); // 메뉴 선택

		b = menuMethod.menuCnt(); //수량 선택

		data.cnt[a] += b;
		
		totalprice = (data.price[0]*data.cnt[0])+(data.price[1]*data.cnt[1])+(data.price[2]*data.cnt[2]);

		Menu_AddOrder(totalprice);
	}
	
	public void Menu_AddOrder(int tp) { //추가 주문 메소드
		System.out.printf("===================================\n");
		System.out.printf("\t추가주문 하시겠습니까?[Y/N]\n");
		System.out.printf("===================================\n");
		char addorder = util.checkChar(util.inputCharValue());

		if(addorder=='Y' || addorder== 'y') {
			Menu_select();
		}else if(addorder=='N'||addorder=='n'){
			int money = moneyMethod.inputMoney(tp);
			bill(tp, money);
		}
	}
	
	
	public void bill(int tp, int money) { //영수증 출력 Method
		System.out.printf("=========================================\n");
		System.out.printf("\t영수증울 출력 하시곘습니까? [Y/N]\n");
		System.out.printf("=========================================\n");

		char billchk = util.checkChar(util.inputCharValue());

		if (billchk =='Y'|| billchk == 'y') {
			System.out.printf("==================영수증==================\n");
			
			for (int i = 0; i < data.cnt.length; i++) {
				if (data.cnt[i] != 0) {
					System.out.printf("%s %d개의 가격은 총:%d원 입니다.\n",data.menu[i],data.cnt[i],data.price[i]*data.cnt[i]);
				}
			}
			System.out.printf("총 액 : %d원\n",tp);
			System.out.printf("입금액 : %d원\n",money);
			System.out.printf("거스름돈 : %d원\n",money-tp);	
			System.out.printf("==============다음에 또 오세요==============\n");
		}else if(billchk=='N'|| billchk=='n') {
			System.out.printf("===================================\n");
			for (int i = 0; i < data.cnt.length; i++) {
				if (data.cnt[i] != 0) {
					System.out.printf("주문 하신 %s %d잔 나왔습니다..\n",data.menu[i],data.cnt[i]);
				}
			}
			System.out.printf("===================================\n");
		}
	}
}



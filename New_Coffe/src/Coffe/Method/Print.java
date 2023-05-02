package Coffe.Method;
// 메뉴 선택과 출력이 있는 메소드
public class Print {
	
	DTO data = new DTO();
	Util util = new Util();
	
	
	public void printMenu(String menu[], int price[]) { // 메뉴 출력 메소드
		System.out.println("메뉴 목록");
		for (int i = 0; i < (menu.length); i++) {
			System.out.printf("[%d] : %s 가격: %d \n",i+1,menu[i], price[i]);
		}
	}
	

}

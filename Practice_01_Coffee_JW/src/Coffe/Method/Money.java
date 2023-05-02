package Coffe.Method;

public class Money {
	Util util = new Util();


	public int inputMoney(int tp) {
		System.out.printf("============================\n");
		System.out.println("\t돈을 입금해 주세요");
		System.out.printf("============================\n");
		int money=0;
		money = util.inputIntValue(); //금액 입력받기
		money = compareMoney(money,tp);
		return money;
	} 

	public int compareMoney(int money, int tp) {
		return money = util.checkMoney(money, tp);
	}
}


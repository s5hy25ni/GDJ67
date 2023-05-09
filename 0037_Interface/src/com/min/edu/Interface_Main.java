package com.min.edu;

import com.min.edu.IGame.HelperClass;

public class Interface_Main {
		public static void main(String[] args) {
			System.out.println(IGame.AGE);
			System.out.println(IGame.VAL);
			System.out.println(IGame_Conf.VAL);
			
			GameImpl g = new GameImpl();
			// ctrl+space시 D로 표기되는 메소드는 인터페이스에 있는 공통메소드이다.
			g.print("11");
			
			// 부모가 여러 개다
			IGame ig = g;
			IGame_Conf ic = g;
			IGame_Bin ib = g;
			
			System.out.println(ig.makeA()); // ig.makeA()는 구현X(IGame은 인터페이스) -> g.makeA() 호출
//			System.out.println(ic.VAL);
			ib.print_Conf(); // ig.makeA와 동일
			
			// g.sum();은 호출 못함 == new를 통해 생성한 객체명.메소드() 호출이 안됨(기존에는 가능)
			// 위의 방식은 혼란(사용 이름이 달라질 수 있음)을 가져옴
			// only IGame.sum(); 으로만 사용 == class명.메소드()로만 호출 가능
			System.out.println(IGame.sum(5));
			
			// 외부의 연산을 처리해주는 것이 아닌
			// interface 내부의 연산이 처리된 결과를 반환한다.
			g.printString();
			
			// 보이지 않지만 사용할 수 있음
			HelperClass hc = new HelperClass();
			hc.helperMethod();
		}
}

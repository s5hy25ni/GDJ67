package com.min.edu;

public class BaseballGameMain {

	public static void main(String[] args) {

		//TODO 001 라이브러리 생성 및 테스트
//		System.out.println(DefineUtil.getNum());
//		System.out.println(DefineUtil.getString());
		
		//TODO 002 pitcher 관련 테스트
//		Pitcher p = new Pitcher();
//		int num = p.makeNum();
//		System.out.println(num);
//		boolean isc = p.checkBox(num);
//		System.out.println(isc);
//		boolean isc2 = p.checkBox(-1);
//		System.out.println(isc2);
		
//		p.make();
//		System.out.println(p);
//		p.print();
		
		//TODO 003 hitcher 관련 테이스
		Hitter h = new Hitter();
//		boolean isc = h.checkArray();
//		System.out.println(isc);
//		int[] textBox = h.makeNum();
//		System.out.println(Arrays.toString(textBox));
		
//		h.make();
//		h.print();
		int[] box = h.getBox();
		h.print(box);
	}

}

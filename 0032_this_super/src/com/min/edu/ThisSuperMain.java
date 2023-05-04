package com.min.edu;

public class ThisSuperMain {

	public static void main(String[] args) {
		
		// 자식의 타입으로 자식 생성
		Child c = new Child(); //TODO 01
		
		// 부모-자식 멤버필드 이름이 같을 때
		// 01) c.num을 하면 누가 나올까?
		System.out.println(c.num);
		// 02) 부모꺼 호출
		Parent p = c;
		System.out.println(p.num);
		
		p.print();
		
		c.callParentPrint();
		System.out.println(c.getNum());
		
		// 멤버필드는 override XX 멤버메소드는 override OO
		System.out.println(p.getNum());
	}

}

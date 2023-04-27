package com.min.edu;

import com.min.edu.hierachy.ChildClass_A;
import com.min.edu.hierachy.ChildClass_B;
import com.min.edu.hierachy.ParentClass;

/*
 * TODO 003 객체의 형변환
 * 용어) 
 * 		1) up-casting : 자식 클래스의 타입에서 부모 타입으로 변경되는 것
 * 		2) down-casting : 부모의 타입에서 자식의 구체화된 타입으로 변경되는 것
 */
public class Object_Exchange {
	public static void main(String[] args) {
		
		// 자식의 타입으로 자식의 객체 생성
		ChildClass_A a = new ChildClass_A();
		ChildClass_B b = new ChildClass_B();
		
		a.parentMethod();
		b.parentMethod();
		
		a.make_a();
		b.make_b();
		
		// Object_Exchange가 ParentClass를 extends를 해야 protected
		
		// 자식의 타입을 부모 타입으로 변경 -> up-casting -> 자식 메소드는 X
		// 여러 개의 자식의 타입을 반환을 못하기 때문에(반환타입은 1개) 부모의 타입으로 변경 후 반환 -> 팩토리 패턴
		ParentClass pa = a;
		pa.parentMethod();
		ParentClass pb = b;
		pb.parentMethod();
		
		Object obj = pa;

		// pa는 ChildClass_A로 구현되어 있었음
		// pb는 ChildClass_B로 구현되어 있었음
		
		// 부모가 생성되어진 원래의 자식 타입으로 구체화 하는 것 -> down-casting
		ChildClass_A aa = (ChildClass_A)pa;
		ChildClass_B ab = (ChildClass_B)pa; // exception Object Exchange
	}
}

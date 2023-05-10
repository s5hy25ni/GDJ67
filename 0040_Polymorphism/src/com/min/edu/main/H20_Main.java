package com.min.edu.main;import java.awt.Choice;

import com.min.edu.H20;
import com.min.edu.H20Impl;
import com.min.edu.Ice;
import com.min.edu.Steam;
import com.min.edu.Water;
import com.min.edu.ctrl.ChoiceFatory;

public class H20_Main {

	public static void main(String[] args) {
		ChoiceFatory c1 = ChoiceFatory.getInstance();
		ChoiceFatory c2 = ChoiceFatory.getInstance();
		System.out.println("주소가 같니? == : "+ (c1==c2));
		System.out.println("진짜 같은 객체니?(heap에 생성된) equals : "+c1.equals(c2));
		
		System.out.println(ChoiceFatory.factoryCount);
		
		for (int i = 1; i < 4; i++) {
			H20Impl h1 = ChoiceFatory.getInstance().factory(i);
			h1.maek();
			h1.print();
		}
			
		System.out.println("생성된 choceFatory 개수 : "+ChoiceFatory.factoryCount);
		
		
		// Polymorphism
		H20 h = new Ice(); // 1) 부모 타입의 자식을 생성한다.
		 // 2) 호출과 사용은 생성된 객체를 사용하는게 아니라 선언된 타입에 의해서 결정됨
		// 3) 부모의 메서드로 자식을 호출할 수 있다.
		h.maek(); // VMI : interface 추상화 메소드 -> H20Impl abstract 추상화메소드 -> ICE 구현
		h.print();
		
		// 부모는 공통으로 extends 되지만
		// 1) 기능(method)은 method area에 공통으로 단 1회 올라감
		// 2) 특징(member field)는 각 생성된 heap의 영역에 새로 만들어 짐(instance를 하게 되면 새로운 ref, hashcode 부여)
		
		Ice i = new Ice();
		i.num = 10;
		System.out.println(i.num);
		Water w = new Water();
		w.num = 20;
		System.out.println(i.num);
		System.out.println(w.num);
		Steam s = new Steam();
		s.num = 30;
		System.out.println(i.num);
		System.out.println(w.num);
		System.out.println(s.num);
	}

}

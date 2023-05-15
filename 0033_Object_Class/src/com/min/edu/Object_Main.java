package com.min.edu;

public class Object_Main {

	public static void main(String[] args) {
				
		// 객체의 생성(instance화)
		// 같은 멤버필드를 가지고 있지만 다른 객체 -> new를 하면 heap에 새로운 주소와 hashcode 부여
		// u1, u2 -> 주소
		// 기본타입(pass by value, immutable)과 참조타입(pass by reference, mutable)의 특징
		UserDefineClass u1 = new UserDefineClass();
		UserDefineClass u2 = new UserDefineClass();
		
		// 명시적 import(같은 클래스명을 가졌기 때문)
		com.min.edu.gd67.UserDefineClass u3 = new com.min.edu.gd67.UserDefineClass();
		
		// 1) getClass를 통해서 생성된 객체의 설계도(Class)의 위치를 확인하자.
		System.out.println(u1.getClass());
		System.out.println(u2.getClass());
		System.out.println(u3.getClass());
		
		// 2) hashcode를 통한 고유값 확인
		System.out.println("u1의 hashcode : " +u1.hashCode());
		System.out.println("u1의 hashcode : " +u2.hashCode());
		System.out.println("u1의 hashcode : " +u3.hashCode());
		System.out.println("u1의 identityHashcode : " +System.identityHashCode(u1));
		
		// 3) toString() 객체는 위치@고유값
		// getClass().getName()+"@"+Integer.toHexaString(hashcode)
		// System.out.println() 기능의 출력 함수는 보여주는 것만 => 객체는 위치를 출력
		// System.out.println()은 toString()을 호출한다 == 객체만
		// 기본타입은 stack의 값을 출력
		String present = u1.toString(); // 부모 클래스에서 자식 클래스를 표출해줌
		System.out.println(u1);
		System.out.println(present);
		
		System.out.print(u1.getClass().getName());
		System.out.print("@");
		System.out.println(Integer.toHexString(u1.hashCode()));
		
		// 4) equals() 부모 객체를 통해서 자식의 클래스의 같음을 비교하는 것
		// 객체의 비교는 equals로 해야,,, == 객체의 비교는 생성한 Object 클래스를 통해서 
		// 		1) 같은 곳에서 생성 됬는지(package.Class)
		//		2) 같은 객체인지 (down casting이 되는지)
		//			참조 타입의 형변환 : 부모의 타입으로 변경 up casting, 자식의 타입으로 변경 down casting
		//		3) 같은 값을 내부에 가지고 있는지
		//		전제조건은 같은 타입이어야 한다.
		
		UserDefineClass ud01 = new UserDefineClass();
		UserDefineClass ud02 = new UserDefineClass();
		
		String ud01_one = ud01.getClass().getName();
		String ud02_one = ud02.getClass().getName();
		System.out.println(ud01_one==ud02_one); // true -> 같은 패키지와 클래스에서 생성된 객체다.
		
		Object ud01_two = ud01; // upcasting
		Object ud02_two = ud02; // upcasting
		
		UserDefineClass ud01_two_c = (UserDefineClass)ud02_two; // true
		UserDefineClass ud02_two_c = (UserDefineClass)ud01_two; // true
		
		try {
			com.min.edu.gd67.UserDefineClass ud01_tow_tt = (com.min.edu.gd67.UserDefineClass)ud01_two;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("객체가 서로 다르기 때문에 비교 대상이 되지 않습니다.");
		}
		
		System.out.println("객체 내부의 값을 getter를 통해 stack으로 가져와 확인");
		boolean isc = (ud01.getName().equals(ud02.getName()))&&(ud01.getAge()==ud02.getAge())?true:false;
		
		
	}

}

package com.min.edu;

//TODO 001 String과 new String()의 비교
public class StringCompare {
	
	/*
	 * String은 선언만 해도 객체가 되고
	 * 			new를 해도 객체가 된다.
	 * 하지만 같은 값을 가지고 있다면 같은 객체라고 생각할 수 있다.
	 */
	public static void main(String[] args) {
		
		// String 객체를 만들어 내는데, 선언/대입/new 방법을 통해서 작성함
		String str1 = "Smile";
		String str2 = str1;
		String str3 = "Smile";
		String str4 = new String("Smile");
		
		// 문자열연산 concatenation(연쇄)
		// 문자는 더하기(+) 연산을 통해 문자열과 문자열이 합쳐진다.
		String str5 = "Sm"+"ile"; // 리터럴 연산
		
		String tmp1 = "Sm";
		String tmp2 = "ile";
		String str6 = tmp1+tmp2; // concatenation
		
		System.out.println("str1(선언)==str5(리터럴 연산) : "+(str1==str5)); // true
		
		// String은 무조건 String pool에서 연산이 이루어진다.
		// 객체를 연산하면 new를 한 것과 똑같다.
		System.out.println("str1(선언)==str6(concatenation) : "+(str1==str6)); // false
		
		System.out.println("str1(선언)==str4(new 생성) : "+(str1==str4)); // false
		
		// mutable : 변경될 수 있는(참조타입, pass by reference) -> 주소값을 통해 값 변경
		// immutable : 변하지 않은(기본타입, pass by value) -> 재입력을 통해서 변경
		// String은 참조 타입이지만 기본 타입의 특징을 갖는다 -> 대입을 하면 값 복제가 일어난다. -> 근데 이미 같은 값의 주소가 생성되어 있으므로 같은 주소를 바라보게 된다.
		// str1의 값이 바뀌면 String pool에 새로 하나 생성되고 str1은 그 생성된 값을 바라보게 된다.
		System.out.println("str1(선언)==str2(대입) : "+(str1==str2)); // true
		
		
		System.out.println("str1(선언)==str3(선언) : "+(str1==str3)); // true
		
		System.out.println(str1.hashCode()); // ==
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4)); //!=
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6)); //!=
		
		
		
	}
}

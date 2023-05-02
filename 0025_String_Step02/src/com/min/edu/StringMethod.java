package com.min.edu;

import java.util.Arrays;
import java.util.Iterator;

public class StringMethod {

	// char charAt(int index)
	// 문자열은 문자형이 조합되어 있는 형태
	// index 번호로 해당 문자열의 문자형값을 가져올 수 있다.
	// index 번호는 0부터 시작
	// 이슈사항 : 만약 index의 길이보다 크게 입력한다면?
	public void fn_charAt() {
		String str = "Dream's come true";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+"."+i+"/"+(int)str.charAt(i));
			
		}
	}
	
	public void exam_CharAt() {
		
		// 아래와 같이 선언한 이유
		// ☞ concatenation을 발생시키기 위해 사용
		// ☞ null을 초기값으로 할 경우 concatenation을 하면 null이 나옴
		// ""가 값일까 아닐까 -> 아님 char c = str.charAt(0)을 하면 exception 나옴, 표기를 위함
		String str = "";
		String n = null;
		System.out.println(str+"d");
		System.out.println(n+"d");
		System.out.println(str);
		char c = str.charAt(0);
		
	} // exam_CharAt()
	
	// public int compareTo(String anotherString)
	// public int compareToLgnoreCase(String anotherString)
	public void fn_compareToXXXXX() {
		String name1 = "sns";
		String name2 = "sNs";
		int 코드포인트의차이n과m = name1.compareTo(name2);
		System.out.println(코드포인트의차이n과m);
		int c = name1.compareToIgnoreCase(name2);
		System.out.println(c);
	}
	
	public void compareTo_User_Defined() {
		String name1 = "2j2";
		String name2 = "2J2";
		
		System.out.println((int)'2'+".2");
		System.out.println((int)'j'+".j");
		System.out.println((int)'J'+".J");
		
		int result = 0;
		for (int i = 0; i < name1.length(); i++) {
			if(name1.charAt(i)!=name2.charAt(i)) {
				result = name1.charAt(i)-name2.charAt(i);
				break;
			}
		} //for
		System.out.println("결과 : "+result);
	
	}
	
	// public Stirng concat(String str)
	// 문자열 조합
	public void fn_concat() {
		String s = "★";
		String result = s.concat("Dream").concat("come").concat("true");
		System.out.println(result);
	}
	
	public void arrays_ToString_User_Defined() {
		String[] strs = {"사과","바나나","토마토"};
		System.out.println(Arrays.toString(strs));
		
		String result = String.format("%s,", "바나나");
		System.out.println(result);
		
		String result3 = "[";
		for (int i = 0; i < strs.length-1; i++) {
			result3 += String.format("%s, ", strs[i]);
		}
		result3 += strs[strs.length-1]+"]";
		System.out.println(result3);
	}
	
	// public boolean contains(CharSequence s)
	// 
	public void fn_contains() {
		String fruit = "청사과,바나나,오렌지";
		boolean isc1 = fruit.contains("사과");
		boolean isc2 = fruit.contains("청사과");
		System.out.println("사과 검색 : "+isc1);
		System.out.println("청사과 검색 : "+isc2);
		
	}
	
	// public boolean equals(Object anObject)
	// public boolean equalsIgnoreCase(String anotherString)
	// String과 같이 hashcode가 객체 값으로 override 되어 있는 객체만 사용 가능
	public void fn_equals() {
		String str1 = "jjj";
		String str2 = "JJJ";
		
		boolean isc1 = str1.equals(str2);
		boolean isc2 = str1.equalsIgnoreCase(str2);
		
		System.out.println("equals : "+isc1);
		System.out.println("equalsIgnoreCase : "+isc2);
	}
	
	// public int hashCode()
	// hashcode는 부모(Object)가 생성해주는 고유값
	// String은 가지고있는 값(Unicode)에 의해서 새로운 hashcode를 만든다.
	public void fn_hashCode() {
		String str = "가";
		String strNew = new String("가");
		System.out.println(str.hashCode()); // 자식이 오버라이드한 hashcode
		System.out.println(strNew.hashCode()); // 자식이 오버라이드한 hashcode
		
		System.out.println(str.intern().hashCode()); // 사용되는 문자열의 SP영역의 값 hashcode
		System.out.println(strNew.intern().hashCode()); // 사용되는 문자열의 SP영역의 값 hashcode
		
		//System.identityHashCode가 다른 것은 생성된 영역이 다르다는 것
		System.out.println(System.identityHashCode(str)); // SP에 생성되어 질 때 override 전의 hashcode
		System.out.println(System.identityHashCode(strNew)); // heap에 생성되어 SP에 연결하기 전의 override 전의 hashcode
	}
	
	// public int indexOf(String str)
	// public int indexOf(String str, int fromIndex)
	// public int lastIndexOf(String str)
	public void fn_XXXXXindexOf() {
		String str = "ko coco ko";
		System.out.println(str.length()); // index 9 length 10
		
		// ko의 위치
		int startSearch = str.indexOf("ko");
		int startSearchFrom = str.indexOf("ko", 3);
		int endSearch = str.lastIndexOf("ko");
		int endSearchFrom = str.lastIndexOf("ko", 3); // 뒤 3개를 뺀다
		System.out.println(startSearch);
		System.out.println(startSearchFrom);
		System.out.println(endSearch);
		System.out.println(endSearchFrom);
		
	}
	
	// matches(String regex)
	// replace(char oldChar, char newChar)
	// replaceAll(String regex, String replacement)
	// split(String regex)
	// strip() // Java 11 이후 화이트스페이스 제거
	// substring(int beginIndex)
	// toCharArray()
	// trim()
	// valueOf()
	// startsWith(String prefix)
	// endsWith(String suffix)
	
}

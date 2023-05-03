package com.min.edu;

import java.util.Arrays;
import java.util.StringTokenizer;

//TODO 001 문자열 자르기
public class String_Cut {
	
	// public String[] split(String regex)
	public void fn_split() {
		String str = "oop:and:foo";
		String txt = "oop.and.foo";
		
		String[] strArr = str.split(""); // 정규화 표현식에서 ""는 하나의 요소(Unicode)
		String[] txtArr = txt.split("."); // 정규화 표현식에서 "."은 임의의 한 단어	
		String[] txtArr2 = txt.split("[.]"); // 정규식 범위[]
		String[] txtArr3 = txt.split("\\."); // 이스케이프문자
		
		System.out.println(Arrays.toString(strArr)); // [o, o, p, :, a, n, d, :, f, o, o]
		System.out.println(Arrays.toString(txtArr)); // []
		System.out.println(Arrays.toString(txtArr2)); // [oop, and, foo] -> 기준점이 사라짐
		System.out.println(Arrays.toString(txtArr3)); // [oop, and, foo] -> 기준점이 사라짐
		
		// split는 정규식을 기준
		// 기준이 되는 값은 사라지고 만약 잘라진 Array의 끝 값이 ""이면 해당 배열은 값으로 존재하지 않는다.
		String[] strArrO = str.split("o");
		System.out.println(strArrO.length); // 3
		for(String s:strArrO) {
			System.out.println(s); // ""\n""\n"p:and:f"
		}
	}
	
	// 기준이 없을 때 사용
	// public String substring(int beginIndex) : beginIndex부터 끝까지
	// public String substring(int beginIndex, int endIndex) : beginIndex부터 (endIndex-1)까지
	public void fn_substr() {
		String str = "Happy New Year";
		int idx = str.indexOf("New");
		String newYear = str.substring(idx);
		System.out.println(newYear);
		int idxY = str.indexOf("Y");
		System.out.println(idxY);
		String ne = str.substring(idx, idxY-1);
		System.out.println(ne);
		
		String chk2 = null;
		
	}
	
	public void fn_StringTokenizer() {
		
		// java.util.StringTokenizer -> Enumeration
		// Iterator Design pattern : 가지고 있는 객체를 모두 확인 후 출력하는 pattern
		// split과의 차이점 : 갯수를 예측, String[]
		// 값을 예측하지 못함 -> Itrator pattern
		
		String str = "abc/ tdgf/ hght";
		StringTokenizer st = new StringTokenizer(str);
		
		// For문 index => Array[0], String.charAt(0), List.get(0)
		while(st.hasMoreElements()) { // StringTokenizer 객체에 객체가 있는지
			// String이 아니면 classCastException
			String n = (String)st.nextElement();
			System.out.println(n);
		}
		while(st.hasMoreTokens()) { // StringTokenizer 객체에 객체가 있는지
			// String이 아니면 classCastException
			String n = st.nextToken();
			System.out.println(n);
		}
		
		String str1 = "oop:adn:foo";
		StringTokenizer st1 = new StringTokenizer(str1, "o");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println("--------------------------------");
		
		String str2 ="\u3000 \u3000.and.f";
		String ss = "\u3000";
//		System.out.println(ss);
		
		StringTokenizer st2 = new StringTokenizer(str2, "\u3000");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
	
	
}

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
	
	// public boolean matches(String regex)
	public void fn_matches() {
		String msg = "사과 청사과 오렌지";
		String regex = "\\b사과\\b";
		boolean isc = msg.contains("사과");
		System.out.println(isc);
		boolean isc2 = msg.matches("(.*)사과(.*)");
		boolean isc3 = msg.matches(".*\\b사과\\b.*");
		System.out.println(isc2);
		System.out.println(isc3);
		// chatGPT "사과 청사과 오렌지"에서 "청사과"만 검색하는 자바 정규식
		
		String str = "yes";
		System.out.println(str.matches("[Yy]es"));
		
		String strNum = "aaa123";
		System.out.println(strNum.matches("[0-9]")); // false
//		System.out.println(strNum.matches("*[0-9]*")); // Exception
		System.out.println(strNum.matches("a*[0-9]*")); // true 숫자가 나오기 전에 a가 반복(*)?
		// [a-z] [A-Z] ...
	}
	
	// public String replace(CharSequence target, CharSequence replacement)
	public void fn_replace(){
		String str = "pulse"; // 맥박
		String strAll = "pulsel";
		String strChange = "purse"; // 지갑
		
		String change = str.replace("l", "r");
		String change2 = strAll.replace("l", "r");
		System.out.println(change);
		System.out.println(change2); // 전체를 바꾼다. 주로 공백 지울 때 사용
	}
	// public String replaceAll(String regex,String replacement)
	public void fn_replaceAll() {
		String str = "!T%56&b";
		String regex = "[^0-9a-zA-Z]"; // 숫자, 영소대문자만 남김
		String regex2 = "[^0-9]"; // 숫자만 남김
		String result = str.replaceAll(regex, ""); // ""로 대체
		String result2 = str.replaceAll(regex2, "");
		System.out.println(result);
		System.out.println(result2);
	}

	// public String trim();앞뒤의 공백(white space, Unicode 32) 제거
	public void fn_trim() {
		String str = "       ho  ho　　　　　";
		System.out.println(str.length()); // 18
		String strTrim = str.trim();
		System.out.println(strTrim.length()); // 11 -> ㄱ한자 공백은 안사라짐
		System.out.println(strTrim);
	}

	// public String strip() -> Java 11 이후 앞 뒤 화이트스페이스(blank) 제거
	public void fn_strip() {
		String str = "       ho  ho　　　　　";
		String strStrip = str.strip();
		System.out.println(strStrip);
		System.out.println(strStrip.length()); // 6 -> ㄱ한자 공백, \t 등 다 사라짐
		
		for (int i = 0; i < 101; i++) {
			System.out.println((char)i+" : "+i);
		}
	}
	
	// public char[] toCharArray()
	// 문자열을 문자형 array로
	public void fn_toCharArray() {
		char[] strChar = {'T','O','M','A','T','O'};
		String str = new String(strChar);
		System.out.println(str);
		char[] strConvert = str.toCharArray();
		System.out.println(strConvert.length);
		System.out.println(Arrays.toString(strConvert));
	}
	
	// public static String valueOf(T)
	// 모든 타입을(기본, 참조)을 보이는 그대로 문자열 변경
	public void fn_valueOf() {
		// print(), toString()
		TextClass t = new TextClass();
		String info = t.toString();
		System.out.println(info);
		System.out.println(t); // print를 실행하면 toString을 호출
		
		int i = 100;
		char a = 'a';
		String result1 = "" + i + a;
		String result2 = String.valueOf(i)+a;
		
		String iStr = String.valueOf(i); // => new String
		String h = "100";
		System.out.println(iStr.hashCode()); // ==
		System.out.println(h.hashCode());
		
		System.out.println(System.identityHashCode(iStr)); // !=
		System.out.println(System.identityHashCode(h));
		
		System.out.println(iStr==h); // false
		System.out.println(iStr.equals(h)); // true
	}
	
	// public boolean startsWith(String prefix) // 접두어
	// public boolean endsWith(String suffix) // 접미사
	public void fn_endsWith() {
		String str = "exam@naver.com";
		System.out.println(str.endsWith("naver.com")); // true
		System.out.println(str.endsWith("google.com")); // false
		
	}
	
}

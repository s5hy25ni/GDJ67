package com.sh.ppt;

import java.util.Arrays;

public class Method {
	public static void main(String[] args) {
//		String str = String.format("%d, %s, %c", 1, "Java", 'a');
//		System.out.println(str);
		
		//			   543210
//		String str2 = "123123";
//		System.out.println(str2.indexOf("1"));
//		System.out.println(str2.indexOf("1", 1));
//		System.out.println(str2.indexOf("1", 4));
//		System.out.println(str2.indexOf("4"));
		
//		System.out.println(str2.lastIndexOf("3"));
//		System.out.println(str2.lastIndexOf("3", 0));
//		System.out.println("fromindex = 0 : "+str2.lastIndexOf("3", 0));
//		System.out.println("fromindex = 0 : "+str2.lastIndexOf("2", 0));
//		System.out.println("fromindex = 0 : "+str2.lastIndexOf("1", 0));
//		System.out.println("------------------------------------------");
//		System.out.println("fromindex = 1 : "+str2.lastIndexOf("3", 1));
//		System.out.println("fromindex = 1 : "+str2.lastIndexOf("2", 1));
//		System.out.println("fromindex = 1 : "+str2.lastIndexOf("1", 1));
//		System.out.println("------------------------------------------");
//		System.out.println("fromindex = 2 : "+str2.lastIndexOf("3", 2));
//		System.out.println("fromindex = 2 : "+str2.lastIndexOf("2", 2));
//		System.out.println("fromindex = 2 : "+str2.lastIndexOf("1", 2));
//		System.out.println("------------------------------------------");
//		System.out.println("fromindex = 3 : "+str2.lastIndexOf("3", 3));
//		System.out.println("fromindex = 3 : "+str2.lastIndexOf("2", 3));
//		System.out.println("fromindex = 3 : "+str2.lastIndexOf("1", 3));
//		System.out.println("------------------------------------------");
//		System.out.println("fromindex = 4 : "+str2.lastIndexOf("3", 4));
//		System.out.println("fromindex = 4 : "+str2.lastIndexOf("2", 4));
//		System.out.println("fromindex = 4 : "+str2.lastIndexOf("1", 4));
//		System.out.println("------------------------------------------");
//		System.out.println("fromindex = 5 : "+str2.lastIndexOf("3", 5));
//		System.out.println("fromindex = 5 : "+str2.lastIndexOf("2", 5));
//		System.out.println("fromindex = 5 : "+str2.lastIndexOf("1", 5));
//		System.out.println(str2.lastIndexOf("3", 2));
//		System.out.println(str2.lastIndexOf("3", 3));
//		System.out.println(str2.lastIndexOf("4"));
		
//		String str3 = "청사과 풋사과";
//		System.out.println(str3.matches("(.*)사과(.*)"));
//		System.out.println(str3.matches(".*\\b사과\\b.*"));
//		
//		String str4 = "사과 청사과 풋사과";
//		System.out.println(str4.matches(".*\\b사과\\b.*"));
		
//		String str = "abcd1234efgh";
//		System.out.println(str.replace("abcd", "ijkl"));
//		System.out.println(str.replaceAll("[a-z]{4}","ijkl"));
		
//		String str = "12345";
//		char[] charAt_arr = new char[str.length()];
//		for(int i =0; i < str.length(); i++) {
//			charAt_arr[i] = str.charAt(i);
//		}
//		char[] toCharArray_arr = str.toCharArray();
//
//		System.out.println(Arrays.toString(charAt_arr));
//		System.out.println(Arrays.toString(toCharArray_arr));
//		
//		String address1 = "서울시 금천구 어쩌구";
//	    String address2 = "대전시 유성구 어쩌구";
//	    System.out.println(address1.startsWith("서울시"));
//	    System.out.println(address2.startsWith("서울시"));
//	    
//	    String email1 = "exam01@gmail.com";
//	    String email2 = "exam02@naver.com";
//	    System.out.println(email1.endsWith("gmail.com"));
//	    System.out.println(email2.endsWith("gmail.com"));

		Search search = new Search();
		
		String text = "Uh-huh, listen, boy\r\n"
				+ "My first love story\r\n"
				+ "Ooh-whoa-oh, ooh-whoa-oh, yeah\r\n"
				+ "My angel and my girls\r\n"
				+ "My sunshine (uh, uh, let's go)\r\n"
				+ "너무 너무 멋져, 눈이 눈이 부셔\r\n"
				+ "숨을 못 쉬겠어, 떨리는, girl\r\n"
				+ "Gee, gee, gee, gee, baby, baby, baby\r\n"
				+ "Gee, gee, gee, gee, baby, baby, baby\r\n"
				+ "Oh, 너무 부끄러워, 쳐다 볼 수 없어\r\n"
				+ "사랑에 빠져서 수줍은 girl\r\n"
				+ "Gee, gee, gee, gee, baby, baby, baby\r\n"
				+ "Gee, gee, gee, gee, be-be-be, be-be-be";
		
		search.nextSearch(text,"Gee", true); // 1번 클릭
		search.nextSearch(text,"Gee", true); // 2번 클릭
		search.nextSearch(text,"Gee", true); // 3번 클릭
		search.nextSearch(text,"Gee", true); // 4번 클릭
		search.nextSearch(text,"Gee", true); // 5번 클릭
		
		System.out.println();
		System.out.println();
		search.allSearch(text, "gee", true);
		System.out.println();
		System.out.println();

		
		
		
	}
}

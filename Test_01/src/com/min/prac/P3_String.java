package com.min.prac;

public class P3_String {
	public static void main(String[] args) {
		String id = "";
		String domain = "";
		String str = "example@naver.com";
		
		int idx = str.indexOf("@");
		System.out.println(idx);
		
		id = str.substring(0, idx);
		System.out.println(id);
		domain = str.substring(idx+1);
		System.out.println(domain);
		
		P5_Cal p5 = new P5_Cal();
		p5.cal(5, 2);
		
		
		P8_Calendar p8 = new P8_Calendar();
		p8.leapYear(2024);
		

	}
	
}

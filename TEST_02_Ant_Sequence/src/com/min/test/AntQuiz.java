package com.min.test;

public class AntQuiz {
	public void antQuizelterator(int stage) {
		String str = "11";
		System.out.println(str);
		
		for(int i = 0; i < stage; i++) {
			str = antProcess(str);
			System.out.println(str);
		}
	}
	
	private String antProcess(String str) {
		String result = "";
		
		char initValue = str.charAt(0);
		int cnt = 1;
		
		for(int i = 0; i<str.length(); i++){
			if(initValue == str.charAt(i)){
				cnt++;
			} else {
				result = result + initValue + cnt;
				initValue = str.charAt(i);
				cnt = 1;
			}
		}
		result = result + initValue + cnt;
	
		return result;
	}
}

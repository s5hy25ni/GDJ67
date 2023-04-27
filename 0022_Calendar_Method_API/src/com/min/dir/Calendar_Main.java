package com.min.dir;

public class Calendar_Main {

	public static void main(String[] args) {
		
		Calendar_Method cm = new Calendar_Method();
		
		//TODO TEST1
//		int cnt = 0;
//		for (int i = 1; i <= 2024; i++) {
//			if(cm.isCheckYear(i)) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		//TODO TEST2
//		System.out.println(cm.getDayOfMonth(2024, 2));
//		System.out.println(cm.getDayOfMonth(2023, 2));
		
		//TODO TEST3
//		System.out.println(cm.calDays(2024));
		
		//TODO TEST4
//		System.out.println(cm.calDays(2024, 4));
		
		//TODO TEST5
//		System.out.println(cm.calDays(2024, 4, 1));
		
		//TODO TEST6
		cm.print_Calendar(2024, 3);

	}
}

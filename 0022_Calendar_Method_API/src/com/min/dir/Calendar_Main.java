package com.min.dir;

public class Calendar_Main {

	public static void main(String[] args) {
		
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

//		Calendar_Method_API api = new Calendar_Method_API();
//		api.print_Calendar(2024, 3);
		
		Calendar_sh sh = new Calendar_sh();
		for (int i = 1; i <= 12; i++) {
			
			sh.print_Calendar(2023, i);
			System.out.println();
		}

	}
}

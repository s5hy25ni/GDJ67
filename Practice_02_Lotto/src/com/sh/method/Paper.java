package com.sh.method;

import java.util.Calendar;

public class Paper {
	Util u = new Util();

	int round;
	private Calendar issue = Calendar.getInstance();
	private Calendar draw = Calendar.getInstance();
	private Calendar deadline = Calendar.getInstance();
	private String serialNum = "";
	private String[] lottoPaper;
	private int price;
	
	public Paper() {
		// test
	}	
	public Paper(String[] lottoPaper) {
		setRound();
		setDrawAndDead();
		setSerialNum();
		this.lottoPaper = lottoPaper.clone();
		setPrice();
	}

	private void setRound() {
		Calendar start = Calendar.getInstance();
		start.set(2002, 11, 7); // 로또 시작일 2002.12.7.토
//		long gapSec = (removeDayGap(issue)-removeDayGap(start))/1000;
		long gapSec = (issue.getTimeInMillis()-start.getTimeInMillis())/1000;
		long gapDay = gapSec/(24*60*60);
		round = ((int)(gapDay/7))+1;
		System.out.println(round);
		System.out.println(round);
		System.out.println(round);
		System.out.println(round);
		System.out.println(round);
		System.out.println(round);
	}
	
//	private long removeDayGap(Calendar cal) {
//		Calendar dayStart = Calendar.getInstance();
//		dayStart.set(cal.get(Calendar.YEAR), 
//						cal.get(Calendar.MONTH),
//						cal.get(Calendar.DATE),
//						0, 0, 0);
//		long dayGap = cal.getTimeInMillis()-dayStart.getTimeInMillis();
//		return cal.getTimeInMillis()-dayGap;
//	}
	
	private void setDrawAndDead() {
		int gapDay = 7-draw.get(Calendar.DAY_OF_WEEK);
		draw.add(Calendar.DATE, gapDay);
		deadline.add(Calendar.DATE, gapDay+1);
		deadline.add(Calendar.YEAR, 1);
	}
	
	private void setSerialNum() {
		String random;
		for (int i = 0; i < 7; i++) { // 7개
			random = String.valueOf(u.randomNum(100000)); // 00000 ~ 99999 까지 랜덤
			random = u.addZero(random, 5);
			serialNum += ("　"+random);
		}
	}
	
	private void setPrice() {
		price = 5000;
		for (int i = 0; i < lottoPaper.length; i++) {
			if(lottoPaper[i]==null) {
				price = i*1000;
				break;
			}
		}
	}
	
	public void printPaper() {
		System.out.println();
		System.out.printf("\t\t제 %d 회\n",round);
		System.out.println(" 발행일\t: "+getTime(issue));
		System.out.println(" 추첨일\t: "+getDay(draw));
		System.out.println(" 지급기한\t: "+getDate(deadline));
		System.out.println(serialNum);
		System.out.println("--------------------------------------------");
		for (int i = 0; i < lottoPaper.length; i++) {
			if(lottoPaper[i]==null) {
				break;
			}
			System.out.println("\t"+lottoPaper[i]);
		}
		System.out.println("--------------------------------------------");
		System.out.println(" 금액\t\t\t\t　　　￦"+price);
		System.out.println(serialNum);
		System.out.println();
		System.out.println();
	}
	
	private String getDate(Calendar cal) {
		
		String year = String.valueOf(cal.get(Calendar.YEAR));
		String month = u.addZero(String.valueOf(cal.get(Calendar.MONTH)+1), 2);
		String date = u.addZero(String.valueOf(cal.get(Calendar.DATE)), 2);

		return year+"/"+month+"/"+date;
	}
	
	private String getDay(Calendar cal) {
		
		String dayOfWeek = getDayOfWeek(cal.get(Calendar.DAY_OF_WEEK));
		
		return getDate(cal)+" ("+dayOfWeek+") ";
	}
	
	private String getTime(Calendar cal) {

		String hour = u.addZero(String.valueOf(cal.get(Calendar.HOUR_OF_DAY)), 2);
		String min = u.addZero(String.valueOf(cal.get(Calendar.MINUTE)), 2);
		String sec = u.addZero(String.valueOf(cal.get(Calendar.SECOND)), 2);
		
		return getDay(cal)+hour+":"+min+":"+sec;
	}
	
	private String getDayOfWeek(int i_dayOfWeek) {
		String DayOfWeek = switch(i_dayOfWeek){
			case 2->"월";
			case 3->"화";
			case 4->"수";
			case 5->"목";
			case 6->"금";
			case 7->"토";
			default->"일";
		};
		return DayOfWeek;
	}
	
}

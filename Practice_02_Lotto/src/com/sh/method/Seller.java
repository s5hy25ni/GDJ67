package com.sh.method;

import java.util.Arrays;

public class Seller {
	Util u = new Util();
	
	Lotto[] lottos;
	String[] lottoLines;
	String[][] lottoPapers;
	Paper[] papers;
	int[] winLotto;
	int bonusNum;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}
	public Seller(Lotto[] buyerLottos) {
		lottos = buyerLottos.clone();
		getLottoLine();
		getLottoPaper();
		papers = new Paper[lottoPapers.length];
	}
	
	public void printPapers() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(" ▷ 구매하신 로또를 인쇄합니다.");
		System.out.println();

		for (int i = 0; i < lottoPapers.length; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			papers[i] = new Paper(lottoPapers[i]);
			papers[i].printPaper();
		}
	}
	
	public void drawWinLotto() {
//		System.out.printf(" ▷ 제 %d회 로또 추첨을 시작합니다.",papers[papers.length-1]);
		System.out.printf(" ▷ 제 %d회 로또 추첨을 시작합니다.\n",1066);
		System.out.println();
		Lotto temp = new Lotto("당첨");
		winLotto = temp.getNums().clone();
		for (int i = 0; i < winLotto.length; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.printf(" ▷ %d번 당첨 숫자 : %d\n", i+1,winLotto[i]);
		}
		System.out.println();		
	}
	
	public void drawBonusNum() {
		System.out.println(" ▷ 보너스 숫자 추첨을 시작합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		while(true) {
			bonusNum = u.randomNum(45)+1;
			if(!u.checkDup(winLotto, bonusNum)) {
				break;
			}
		}
		System.out.printf(" ▷ 보너스 숫자 : %d\n", bonusNum);
		System.out.println();		
		Arrays.sort(winLotto);
	}
	
	public void printRanking() {
		System.out.println(" ▷ 당첨 여부를 확인힙니다.");
		System.out.println();
		
	}
	
	public void checkRanking(int[][] buyer, int[] winner, int bonus) {
		for (int i = 0; i < buyer.length; i++) {
			switch (compareLottos(buyer[i], winner)) {
			case 6 -> System.out.println("1등 : "+Arrays.toString(buyer[i]));
			case 5 -> System.out.printf("%d등 : %s\n",checkBonus(buyer[i], bonus),Arrays.toString(buyer[i]));
			case 4 -> System.out.println("4등 : "+Arrays.toString(buyer[i]));
			case 3 -> System.out.println("5등 : "+Arrays.toString(buyer[i]));
			default -> System.out.println("낙첨 : "+Arrays.toString(buyer[i]));
			}
		}
	}
//	public void checkRanking() {
//		for (int i = 0; i < lottos.length; i++) {
//			if(compareLottos(lottos[i].getNums(), winLotto)) {
//				lottos[i].setRanking(1);
//			} else {
//				switch (i) {
//				case 4 -> lottos[i].setRanking(checkBonues(lottos[i].getNums()));
//				case 3 -> lottos[i].setRanking(4);
//				case 2 -> lottos[i].setRanking(5);
//				default -> lottos[i].setRanking(0);
//				}
//			}
//		}
//	}
	
	public int checkBonus(int[] chkLotto, int bonus) {
		int rank = 3;
		for (int i = 0; i < 6; i++) {
			if(chkLotto[i] == bonus) {
				rank = 2;
			}
		}
		return rank;
	}	
//	public int checkBonus(int[] chkLotto) {
//		int rank = 3;
//		for (int i = 0; i < chkLotto.length; i++) {
//			if(chkLotto[i] == bonusNum) {
//				rank = 2;
//			}
//		}
//		return rank;
//	}
	
	
	public int compareLottos(int[] buyerLotto, int[] winLotto) {
		int cnt = 0;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(buyerLotto[i] == winLotto[j]) {
					cnt++;
					break;
				}
			}
		}
		
		return cnt;
	}
	
	private void getLottoLine() {
		lottoLines = new String[lottos.length];
		String lottoNums;
		for (int i = 0; i < lottos.length; i++) {
			lottoNums = "";
			for(int j = 0; j < lottos[i].getNums().length; j++) {
				lottoNums += u.addZero(String.valueOf(lottos[i].getNums()[j]),2);
				if(j<5) {
					lottoNums += "　";
				}
			}
			lottoLines[i] = getSequence(i%5)+"　"+lottos[i].getType()+"\t"+lottoNums;
		}
	}
	
	private void getLottoLine(String ranking, int[][] buyerLottos) {
		String[] winLines = new String[6];
		String winNums;
		for (int i = 0; i < buyerLottos.length; i++) {
			winNums = "";
			for(int j = 0; j < buyerLottos[i].length; j++) {
				winNums += u.addZero(String.valueOf(buyerLottos[i][j]),2);
//				switch (ranking) {
//				case 1 ->  
//				case 2 ->
//				case 3 ->
//				case 4 ->
//				case 5 ->
//				default ->
//				}
				if(j<5) {
					winNums += "　";
				}
			}
			lottoLines[i] = getSequence(i%5)+"　"+lottos[i].getType()+"\t"+winNums;
		}
	}
	
	private void getLottoPaper() {
		getLottoLine();
		lottoPapers = new String[((lottoLines.length-1)/5)+1][5];
		for (int i = 0; i < lottoPapers.length; i++) {
			for (int j = i*5; j<(i+1)*5; j++) { 
				if(j==lottoLines.length) {
					break;
				} else {					
					lottoPapers[i][j%5] = lottoLines[j];
				}
			}
		}
	}
	
	private String getSequence(int seq) {
		String line = switch(seq){
			case 0->"A";
			case 1->"B";
			case 2->"C";
			case 3->"D";
			default->"E";
		};
		return line;
	}

}

package com.sh.method;

import java.util.Arrays;

public class Seller {
	Util u = new Util();
	
	private Lotto[] lottos;
	private String[] lottoLines;
	private String[][] lottoPapers;
	private Paper[] papers;
	
	private int[] winLotto;
	private int bonusNum;
	private String[] drawLines;
	private String[][] drawPapers;
	private int[][] prize;
	
	public Seller(Lotto[] buyerLottos) {
		lottos = buyerLottos.clone();
		getLottoLine();
		lottoPapers=getPaper(lottoLines, lottoPapers);
		papers = new Paper[lottoPapers.length];
	}
	
	private void getLottoLine() {
		lottoLines = new String[lottos.length];
		String lottoNums;
		for (int i = 0; i < lottoLines.length; i++) {
			lottoNums = "";
			for(int j = 0; j < lottos[i].getNums().length; j++) {
				lottoNums += ("\t"+u.addZero(String.valueOf(lottos[i].getNums()[j]),2));
			}
			lottoLines[i] = getSequence(i%5)+"\t"+lottos[i].getType()+"\t"+lottoNums;
		}
	}
	
	private String getSequence(int seq) {
		String lineSeq = switch(seq){
			case 0->"A";
			case 1->"B";
			case 2->"C";
			case 3->"D";
			default->"E";
		};
		return lineSeq;
	}
	
	private String[][] getPaper(String[] lines, String[][] papers) {
		papers = new String[((lines.length-1)/5)+1][5];
		for (int i = 0; i < papers.length; i++) {
			for (int j = i*5; j<(i+1)*5; j++) { 
				if(j==lines.length) {
					break;
				} else {					
					papers[i][j%5] = lines[j];
				}
			}
		}
		return papers.clone();
	}
	
	public void printPapers() {
		System.out.println(" ▷ 구매하신 로또를 인쇄합니다.");
		System.out.println();

		for (int i = 0; i < lottoPapers.length; i++) {
			papers[i] = new Paper(lottoPapers[i]);
			papers[i].printPaper();
		}
	}
	
	public void drawWinLotto() {
		System.out.printf(" ▷ 제 %d회 로또 추첨을 시작합니다.",papers[papers.length-1].getRound());
		System.out.println();
		Lotto temp = new Lotto("당첨", 7);
		winLotto = new int[temp.getNums().length-1];
		for (int i = 0; i < winLotto.length; i++) {
			winLotto[i] = temp.getNums()[i];
			System.out.printf(" ▷ %d번 당첨 숫자\t:\t%d\n", i+1,winLotto[i]);
		}
		
		bonusNum = temp.getNums()[6];
		System.out.println();
		System.out.println(" ▷ 보너스 숫자 추첨을 시작합니다.");
		System.out.println();
		System.out.printf(" ▷ 보너스 당첨 숫자 :\t%d\n", bonusNum);
		System.out.println();		
		Arrays.sort(winLotto);
	}
	
	public void printDrawPapers() {
		System.out.println(" ▷ 당첨 여부를 확인합니다.");
		System.out.println();
		getDrawLine();
		drawPapers = getPaper(drawLines, drawPapers);
		for (int i = 0; i < drawPapers.length; i++) {
			printDrawPaper(drawPapers[i]);
		}
	}
	
	private void getDrawLine() {
		drawLines = new String[lottos.length];
		String drawNum;
		int cnt;
		boolean bonusIn;
		for (int i = 0; i < lottos.length; i++) {
			drawNum = "";
			cnt = 0;
			bonusIn = false;
			for (int j = 0; j < 6; j++) {
				if(lottos[i].getNums()[j]==winLotto[j]) {
					cnt++;
					drawNum += ("\t("+u.addZero(String.valueOf(winLotto[j]), 2)+")");
				} else if(lottos[i].getNums()[j]==bonusNum) {
					bonusIn = true;
					drawNum += ("\t("+u.addZero(String.valueOf(bonusNum), 2)+")");
				} else {
					drawNum += ("\t"+u.addZero(String.valueOf(lottos[i].getNums()[j]), 2));
				}
//				prize[i][j] = checkPrize(cnt, bonusIn);
			}
			
			drawLines[i] = getSequence(i%5)+"\t"+checkRanking(cnt, bonusIn)+drawNum;
		}
	}
	
	private void printDrawPaper(String[] drawPaper) {
		System.out.println();
		System.out.printf("\t\t\t\t제 %d 회\n",papers[0].getRound());
		System.out.println("\t\t\t\t당첨번호\t\t\t　　");
		System.out.printf("\t");
		for (int i = 0; i < winLotto.length-1; i++) {
			System.out.printf("\t%d",winLotto[i]);
		}
		System.out.printf("　+　%s\t　　\n",u.addZero(String.valueOf(bonusNum), 2));
		System.out.printf("\t\t\t\t총 얼마 당첨\n");
//		for (int i = 0; i < winLotto.length; i++) {			
//			System.out.printf("\t\t\t\t총 %d원 당첨\n",calPrize(i));
//		}
		for (int i = 0; i < drawPaper.length; i++) {
			if(drawPaper[i]==null) {
				break;
			}
			System.out.println("\t"+drawPaper[i]);				
		}
		System.out.println();
		System.out.println();
	}
	
	private String checkRanking(int cnt, boolean bonusIn) {
		String rank = switch (cnt) {
		case 6 -> "1등당첨";
		case 4 -> "4등당첨";
		case 3 -> "5등당첨";
		case 2,1,0 -> "낙첨\t";
		default -> {
			if(bonusIn) {
				yield"2등당첨";
			}else{
				yield"3등당첨";
			}
		}
		};
			
		return rank;
	}
	private int checkPrize(int cnt, boolean bonusIn) {
		int prize  = switch (cnt)  {
		case 6 -> 2000000000;
		case 4 -> 50000;
		case 3 -> 5000;
		case 2,1,0 -> 0;
		default -> {
			if(bonusIn) {
				yield 70000000;
			}else{
				yield 5000000;
			}
		}
	};
		return prize;
	}
	
	private int calPrize(int seq) {
		int sum = 0;
		for (int i = 0; i < prize.length; i++) {
				sum += prize[seq][i];
		}
		return sum;
	}
}

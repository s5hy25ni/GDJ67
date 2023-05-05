package com.sh.method;

public class Seller {
	Util u = new Util();
	
	Lotto[] lottos;
	String[] lottoLines;
	String[][] lottoPapers;
	Paper[] papers;
	
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
		System.out.println(" ▷ 로또가 모두 생성되었습니다.");
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
	
	public void drawLots() {
		Lotto win = new Lotto("당첨");
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

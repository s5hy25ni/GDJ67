package com.sh.ppt;

public class Search {

	static String currentTarget = null;
	static int startIdx = 0;
	int targetFirstIdx = 0;
	int targetLastIdx = 0;

	public void nextSearch(String text, String target, boolean ignoreCase) {
		if(currentTarget==null || !currentTarget.equals(target)) {
			currentTarget = target;
			startIdx = 0;
			targetFirstIdx = 0;
			targetLastIdx = 0;
		}
		if(ignoreCase) {
			text = text.toUpperCase();
			target = target.toUpperCase();
		}
		if(text.contains(target)) {
			targetFirstIdx = text.indexOf(target, startIdx);
			targetLastIdx = targetFirstIdx+target.length()-1;
			startIdx = (targetFirstIdx+target.length());
			if(targetFirstIdx<0) {
				System.out.printf("\"%s\"(은)는 존재하지 않습니다.\n", currentTarget);
			} else {
				System.out.printf("\"%s\"의 위치 : %d-%d\n",currentTarget, targetFirstIdx, targetLastIdx);
			}
		} else {
			System.out.printf("\"%s\"(은)는 존재하지 않습니다.\n", currentTarget);
		}
	}
	
	public void allSearch(String text, String target, boolean ignoreCase) {
		int cnt = 0;
		currentTarget = target;
		startIdx = 0;
		while(true) {
			if(!text.toUpperCase().substring(startIdx).contains(target.toUpperCase())) {
				break;
			} else {
				nextSearch(text, target, ignoreCase);
				cnt++;
			}
		}
		System.out.printf("%s(은)는 모두 %d개 있습니다.",target, cnt);
	}
	
}

package com.sh.ppt;

public class Search {

	int targetFirstIdx = 0;
	int targetLastIdx = 0;
	int startIdx = 0;

	public void nextSearch(String text, String target) {
		if(text.contains(target)) {			
			targetFirstIdx = text.indexOf(target, startIdx);
			targetLastIdx = findLastIdx(targetFirstIdx, target.length());
			startIdx += (targetFirstIdx+target.length()-1);
			System.out.printf("%s의 위치 : %d-%d\n",target, targetFirstIdx, targetLastIdx);
		} else {
			System.out.printf("%s(은)는 존재하지 않습니다.\n", target);
		}
	}
	
	public int findLastIdx(int targetIdx, int targetLen) {
		return targetIdx+targetLen-1;
	}
}

package com.sh.ppt;

public class Search {

	static int targetFirstIdx = 0;
	static int targetLastIdx = 0;
	static int startIdx = 0;

	public void nextSearch(String text, String target) {
		if(text.contains(target)) {			
			// text = endendend, target = end
			targetFirstIdx = text.indexOf("target", startIdx); // 0
			targetLastIdx = findLastIdx(targetFirstIdx, target.length()); // 0+3-1 = 2
			startIdx += (target.length()-1); // 0+3-1 = 2
			System.out.printf("%s의 위치 [%d-%d] : \n"+target, targetFirstIdx, targetLastIdx);
		} else {
			System.out.printf("%s(은)는 존재하지 않습니다.\n", target);
		}
	}
	
	public int findLastIdx(int targetIdx, int targetLen) {
		return targetIdx+targetLen-1;
	}
}

package com.min.edu;

public class FriendlyNum_SH {
	
	private boolean cheakYaksu(int num, int chkNum) {
		return (num%chkNum==0)?true:false;
	}
	
	public int yaksuSum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum = (cheakYaksu(num, i))?sum+i:sum;
		}
		
		return sum;
	}
	
	public void findFriNum(int area) {
		int i_friNum = 0;
		for (int i = 4; i <= area; i++) { // 
			i_friNum = yaksuSum(i); // i=220 -> first=284
			if(i_friNum>i) {
				if(i==yaksuSum(i_friNum)) {
					System.out.printf("%d와 %d는 친화수입니다.\n",i,i_friNum);
				}
			}
		}
		
	}
}

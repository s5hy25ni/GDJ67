package com.sh.method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	

	public String addZero(String str, int wantLength) {
		if(str.length()<wantLength) {
			for (int i = 0; i < wantLength-str.length(); i++) {
				str="0"+str;
			}
		}
		return str;
	}
	
	public boolean checkDup(int[] chkNums, int chkNum) {
		boolean isc = false;
		for (int i = 0; i < chkNums.length; i++) {
			if (chkNums[i] == chkNum) {
				isc = true;
				break;
			}
		}
		return isc;
	} // checkDup(int[], int)
}

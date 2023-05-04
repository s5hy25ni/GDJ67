package com.min.edu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// java7 이후에 try with resource 문법
// try(리소스=열고 닫음이 있는 객체 정의) -> 리소스를 자동으로 닫아준다.

public class Exception_Step06_01 {

	public int calculation(){ // throws : 나를 사용하는 곳에 예외처리를 위임
		
		int n = 0;
		
		// 기존방식
		// 리소스를 환원(close)해야한다면 사용되는 block 영역 밖에 선언 try { 처리될 연산 } catch(발생할 수 있는 에러) { 에러 처리 } finally { 리소스.close}
//		Scanner scan = null;
//		try {
//			scan = new Scanner(System.in);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			scan.close();
//		}

		// try with resource
		try (Scanner scan = new Scanner(System.in)) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Checked Exception : 클래스를 사용할 때 반드시 예외처리를 해야함
		try {
			FileReader file1 = new FileReader("missing.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return n;
	}
}

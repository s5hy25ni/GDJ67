package com.min.edu;

import java.io.FileNotFoundException;

public class Exception_Main {

	public static void main(String[] args) {
//		Exception_Step01 step01 = new Exception_Step01();
//		System.out.println(step01.calculation());
//		Exception_Step02 step02 = new Exception_Step02();
//		System.out.println(step02.calculation());
//		Exception_Step04 step03 = new Exception_Step04();
//		System.out.println(step03.calculation());
//		Exception_Step05 step05 = new Exception_Step05();
//		System.out.println(step05.calculation());
//		Exception_Step06 step06 = new Exception_Step06();
//		// main에서 throws를 하면 jvm이 처리해줌 -> XX
//		try {
//			System.out.println(step06.calculation());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// class에서 미리 try-catch를 하면 main에서는 안해도 됨
//		Exception_Step06_01 step06_01 = new Exception_Step06_01();
//		System.out.println(step06_01.calculation());
//		Exception_Step07 step07 = new Exception_Step07();
//		try {
//			System.out.println(step07.calculation(-1));
//		} catch (UserDefindException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("예외처리 처리");
		
//		Exception_Step08 step08 = new Exception_Step08();
//		try {
//			step08.makeException();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Exception_NotUsed notUsed = new Exception_NotUsed();
		notUsed.calculation();
	}

}

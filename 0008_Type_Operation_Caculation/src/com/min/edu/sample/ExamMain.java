package com.min.edu.sample;

public class ExamMain {

	public static void main(String[] args) {
		Exam ex = new Exam();
//		ex.charnumToNum();
//		ex.charToChar();
//		ex.charIndex();
//		ex.uni();
		
		double num = 0.1;
		double result = 0.0;
		for(int i=0; i<10; i++) {
			result += num;
		}
		System.out.println(result);
	}

}

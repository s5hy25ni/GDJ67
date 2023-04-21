package com.min.edu.bmi;

public class bmiMain {

	public static void main(String[] args) {

		BmiClass bmi = new BmiClass();
		int kg = 60;
		double m = 1.7;
		double result = bmi.bmi_caculation(kg, m);
		System.out.println(result);
		
	}

}

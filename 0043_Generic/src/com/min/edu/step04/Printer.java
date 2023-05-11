package com.min.edu.step04;

public class Printer <T extends Animal> {
	private T printerValue;

	public Printer(T printerValue) {
		super();
		this.printerValue = printerValue;
	}
	
	public void print() {
		System.out.println("무엇이든 Animal이라면 출력하세요. : "+printerValue);
	}
}

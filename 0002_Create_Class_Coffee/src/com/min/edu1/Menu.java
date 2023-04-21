package com.min.edu1;

public class Menu {
	private int cnt;
	int num;
	String name;
	int price;
	int stock;
	
	
	public void printMenu() {
		System.out.println("["+this.num+"] "+this.name+" "+this.price+"원");
	}
	public void printMenuInfo() {
		System.out.println("["+this.num+"] "+this.name+" "+this.price+"원 (재고 : "+this.stock+"개");
	}
	public void printMenu(int balance) {
		if(this.price <= balance) {
			System.out.println("["+this.num+"] "+this.name+" "+this.price+"원");
		}
	}
	
	Menu(String name1, int price1, int num1){
		name = name1;
		price = price1;
		num = num1;
	}
}
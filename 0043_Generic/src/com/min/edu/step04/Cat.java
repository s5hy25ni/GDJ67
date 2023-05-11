package com.min.edu.step04;

public class Cat extends Animal{

	private String CatName;

	public Cat(String catName) {
		super();
		CatName = catName;
	}

	public String getCatName() {
		return CatName;
	}

	public void setCatName(String catName) {
		CatName = catName;
	}

	@Override
	public String toString() {
		return CatName;
	}
	
	
}

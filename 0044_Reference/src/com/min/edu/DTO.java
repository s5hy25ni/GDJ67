package com.min.edu;

public class DTO {
	
	//DataTransferObject
	
	public int num;
	public DTO() {
		num = (int)(Math.random()*10)+1;
		
	}
	@Override
	public String toString() {
		return "DTO [num=" + num + "]";
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}

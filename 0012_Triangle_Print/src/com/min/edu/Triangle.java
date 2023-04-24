package com.min.edu;

public class Triangle {
	public void triangle_One() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<(i+1); j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	public void triangle_Two() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<(4-i); j++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}
	public void triangle_Three() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<(3-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i+1); j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	public void triangle_Four() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(4-i); j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	public void diamond_One() {
		for (int i=0; i<4; i++) {
			for(int j=0; j<(3-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i+1); j++) {
				System.out.print("★");
			}
			for(int j=0; j<(3-i); j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	public void diamond_Two() {
		
	}

}

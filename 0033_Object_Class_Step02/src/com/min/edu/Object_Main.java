package com.min.edu;

public class Object_Main {

	public static void main(String[] args) {

		UserDefineClass ud_origin = new UserDefineClass();
		com.min.edu.gd67.UserDefineClass ud_other = new com.min.edu.gd67.UserDefineClass();
		
		System.out.println(ud_origin.hashCode());
		System.out.println(ud_other.hashCode());
		
		System.out.println(ud_origin.hashCode()==ud_other.hashCode());
		//java.lang.ClassCastException
//		System.out.println(ud_origin.equals(ud_other));
		System.out.println(ud_other.equals(ud_origin));
	}

}

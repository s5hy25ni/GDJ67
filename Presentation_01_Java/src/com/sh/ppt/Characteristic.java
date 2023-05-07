package com.sh.ppt;

import java.util.Arrays;
import java.util.Scanner;

public class Characteristic {
	public static void main(String[] args) {
		
//		// 기본 타입 선언
//		byte b = 0;
//		short s = 0;
//		int i = 0;
//		long l = 0L;
//		float f = 0.0F;
//		double d = 0.0;
//		char c = 'c';
//		boolean isc = false;
//		
//		// String 선언
//		String str = "JavaString";
//		
//		// 참조 타입 new
//		ReferenceType ref = new ReferenceType();
//		Scanner scan = new Scanner(System.in);
//		
//		// String new
//		String str2 = new String("JavaString");
//		System.out.println();
		
		
		
		
//		// 기본 타입 대입
//		int i2 = i;
//		System.out.println("i의 값 : "+i);
//		System.out.println("i2의 값 : "+i2);
//		
//		i2 = 1;
//		System.out.println("i2에 1을 대입한 후 i의 값 : "+i);
//		System.out.println("i2에 1을 대입한 후 i2의 값 : "+i2);
//		
//		System.out.println();
//		
//		// 참조 타입 대입
//		ReferenceType ref2 = ref;
//		System.out.println("ref.i의 값 : "+ref.i);
//		System.out.println("ref2.i의 값 : "+ref2.i);
//		
//		ref2.i = 2;
//		System.out.println("ref2.i에 2를 대입한 후 ref.i값 : "+ref.i);
//		System.out.println("ref2.i에 2를 대입한 후 ref2.i값 : "+ref2.i);
//		
//		System.out.println();
//		
//		// String 대입
//		String str3 = str;
//		System.out.println("str의 값 : "+str);
//		System.out.println("str3의 값 : "+str3);
//		
//		str3 = "String";
//		System.out.println("str3에 String을 대입한 후 str의 값 : "+str);
//		System.out.println("str3에 String을 대입한 후 str3의 값 : "+str3);
//		
		System.out.println();
		
		
//		// 기본 타입 비교
//		int i = 0;
//		int i2 = 0;
//		int i3 = i;
//		System.out.println("i == i2 ? "+(i==i2));
//		System.out.println("i == i3 ? "+(i==i3));
//		System.out.println();
//		
//		// 참조 타입 비교
//		ReferenceType ref = new ReferenceType();
//		ReferenceType ref2 = new ReferenceType();
//		ReferenceType ref3 = ref;
//		System.out.println("ref의 내용물 : "+ref.toString());
//		System.out.println("ref2의 내용물 : "+ref2.toString());
//		System.out.println("ref == ref2 ? "+(ref==ref2));
//		System.out.println();
//		System.out.println("ref의 내용물 : "+ref.toString());
//		System.out.println("ref3의 내용물 : "+ref3.toString());
//		System.out.println("ref == ref3 ? "+(ref==ref3));
//		System.out.println();
//		
//		// String 비교
//		String str = "JavaString";
//		String str2 = "JavaString";
//		String str3 = str;
//		System.out.println("str == str2 ? "+(str==str2));
//		System.out.println("str == str3 ? "+(str==str3));
//		
//		String str4 = new String("JavaString");
//		System.out.println("str == str4 ? "+(str==str4));
		
//		int i = 1;
//		int i2 = 2;
//		int i3 = i+i2;
//		
//		char c = 'a';
//		char c2 = 'a';S
//		String c3 = c+c2;
//		
//		boolean b = false;
//		boolean b2 = false;
//		boolean b3 = b+b2;
//		
//		String str = "Java";
//		String str2 = "String";
//		String str3 = str+str2;
//		String str4 = "Java"+"String";
//		
		
		Operator o = new Operator();
//		String str = "Java";
//		String str2 = "String";
//		String str3 = o.sum(str, str2);
//		System.out.println("str+str2 = "+str3);
		
		
//		int i = 1;
//		char c = 'a';
//		System.out.println("1+a = "+i+c);
//		char c2 = '가';
//		System.out.println("1+가 = "+i+c2);
		
		String str = "Java";
		String str2 = "";
		String str3 = null;
		
//		System.out.println(str.charAt(0));
//		try {
//			System.out.println(str2.charAt(0));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(str3.charAt(0));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		try {
			System.out.println(str3.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
//		
//		System.out.println("1+null+a = "+(1+str+'a'));
//		System.out.println("1+\"\"+a = "+(1+str2+'a'));
//		System.out.println("\"\"+null+java = "+(str2+str+str3));
		
//		int[] i_arr = new int[3];
//		double[] d_arr = new double[3];
//		char[] c_arr = new char[3];
//		boolean[] b_arr = new boolean[3];
//		String[] s_arr = new String[3];
//		
//		System.out.println(Arrays.toString(i_arr));
//		System.out.println(Arrays.toString(d_arr));
//		System.out.println(Arrays.toString(c_arr));
//		System.out.println(Arrays.toString(b_arr));
//		System.out.println(Arrays.toString(s_arr));

		
		
		
	}
}

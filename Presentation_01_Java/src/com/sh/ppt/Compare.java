package com.sh.ppt;

public class Compare {
	
	public static void main(String[] args) {

//		System.out.println();
		String str1 = "JavaString";
		String str2 = "JavaString";
		String str3 = str1;
		String str4 = new String("JavaString");
//		System.out.println("str1==str2 ? "+(str1==str2));
//		System.out.println("str1==str3 ? "+(str1==str3));
//		System.out.println("str1==str4 ? "+(str1==str4));
//		
//		System.out.println();
		String str5 = "Java"+"String";
		String temp1 = "Java";
		String temp2 = "String";
		String str6 = temp1+temp2;
//		System.out.println("str1==str5 ? "+(str1==str5));
//		System.out.println("str1==str6 ? "+(str1==str6));
//		
//		System.out.println();
//		System.out.println("str1.equals(str2) = "+str1.equals(str2));
//		System.out.println("str1.equals(str3) = "+str1.equals(str3));
//		System.out.println("str1.equals(str4) = "+str1.equals(str4));
//		System.out.println("str1.equals(str5) = "+str1.equals(str5));
//		System.out.println("str1.equals(str6) = "+str1.equals(str6));
//		
//		System.out.println();
//		System.out.println("str1 hashCode = "+str1.hashCode());
//		System.out.println("str2 hashCode = "+str2.hashCode());
//		System.out.println("str3 hashCode = "+str3.hashCode());
//		System.out.println("str4 hashCode = "+str4.hashCode());
//		System.out.println("str5 hashCode = "+str5.hashCode());
//		System.out.println("str6 hashCode = "+str6.hashCode());
//		
//		System.out.println();
//		System.out.println("str1 identityHashCode = "+System.identityHashCode(str1));
//		System.out.println("str2 identityHashCode = "+System.identityHashCode(str2));
//		System.out.println("str3 identityHashCode = "+System.identityHashCode(str3));
//		System.out.println("str4 identityHashCode = "+System.identityHashCode(str4));
//		System.out.println("str5 identityHashCode = "+System.identityHashCode(str5));            
//		System.out.println("str6 identityHashCode = "+System.identityHashCode(str6));            
//		
		System.out.println();
		System.out.println("str1.intern() = "+str1.intern());
		System.out.println("str2.intern() = "+str2.intern());
		System.out.println("str3.intern() = "+str3.intern());
		System.out.println("str4.intern() = "+str4.intern());
		System.out.println("str5.intern() = "+str5.intern());
		System.out.println("str6.intern() = "+str6.intern());
		
		System.out.println();
		System.out.println("str1.intern()==str4.intern() ? "+(str1.intern()==str4.intern()));
		System.out.println("str1.intern()==str6.intern() ? "+(str1.intern()==str6.intern()));
		
		
//		String str1 = "Java";
//		String str2 = new String("Java");
//		
		str1.hashCode();
		str2.hashCode();
		System.identityHashCode(str1);
		System.identityHashCode(str2);
		str1.intern();
		str2.intern();		
		str1.intern().hashCode();
		str2.intern().hashCode();
		System.identityHashCode(str1.intern());
		System.identityHashCode(str2.intern());
	}
}

package com.min.edu.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Feature {

	public void list_Check() {
		
//		List<Integer> lists = new ArrayList<Integer>();
//		
//		lists.add(111);
//		lists.add(222);
//		lists.add(333);
//		
//		for (int i = 0; i < lists.size(); i++) {
//			System.out.println(lists.get(i));
//		}
		
		List<Integer> lists = new ArrayList<Integer>();
		int n1 = 20, n2 = 30, n3 = 40; // 기본타입 ** Wrapper Class란? 해당 기본 타입과 쌍으로 되어 있는 참조 타입
		
//		Integer i = new Integer(10); // 1.8에서는 Wrapper, 1.9부터는 자동으로 변환(Auto-Boxing, Auto-UnBoxing)
//		int n = i.intValue(); // 예전에는 기본 타입으로 바꾸기 위해 이 과정을 거쳐야 했음
		
		lists.add(n1); // idx 0
		lists.add(n2); // 		1
		lists.add(n3); //		2
		lists.add(n3); //		3
		
		System.out.println(lists.get(0)); // index로만 출력 가능
		
		System.out.println(lists);
		
		n3 = 100;
		System.out.println(lists);
		
		int n4 = 30; // 기본 타입
		Integer n5 = n4; // 참조 타입
		
		
		// remove
//		System.out.println(lists.remove(n4)); // 기본 타입을 넣으면 index로 인식한다.
		System.out.println(lists.remove(n5)); // 
		System.out.println(lists);
	} // Check
	
	public void list_Iterator() {
		List<String> lists = new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("C");
		lists.add("G");
		
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i)); // remove 및 get은 인덱스를 받음
			
		}
		
		for (String s : lists) { // 제네릭: Object
			System.out.println(s);
		}
		System.out.println("----------------------------------------------");
		for (Object s : lists) { // 제네릭: Object
			System.out.println(s); // s -> Object toStirng()을 하면 자동 출력
			String ss = (String)s; // Object는 down-casting을 잘하자
		}
		System.out.println("----------------------------------------------");
		Iterator<String> iter = lists.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	} // iterator
	
	public void list_contain() {
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(10);
		lists.add(100);
		lists.add(1000);
		
		boolean isc = lists.contains(100);
		System.out.println(isc);
		
		int find = 1000;
		boolean iscF = lists.contains(find);
		System.out.println(iscF);
		
		lists.clear();
		System.out.println(lists.size());
		
		List<String> listsString = new ArrayList<String>();
		listsString.add("A");
		listsString.add("B");
		listsString.add("C");
		listsString.add("G");
		
		System.out.println(listsString.indexOf("B"));
		
		
		// Array로 변경
		String[] strs = {"JAVA","HTML","Database"};
		List<String> strsList = Arrays.asList(strs);
		ArrayList<String> strsArrayList = new ArrayList<String>(Arrays.asList(strs));
		System.out.println(strsList.getClass());
		System.out.println(strsArrayList.getClass());
		
	}
}

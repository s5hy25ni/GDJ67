package com.min.edu.set;

import java.util.ArrayList;
import java.util.List;

public class List_Feature {

	public void list_Check() {
		
		List<Integer> lists = new ArrayList<Integer>();
		
		lists.add(111);
		lists.add(222);
		lists.add(333);
		
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
	}
}

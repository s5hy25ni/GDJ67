package com.min.edu.ctrl;

import com.min.edu.H20Impl;
import com.min.edu.Ice;
import com.min.edu.Steam;
import com.min.edu.Water;

public class ChoiceFatory {
	
	private static ChoiceFatory factory;
	public static int factoryCount = 0;
	
	private ChoiceFatory() {
		factoryCount++;
	}

	public static ChoiceFatory getInstance() {
		if(factory==null) {
			factory = new ChoiceFatory();
		}
		return factory;
	}
	
	public H20Impl factory(int choice) {
		H20Impl obj = null;
		
		switch (choice) {
		case 1:
			obj = new Ice();
			break;
			
		case 2:
			obj = new Water();
			break;
			
		case 3:
			obj = new Steam();
			break;

		default:
			break;
		}
		
		return obj;
	}
}

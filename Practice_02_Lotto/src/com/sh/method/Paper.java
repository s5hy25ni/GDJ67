package com.sh.method;

import java.util.Calendar;
import java.util.UUID;

public class Paper {
	Calendar cal = Calendar.getInstance();
	
	int round;
	String issueDate = cal.get(Calendar.YEAR)+"/"+cal.get(Calendar.MONTH+1)+"/"+cal.get(Calendar.DATE);
	String drawDate;
	String deadline;
	UUID serialNum = UUID.randomUUID();
	Lotto[] paper = new Lotto[5];
	int price;
	
	
	
}

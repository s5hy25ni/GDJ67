package com.min.edu;

import java.util.ArrayList;
import java.util.List;

public class DTOCase {
	
	private List<DTO> dtoCase;
	
	public DTOCase() {
		dtoCase = new ArrayList<DTO>();
	}	
	
	public void inCase() {
		
		DTO d;
//		DTO d = new DTO(); NullPointException
		
		for (int i = 0; i < 5; i++) {
			d = new DTO();
			dtoCase.add(d);
		}
		System.out.println(dtoCase);
	}


}

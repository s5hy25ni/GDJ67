package com.min.edu.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DistinctStream {

	@Test
	public void distinctWithList() {
		
		List<Integer> nums = List.of(1,1,2,2,2,2,3,3,3,3,4,4,4,6,6,7,7,7,8,8,8,9,9,9); // 12346789 8개
		
		// 중복 제거
		List<Integer> distinctNum = nums.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNum);
		
		assertThat(distinctNum).hasSize(8);
		
	}
	
	@Test
	public void distinctWithSet() {
		List<Integer> nums = List.of(1,1,2,2,2,2,3,3,3,3,4,4,4,6,6,7,7,7,8,8,8,9,9,9); // 12346789 8개
		Set<Integer> distinctSet = nums.stream().collect(Collectors.toSet());
		System.out.println(distinctSet);
		
	}
	
}

package com.min.edu.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.min.edu.beans.Person;
import com.min.edu.mockdata.MockData;

public class PracticeStream {

	// 문제 1 : 이메일만 추출해서 출력해주세요.
//	@Test
	public void practice001() throws IOException {
//		List<String> emails = MockData.getPeople().stream().
//				map(e->e.getEmail()).collect(Collectors.toList());

		List<String> emails = MockData.getPeople().stream().map(Person::getEmail).collect(Collectors.toList());

		emails.forEach(System.out::println);
	}

	// 문제 2 : car에서 10000 이하의 차 가격의 1.5배의 새로운 가격 부여
	// filter 검색 map 입력
//	@Test
	public void practice002() throws IOException {
		List newList = MockData.getCar().stream().filter(c -> {
			System.out.println("--f--" + c);
			return c.getPrice() < 10000;
		}).map(c -> {
			System.out.println("--m1--" + c);
			return c.getPrice();
		}).map(price -> {
			System.out.println("--m2" + price);
			return price * 1.5;
		}).collect(Collectors.toList());// () : 아규먼트 X , (p1,p2) : 아규먼트 2개 이상, p : 아규먼트 1 개

		for (Object o : newList) {
			System.out.println(o);
		}
	}

}

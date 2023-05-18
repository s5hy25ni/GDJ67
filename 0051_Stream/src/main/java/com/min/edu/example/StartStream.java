package com.min.edu.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.min.edu.beans.Person;
import com.min.edu.mockdata.MockData;

public class StartStream {

//	@Test
	@DisplayName("예전 처리 방식을 테스트 합니다.")
	public void oldArroch() throws IOException {
		// 1. 사람들(people.json) 중에서 검색
		// 2. 나이는 18세 이하, 10명만
		
		List<Person> people = MockData.getPeople(); // people.json 에서 java 객체로 변환
//		System.out.println(people);
		List<Person> choicePeople = new ArrayList<Person>();
		
		int limit = 10;
		int cnt = 0;
		
		for (Person person : people) {
			if(person.getAge() < 18) {
				choicePeople.add(person);
				cnt++;
				if(cnt==limit) {
					break;
				}
			}
		}
		
//		choicePeople.forEach(System.out::println);
		
	}
	
//	@Test -> void로 만들셈
	public void newApprochStream() throws IOException {
		List<Person> people = MockData.getPeople();
		List<Person> choicePeople = people.stream(). // 1. people의 리스트를 stream으로 만들쟈~!
				filter(p->p.getAge()<=18). // 2. 중간 판단 연산자를 작성
				limit(10). // 3. 중간 연산자 중 갯수 제한을 작성한다.
				collect(Collectors.toList());
		choicePeople.forEach(System.out::println); // 패키지.클래스::메소드명
	}
	
	// List에 문자열 중에서 한 개의 같은 문자열을 찾아서 만들고 싶음_예전 방식
	public List<String> find(List<String> member, String str) {
		List<String> result = new ArrayList<String>();
		
		for (String s : member) {
			if(s.equals(str)) {
				result.add(s);
			}
		}
		
		return result;
	}
	
	// List에 문자열 중에서 한 개의 같은 문자열을 찾아서 만들고 싶음_Stream
	public List<String> findStream(List<String> member, String str) {
		return member.stream().filter(mem->mem.equals(str)).collect(Collectors.toList());
	}
	
}

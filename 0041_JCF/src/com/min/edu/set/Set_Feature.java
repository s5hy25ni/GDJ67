package com.min.edu.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Sets;

public class Set_Feature {
	
	public void set_Check2() {
		Set<String> sets = new HashSet<String>();
		String a = "가", b="나", c="다";
		String d = new String("다");
		
		sets.add(a);
		sets.add(b);
		sets.add(c);
		
		// 삭제
		sets.remove(d);
		
		// 조회(contains): hashcode로 검색
		System.out.println(sets.contains("다"));
		
		// 크기
		System.out.println(sets.size());
		
		// JCF -> Array
//		String[] str = (String[])(sets.toArray()); -> ClassCastException
		Object[] abjArray = sets.toArray();
		
//		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(abjArray));
		
		for (int i = 0; i < abjArray.length; i++) {
			String s = (String)abjArray[i];
			System.out.println(i + " : "+s);
		}
		
		for (Object o : abjArray) {			
			System.out.println((String)o);
		}
	}
	
	public void set_Check() {
		
		// 중복되지 않은 String 값이 들어가는 공간
		Set<String> sets = new HashSet<String>();
		String a = "가", b="나", c="다";
		String d = new String("다");
		
		System.out.println("c 생성 의 원래 hashcode : "+System.identityHashCode(c));
		System.out.println("d new 의 원래 hashcode : "+System.identityHashCode(d));
		
		sets.add(a);
		sets.add(b);
		sets.add(c);
		sets.add(d); // 기존 값을 유지합니다!!!
	
		// 출력은 Set의 정의에 의해서 순서가 없다.
		for (String s : sets) {
			System.out.println(s+"/"+System.identityHashCode(s));
		}
		
		// 비교
		System.out.println(sets.contains("다"));
		System.out.println(sets.contains(d)); // d의 주소가 아닌 값으로 판단(hashcode override)
		
		// 출력
		// enhanced for 향상된 for
		// 순서가 없기 때문에 Iterator Design Pattern
		Iterator<String> iter = sets.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println("끝");
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
	}

	public void set_use() {
		// Set<E>의 E는 Element(멤버필드), <>은 제너릭 => 들어갈 수 있는 타입(wrapper class) 선언
		Set<Integer> set = new HashSet<Integer>();
		
		
		// 연산할 땐 기본 타입
		// 객체 사용시엔 참조 타입
		Integer i = (int)(Math.random()*10); // Math는 연산 -> int로 담고 그게 자동으로 Integer로 변환(오토박싱)
		System.out.println(i);
		System.out.println(i.hashCode());
		System.out.println(System.identityHashCode(i));
		
		int loopCnt = 0;
		
		while(true) {
			loopCnt++;
			Integer n = (int)(Math.random()*10);
			set.add(n);
			if(set.size()==5) {
				break;
			}
		} // while
		System.out.println("중복되지 않는 set 객체 출력 : "+set);
		System.out.println("반복횟수 : "+loopCnt);
		
		// JCF를 array로 변경
		Integer[] arryI = (Integer[])set.toArray(new Integer[0]); // 자동 sort
		System.out.println(arryI);
		System.out.println(Arrays.toString(arryI));
		
		// 안에 포함되어 있으면 true
		Integer[] result = {3,4,6,8,0};
		int successCnt = 0;
		for (int j = 0; j < result.length; j++) {
			boolean isc = set.contains(result[j]);
			if(isc) {
				successCnt++;
			}
		}
		switch (successCnt) {
		case 3:
			System.out.println("오늘은 로또를 구입하자");
			break;

		default:
			System.out.println("공부를 열심히 하자");
			break;
		}
		set.contains(3);
		// import / 외부 라이브러리 사용
		// package는 라이브러리 개발 2단위 이상
		Set<Integer> inSet = Sets.newHashSet(1,2,3,1); // 중복된 값을 넣으면 1개만 들어간다 -> [1,2,3]
		System.out.println(inSet); // toString override 되어 있음
		// 같은 객체라면 
		// 문제) 	1. 기존 객체 유지?
		//				2. 기존 객체 제거?
		
		
	 }
}

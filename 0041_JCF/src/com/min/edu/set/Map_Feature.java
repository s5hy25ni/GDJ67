package com.min.edu.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Feature {

	public void map_Check() {
		
		Map<String, Integer> maps = new HashMap<String, Integer>();
		// key와 value로 입력해야 한다.
		// key는 중복 안 됨, value는 중복 가능
		// key가 중복된 값이 있다면 value의 처리는 어떻게 될까?
		
		maps.put("가", 10);
		maps.put("나", 20);
		maps.put("다", 30);
		maps.put("라", 40);
		
		// key를 알지 못하면 값을 추출할 수 없음
		System.out.println(maps.get("라"));
		System.out.println(maps.get("마")); // 없는 애가 나오면 null(공간은 있지만 값은 없다 <-> index는 indexOutOfBound
		
	}
	public void map_use() {
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		// key가 없으면 값을 찾을 수 없음
		
		maps.put("가", 10);
		maps.put("나", 20);
		maps.put("다", 30);
		maps.put("라", 40);
//		maps.put("라", 50);
		maps.put("마", 50);
		
		// map은 key로만 가져올 수 있어서 향상된 for문 불가능
//		for (String string : maps) {
//			
//		}
		
		for (Map.Entry<String, Integer> entry : maps.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+"/"+val);
			
		}
		
		// 삭제
		String rm = "10";
		Integer rmI = 10;
		maps.remove(rm); // 키 값만 확인, 위 rm과 rmI는 의미 없음
		System.out.println(maps);
		
		System.out.println(maps.remove("마", 50));
		System.out.println(maps);
		
		System.out.println(maps.containsKey("사"));
		System.out.println(maps.containsKey("가"));
		System.out.println(maps.containsValue(50));
		System.out.println(maps.containsValue(10));
		
		// 출력
		Set<String> keys = maps.keySet(); // map의 key 값들을 모두 set 타입으로 만들어 줌
		System.out.println("맵의 키들 : "+keys);
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name + " : " + maps.get(name));
//			System.out.println(iter.next());
//			System.out.println(iter.next());
//			System.out.println(iter.next());
//			System.out.println(iter.next());  // 들어있는 값 이상을 찾으면 NoSuchElementExceptino
		}
		
	}
}

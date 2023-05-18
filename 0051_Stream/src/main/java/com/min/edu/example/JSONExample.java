package com.min.edu.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

// JSON은 키와 값으로 구성되어 있는 문자열이다.
// 파일 혹은 문자열의 JSON 구조를 쉽게 선택, 탐색하기 쉽도록 JSON 객체 <=> JCF와 호환
// {"key1":"value1","key2":"value2",...} => JSONObject
// {"key" : [{"key":value1"},{"key":"value2"},...]} => JSONObject
// [{"key":value1"},{"key":"value2"},...] => JSONArray
public class JSONExample {

	public static void main(String[] args) {
		String json = "{\"name\":\"산군\",\"address\":\"흰산\"}";
		System.out.println("String like json"+json);
		
		Gson gObject = new Gson();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "산군");
		map.put("address", "흰산");
		
		// Map to Json
		String jsonMap = gObject.toJson(map);
		System.out.println("Map 객체를 JSON 형태의 문자열로 변경 : "+jsonMap);
		
		// Json to Map											json을			type으로		invoke
		Map mapJson = gObject.fromJson(jsonMap, Map.class);
		System.out.println("JSON 형태의 문자열을 Map 객체로 변경 : "+mapJson.toString());
		
		// 보통 HashMap<String, HashMap<String, String>>?
		
		
		// --- JSON 객체를 생성하는 방법
		// Map -> libray 사용 -> JSON String -> Rest 처리로 전달
		JsonObject obj = new JsonObject();
		obj.addProperty("name", "녹치");
		obj.addProperty("id", "nokchi");
		obj.addProperty("password", "단약");
		obj.addProperty("age", "100");
		
		System.out.println("JsonObject로 작성 : "+obj);
		
		// String 형태의 JSON 이던, json 파일을 읽어오던
		// JSON 객체의 내부 값을 가져오는 방법
		// 타입에 따라 가져와야 함
		// obj.get("name") -> JsonElement
		JsonElement ele = obj.get("name");
		System.out.println(ele.toString());
		System.out.println("JSON String : "+obj.get("name").getAsString());
		System.out.println("JSON Integer : "+obj.get("age").getAsInt());
		
		
		JsonObject book1 = new JsonObject();
		book1.addProperty("name", "자바의 정석");
		book1.addProperty("publisher", "한빛미디어");
		book1.addProperty("price", "38000");
		
		JsonObject book2 = new JsonObject();
		book2.addProperty("name", "Oracle");
		book2.addProperty("publisher", "Oracle");
		book2.addProperty("price", "27000");
		
		JsonArray bookStore = new JsonArray();
		bookStore.add(book1);
		bookStore.add(book2);
		
		JsonObject shop = new JsonObject();
		shop.add("pub", bookStore);
		
		System.out.println(bookStore.toString());
		System.out.println(shop.toString());
		
		JsonElement ele_no1 = shop.get("pub");
		JsonArray jArr = ele_no1.getAsJsonArray();
		System.out.println(ele_no1);
		System.out.println(jArr.get(0).getAsJsonObject().get("name").getAsString());
	}
	
	
	
}

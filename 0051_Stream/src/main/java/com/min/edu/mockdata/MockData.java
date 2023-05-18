package com.min.edu.mockdata;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.min.edu.beans.Car;
import com.min.edu.beans.Person;

/*
 * src/test/resources에 있는 json 파일(Car.json, Person.json 파일을 
 * JSON 데이터 객체로 만들어 줌
 * JSON -> JAVA 객체로 만들어서 사용
 */
public class MockData {
	public static List<Person> getPeople() throws IOException {

		// 현재 프로젝트에 있기 때문에 이름만 써도 가져옴 (ex)people.json
		// 혹시 C드라이브 등에 있다면 절대 경로로 써줘야 함
		// json 파일을 읽어서 010101... 데이터로 읽어 메모리에 할당
		InputStream inputStream = Resources.getResource("people.json").openStream();
		// 한글로 변환
		String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
		
		// 객체의 타입을 가져옴 invoke, reflection
		// 원래는 타입을 넣어서 new
		@SuppressWarnings("serial") // 얘 아는 애니까 넘어가라고 jvm에 알려줌
		Type listsType = new TypeToken<ArrayList<Person>>() {}.getType();
		
		// json 파일을 listsType으로 객체 생성해줘
		return new Gson().fromJson(json, listsType);
	}
	
	public static List<Car> getCar() throws IOException {

		// 현재 프로젝트에 있기 때문에 이름만 써도 가져옴 (ex)people.json
		// 혹시 C드라이브 등에 있다면 절대 경로로 써줘야 함
		// json 파일을 읽어서 010101... 데이터로 읽어 메모리에 할당
		InputStream inputStream = Resources.getResource("cars.json").openStream();
		// 한글로 변환
		String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
		
		// 객체의 타입을 가져옴 invoke, reflection
		// 원래는 타입을 넣어서 new
		@SuppressWarnings("serial") // 얘 아는 애니까 넘어가라고 jvm에 알려줌
		Type listsType = new TypeToken<ArrayList<Car>>() {}.getType();
		
		// json 파일을 listsType으로 객체 생성해줘
		return new Gson().fromJson(json, listsType);
	}
}

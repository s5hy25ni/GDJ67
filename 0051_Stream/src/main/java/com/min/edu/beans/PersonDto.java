package com.min.edu.beans;

public class PersonDto {

	private final Integer id;
	private final String name;
	private final Integer age;

	public PersonDto(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonDto [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public static PersonDto map(Person p) {
		return new PersonDto(p.getId(), p.getFirstName(), p.getAge());
	}

}

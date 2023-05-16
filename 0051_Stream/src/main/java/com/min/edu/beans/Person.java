package com.min.edu.beans;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 4706938115657161629L;
	public final Integer id;
	public final String firstName;
	public final String lastName;
	public final String email;
	public final String gender;
	public final Integer age;

	public Person(Integer id, String firstName, String lastName, String email, String gender, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gender=" + gender + ", age=" + age + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public Integer getAge() {
		return age;
	}

}

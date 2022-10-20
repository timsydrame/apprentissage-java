package com.timsy.practice;

public class Person {
	private String firstName;

	private String firstname;
	private String name;
	
	public Person(String firstName, String name) {
		this.firstName = firstName;
		this.name = name;
	}
    
	public String toString() {
		return "Person[" + firstName + " " + name + "]";
	}
}

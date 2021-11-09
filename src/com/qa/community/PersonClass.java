package com.qa.community;

public class PersonClass {

	private String firstName;
	private String lastName;
	private int age;
	private String city;
	private double height;

	public PersonClass(String firstName, String lastName, int age, String city, double height) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
		this.height = height;

	}

	public PersonClass(String firstName, String lastName, double height) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;

	}

	public void nameHeight() {

		System.out.println(firstName + " " + lastName + " height is: " + height);
	}

	public void greet() {
		System.out.println("Hello " + firstName + " " + lastName + ".");
	}

	public void age() {
		System.out.println("Hello " + firstName + " you are: " + age + " years old.");
	}

}
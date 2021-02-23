package com.amazon.alexa.demo;

public class Student extends Person {
	void message() {
		System.out.println("student class");
	}
	
	void display() {
		message();
		super.message();
	}

}

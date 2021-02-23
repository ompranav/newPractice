package com.amazon.alexa.demo;

public class Demo_Encapsulation {
	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		obj.setName("Pranav");
		obj.setAge(25);
		obj.setRoll(251);
		
		System.out.println("Name = " + obj.getName());
		System.out.println("Age = " + obj.getAge());
		System.out.println("Roll = " +obj.getRoll());
	}

}

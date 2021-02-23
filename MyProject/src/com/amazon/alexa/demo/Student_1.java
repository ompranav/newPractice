package com.amazon.alexa.demo;

public class Student_1 {
	
	String name;
	int roll_number;
	
	Student_1 (String name , int roll_number ) {
		this.name = name;
		this.roll_number =roll_number;
	}
	

	public static void main(String[] args) {
		Student_1 s1 = new Student_1 ("raj" , 121);
		Student_1 s2 = new Student_1 ("mahesh" , 143);
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.toString());



		

	}

}

package com.amazon.alexa.demo;

public class Aaa {
	
	Aaa()
	{
		System.out.println("constructor of class AAA");
	}
	
	static {
		System.out.println("static block of class AAA");
	}
	
	{
		System.out.println("non static bloc of lass AAA");
	}
	public void m1() {
		System.out.println("m1 method of class AAA");
	}
}

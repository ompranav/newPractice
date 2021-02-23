package com.amazon.alexa.demo;

public class Demo_Inheritance {
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		b1.print();
		
		System.out.println("--------------------");
		B.disp();
		System.out.println(B.j);
	}

}

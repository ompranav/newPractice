package com.amazon.alexa.demo;

public class Demo_Multilevel_Inheritance {
	public static void main(String[] args) {
		Three three = new Three();
		three.print();
		three.printer();
		three.printed();
		One.display();
	}

}

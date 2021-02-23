package com.amazon.alexa.demo;

public class Two extends One{
	void printer() {
		System.out.println("printer");
	}
	
	public static void main(String[] args) {
		Two t = new Two();
		t.print();
		display();
	}

}

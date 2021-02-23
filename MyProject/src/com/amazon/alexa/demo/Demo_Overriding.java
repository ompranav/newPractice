package com.amazon.alexa.demo;

public class Demo_Overriding {
	public static void main(String[] args) {
		Mammal m1 = new Mammal();
		m1.speak();
		
		Animal a1 = new Animal();
		a1.spak();
		
		Dog d1 = new Dog();
		d1.speak();
		
	}

}

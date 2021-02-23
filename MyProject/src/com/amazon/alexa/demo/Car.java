package com.amazon.alexa.demo;

public class Car extends Vehicle {
	int max_speed = 180;
	void display() {
		System.out.println("maximum speed :" + super.max_speed);
	}

}

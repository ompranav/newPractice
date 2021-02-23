package com.amazon.alexa.demo;



public class Demo_Super {
	int a= 100;

	public static void main(String[] args) {
		/*Car tata_motors = new Car();
		tata_motors.display();
		System.out.println(tata_motors.max_speed);*/
		Demo_Super demo = new Demo_Super(20);
		
		
	}
public Demo_Super(int a){
	a = 10;
	System.out.println(this.a);
	System.out.println(a);
	//System.out.println(super.a);
}
}

package com.amazon.alexa.demo;

public class Demo_Method_Overloading {
	void print() {
		System.out.println("print method with no argument");
	}
	
	String print(int i) {
		System.out.println("print method with int argument");
		return "success";
	}
	
	String print(int i, int j) {
		System.out.println("print method with 2 int arguments");
		return "success 2";
	}
	
	String print (long l, long m) {
		System.out.println("print methos with 2 long arguments");
		return "success 3";
	}
	String print(int i, String str) {
		System.out.println("print method with one int and one string type argument");
		return "success 4";
	}
	
	
	public static void main(String[] args) {
		String res ;
		Demo_Method_Overloading demo = new Demo_Method_Overloading();
		demo.print();
		res = demo.print(555);
		//System.out.println(res);
		
		res = demo.print(111, 222);
		System.out.println(res);
		
		res = demo.print(100l, 200l);
		System.out.println(res);
		//System.out.println(res);
		
		res = demo.print(10, "hero");
		System.out.println(res);
		
		
	}

}

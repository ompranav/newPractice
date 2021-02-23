package com.amazon.alexa.demo;

public class Demo_Exception {
	public static int i = 10;
	public static int j ;
	
	public static void main(String[] args) {
		
		
		try {
			
			
			try {
				System.out.println("inside try block of NumberFormatException");
				int k = Integer.parseInt("abc");
			}
			
			catch(NumberFormatException e1) {
				System.out.println("catch block 2");
				e1.printStackTrace();
			}
			
			
			System.out.println("inside try block of arithmatic exception ");
			j = i/0;
			System.out.println(j);
		
		
	
		}
		
		catch (ArithmeticException e) {
			System.out.println("executing catch block of arihmatic exception ");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}

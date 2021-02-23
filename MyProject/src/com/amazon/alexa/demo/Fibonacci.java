package com.amazon.alexa.demo;

public class Fibonacci {
	
	
	public static int i=0;
	public static int j=1;
	public static int k;

	public static void main(String[] args) {
		
		System.out.print(i+" " + j+ " ");
		
		
		for (int a=0;a<=10;a++) {
			
			i=j;
			k=i+j;
			System.out.print(k + " ");
		}
	}

}

package com.amazon.alexa.demo;
import java.util.Scanner;



public class Demo25 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number ");
		int a= sc.nextInt();
		System.out.println("enter second number ");
		int b= sc.nextInt();
		System.out.println("enter third number ");
		int c =sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a + " is greater than " + b + " and " + c  );
		}
		else if (b>a && b >c) {
			System.out.println(b + " is greater  than " + a +" and "+ c);
		}
		else if (c>a && c >b) {
			System.out.println(c +" is greater than " + b + " and " + a );
		}
	}

}

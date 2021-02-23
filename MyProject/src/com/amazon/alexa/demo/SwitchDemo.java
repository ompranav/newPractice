package com.amazon.alexa.demo;
import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("plz enter the atomic number ");
		int atomicno = sc.nextInt();
		switch (atomicno) {
		
		case 1 : System.out.println(" hydrogen ");
			break;
		case 2 : System.out.println(" helium ");
			break;
		case 3: System.out.println(" berellium ");
			break;
		case 4 : System.out.println(" boron ");
		 	break;
		default : System.out.println("invalid atomic no. ");
		
		
		}
	}

}

package com.amazon.alexa.demo;

public class DefaultArrayValue {
	
	public static void main(String[] args) {
		
		System.out.println("Default values of string array");
		String str[] = new String [5];
		for(String strarray :str)
			System.out.print(strarray + " ");
		
		System.out.println();
		System.out.println("------------------------");
		
		
		System.out.println("Default values of int array ");
		int arr1 [] =new int [5];
		for (int intvar:arr1)
			System.out.print(intvar + " ");
		
		System.out.println();
		System.out.println("------------------------");
		
		System.out.println("Default values of double array ");
		double arr2 [] = new double [5];
		for(double d :arr2)
			System.out.print(d + " ");
		
		System.out.println();
		System.out.println("------------------------");
		
		System.out.println("Default values of boolean array ");
		boolean arr3[] = new boolean [5];
		for(boolean b :arr3)
			System.out.print(b + " ");
		
		System.out.println();
		System.out.println("------------------------");
		
		System.out.println("Default values of reference array ");
		DefaultArrayValue vardemo[] = new DefaultArrayValue [5];
		for (DefaultArrayValue d :vardemo )
			System.out.print(d + " ");
		
		
	}
	

}

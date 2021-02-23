package com.amazon.alexa.demo;

public class TestArray {
	
	public static void main(String args[]){

		int a[]=new int[5];//declaration and instantiation
		a[0]=10;//initialization
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;
	   System.out.println(highestNumber(a));
		
	}
		public static int highestNumber(int arr1[]) {
		int maxSoFar = arr1[0];
		for (int arr1var :arr1) {
		if(arr1var>maxSoFar) {
		maxSoFar = arr1var;
		}
		}
		return maxSoFar;
		}

		

}

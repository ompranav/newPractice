package com.amazon.alexa.demo;

public class Demo_Arr {
	
	public static void main(String[] args) {
		
		int arr [] = new int [3];
		arr [0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i =0; i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
			
		System.out.println("-------------------------");
		
		String [] words = new String[3];
		words[0] = "i" ; 
		words[1] = "love " ; 
		words[2] = "you ";
		
		for (String word:words) {
			System.out.println(word);
		}
		
		System.out.println("---------------------------");
		
		int arr1 [] = new int [5];
		arr1 [0] =10;
		arr1 [1] =20;
		arr1[2] = 30;
		arr1[3] =40;
		arr1[4] =50;
		
		
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
		System.out.println("------------------------------");
		System.out.println("-------------------------------");
		
		
		int arr2 [] = new int [5];
		int val =10;
		
		for (int i=0;i<arr2.length;i++) {
			arr2[i] =val;
			val+=10;
		}
		
		for (int i=0;i<arr2.length+2;i++) {
			System.out.println(arr2[i]);
		}
		
	}
	

}

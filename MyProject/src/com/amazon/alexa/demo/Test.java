package com.amazon.alexa.demo;

public class Test  {
	
	
	
	public static void main(String[] args) {
		int arr1 [] = new int [3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
			}
		System.out.println();
		System.out.println("--------------------------");
		
		String [] words = new String [4];
		words [0] = "i";
		words [1] = "love";
		words [2] = "java";
		words [3] ="programming";
		
		for (String word :words) {
			System.out.print(word +" ");
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		
		
		
		 Vegetable arr_veg [] =new Vegetable [3];
		 arr_veg [0] = new Vegetable ();
		 arr_veg [1] = new Cauliflower ();
		 arr_veg [2] = new Cabbage ();
		 
		 for (Vegetable veggie :arr_veg) {
			 System.out.print(veggie + "  ");
		 }
		 
		 
		System.out.println();
		 System.out.println("----------------------");
		 System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		 
		 int arr2 [] = new int [5];
		 int val = 10;
		 
		 
		 for(int j=0; j<arr2.length;j++) {
			 arr2[j] = val;
			 val += 10;
		 }
		
		for (int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}
		
	}
}

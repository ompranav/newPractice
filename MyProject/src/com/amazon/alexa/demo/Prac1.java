package com.amazon.alexa.demo;

public class Prac1 {
	public static void main(String[] args) {
		/*Orange o1 = new Orange ();
		System.out.println(o1);
		System.out.println(o1.toString());
		
		//String s = new String (12);
		//System.out.println(s);
		//System.out.println(s.toString());
		
		Aa a1 =new Aa();
		System.out.println(a1);
		System.out.println(new Aa());
		System.out.println(a1.toString());
		
		Bb b1 = new Bb() ; 
		System.out.println(b1);
		
		System.out.println(new Bb());
		System.out.println(b1.toString());
		System.out.println(new Prac1()); */
		
		
		Orange o1 = new Orange ();
		Orange o2 = new Orange ();
		Orange o3 = new Orange ();
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		System.out.println(o1 == o3);
		System.out.println(o1.equals(o3));
		
		
		o1 = o3 ;
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o1 == o3);
		System.out.println(o1.equals(o3));
		
		System.out.println("------------------------------------");
		
		Apple a1 = new Apple (100);
		Apple a2 = new Apple (200);
		Apple a3 = new Apple (100);
		
		
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		
		System.out.println(a1.equals(a3));
		
		
		
		
		
		
	
	
	}
	

}

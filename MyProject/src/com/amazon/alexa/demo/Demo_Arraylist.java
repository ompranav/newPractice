package com.amazon.alexa.demo;

import java.util.ArrayList;

public class Demo_Arraylist {
	public static void main(String[] args) {
		
		ArrayList lst = new ArrayList();
		lst.add(10);
		lst.add(true);
		lst.add("hello");
		lst.add(new String("Bangalore"));
		lst.add(new Orange());
		lst.add(10);
		lst.add(null);
		
		Orange o1 = new Orange ();
		lst.add(o1);
		
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println(lst.contains(true));
		System.out.println(lst.contains("Bangalore"));
		System.out.println(lst.contains(o1));
		System.out.println(lst.contains(new Orange()));
		
		System.out.println(lst.get(3));
		System.out.println(lst.get(4));
		
		if(lst.get(2) instanceof String) {
			System.out.println(((String) lst.get(2)).length());
	    }
		
		System.out.println("get all objects and print it ");
		for(int i =0;i<lst.size();i++) {
			System.out.print(lst.get(i) + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("get all objects and print it using enhanced for loop");
		for (Object obj: lst) {
			System.out.print(obj + " ");
		}
		
		
		System.out.println();
		System.out.println("add objects of same type ");
		
		ArrayList <String> lst2 =new ArrayList <String> ();
		lst2.add("Raja Babu");
		lst2.add("Sonu Babu");
		lst2.add("Moon ji");
		
		for (Object obj2 :lst2) {
			System.out.print(obj2 + "||||| ");
		}
		
		
		
		
	}

}

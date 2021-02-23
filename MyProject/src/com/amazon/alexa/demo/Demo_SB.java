package com.amazon.alexa.demo;

public class Demo_SB {

	public static void main(String[] args) {
	
	
	
		StringBuffer sb1= new StringBuffer(); 
		//sb1="hello";
		 System.out.println(sb1);
		 
		 sb1.append("hello");
		 System.out.println(sb1);
		 
		 StringBuffer sb2 = new StringBuffer("bngalore");
		 
		
		 StringBuffer sb3 = sb2.reverse();
		 System.out.println(sb1);
		 System.out.println(sb2);
		 System.out.println(sb3);
		 
		 System.out.println(sb2==sb3 );
		 
		 StringBuffer sb4 = new StringBuffer("i love you java");
		//tring str= sb4.delete(2,7).toString();
		//ystem.out.println(str);
		 
		 String str2 = sb4.deleteCharAt(0).toString();
		 System.out.println(str2);
		 
		 sb4 = new StringBuffer();
		 System.out.println(sb4.length());
		 
		 sb4.append("java developer");
		 sb4.insert(4,"om");
		 System.out.println(sb4);
		 
		System.out.println("-------------------------------"); 
		 StringBuilder sb5 =new StringBuilder("selenium");
		 System.out.println(sb5);
		 StringBuilder sb11;
		 System.out.println(sb11=sb5.insert(4, "haha"));
		 System.out.println(sb5);
		 
		 
		 //to everse a tring 
		 
		 String s = "hello" ;
		 StringBuffer s111b =  new StringBuffer(s);
		 
	                                        
	 
	
	
	}	
}

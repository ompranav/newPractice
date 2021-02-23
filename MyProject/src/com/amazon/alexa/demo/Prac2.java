package com.amazon.alexa.demo;

public class Prac2 {
	

	

	public static void main(String[] args) {
		/*int i =10;
		//System.out.println(i); 
		
		Integer intObj1 = new Integer(i);
		System.out.println(intObj1);
		System.out.println(intObj1.getClass());
		
		Integer intObj2 = new Integer(100);
		System.out.println(intObj2);
		
		Integer intObj3 = new Integer ("300");
		System.out.println(intObj3);
		
		Integer intObj4 = 400;
		System.out.println(intObj4);
		
		
		System.out.println("-----------------unboxing ------------");
		
		int j = intObj1.intValue();
		System.out.println(j);
		
		System.out.println("----------unboxing and auto widening -------");
		double d = intObj2.doubleValue(); 
		System.out.println(d);
		
		System.out.println("--------boxing -------");
		
		Double dd = new Double (d);
		System.out.println(dd);
		
		System.out.println("----unboxing and  narrowing ------");
		int k = dd.intValue();
		System.out.println(k);
		
		System.out.println("unboxing and explicicit narrowing ");
		
		int m =(int) dd.doubleValue();
		System.out.println(m); 
		*/
		int i =10;
		byte b = 123;
		Long ll = new Long (i);
		Long ll1 = new Long (b);
		
		System.out.println(ll1);
		System.out.println(ll); 
		
		long l = 100;
		Byte bb = new Byte ((byte)l);
		System.out.println(bb);
		
		Character ch = new Character('A');
		System.out.println(ch);
		
		ch = new Character ((char) 100);
		System.out.println(ch);
		
		
		System.out.println("-converting object to string ------");
		
		String s1 = ll.toString();
		System.out.println(s1);
		
		Double dd = new Double (100);
		System.out.println(dd.toString());
		
		String s2 = Double.toString(10.22);
		System.out.println(s2);
		
		System.out.println(Long.toString(100l));
		
		
		System.out.println(Byte.toString((byte)101));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

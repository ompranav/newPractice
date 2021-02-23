package com.amazon.alexa.demo;

public class Prac3 {
	public static void main(String[] args) {
		
	String s1 = new String ("raja");
	/*String s2 = new String ("babu");
	
	String s3 = s1+s2;
	System.out.println(s3);
	
	String s4 = "rajababu" ;
	
	String s5 = "raja" + "babu" ; 
	
	System.out.println(s3==s4);
	System.out.println(s4==s5);
	
	String s6 = s1+"babu";
	System.out.println(s3==s6);
	
	System.out.println(s1.length());
	System.out.println(s1.concat("hello"));
	System.out.println(s1);
	System.out.println("-----------------");
	String s7 = new String();
	System.out.println(s7);
	System.out.println(s7.isEmpty());
	s7=s7.concat("bangloreisacity");
	System.out.println(s7);
			
			
	System.out.println(s7.contains("isa"));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(null));
	System.out.println(s1.equals("raja"));
	System.out.println(s1.equals(new String("raja")));
	System.out.println(s1.equals(s1));*/
	
	s1 = " i love java and i love selenium and i love and love  machine learning and i love data science ";
	
	String search_word = "love" ;
	int index = 0;
	int cntr = 0;
	
	while( (index=s1.indexOf(search_word, index))!=-1)
	{
		
		cntr++;
		index=index+search_word.length();
		
	}
	
	System.out.println(search_word + " has repeated " + cntr + " times");
	

//	s1 = "javadeveloper";
//	
//	System.out.println(s1.replace('e', 'E'));
//	System.out.println(s1.replaceAll("l", "L"));
//	             
//	System.out.println(s1.charAt(0));
//	System.out.println(s1.charAt(s1.length()-1));
//	
//	char ch = s1.charAt(1);
//	System.out.println(ch);
//	System.out.println("----------------------------");
//	
//	s1 = "JackAndJill" ;
//	
//	for(int i =0; i<s1.length(); i++) {
//		System.out.print(s1.charAt(i));
//	}
//	
//	System.out.println();
//	
//	
//	
//	for (int i = s1.length()-1 ; i>=0 ; i--) {
//		System.out.print(s1.charAt(i));
//	}
//	
//	System.out.println();
//	
//	System.out.println(s1.toUpperCase());
	
	
	s1 = "                rajesh and mahesh           ";
	char ch[] = s1.toCharArray();
	String s3 = " ";
	
	for (int i =ch.length-1; i>=0; i--) {
		s3=s3+ch[i];
		System.out.println(s3);
	}
	
	System.out.println(s1.substring(11));
	
	System.out.println(s1.substring(7, 10));
	System.out.println(s1.length());
	System.out.println(s1.trim());
	System.out.println(s1.trim().length());
	
	
	
	}

}

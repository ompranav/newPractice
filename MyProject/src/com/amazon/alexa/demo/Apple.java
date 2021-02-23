package com.amazon.alexa.demo;

public class Apple {
	
	int wt ;
	Apple (int rt) {
		this.wt = rt ;
	}
	
	public String toString () {
		return "wt= " + wt;
		}
	
	public boolean equals (Object o) {
		return this.wt == ((Apple) o).wt ;
	}

}

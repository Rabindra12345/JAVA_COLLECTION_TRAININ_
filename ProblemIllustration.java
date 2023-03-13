package com.rabindra.collection;

public class ProblemIllustration {
	
	//HERE TO ADD TWO DECIMAL CONTAINING NUMBER AND INTEGER NUMBER WE NEED TWO SEPERATE METHOD 
	// FOR THE ADDITION OF EACH TYPE ...
	
	public static void add (int x , int y) {
		
		int result = x + y ;
		
		System.out.println("THE FINAL RESULT IS:"+ result);
	}
	
	public static void add (double x, double y ) {
		
		double result = x + y ;
		System.out.println("THE FINAL RESULT IS :"+ result );
	}

	public static void main(String[] args) {

		add(2,4);
		
		add (2.4,2.4);
	}

}

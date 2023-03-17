package com.rabindra.collection.boundedgenerics;

public class BoundedGenericsTYPE {
	
	public static <T extends Comparable<T>> T calculatMin(T num1, T num2) {
		
		if(num1.compareTo(num2)<0) {
			return num1;
		}
		return num2;
	}

	public static void main(String[] args) {

		//System.out.println("Min value is " + calculatMin(23,28));
		
		//with string a comes first so a is considered min than any other alphabet while comparing 
		//System.out.println("Min string value is "+ calculatMin("NAME","FAME"));
		
		//character comparision
		System.out.println("Min string value is "+ calculatMin("A","F"));

	}

}

package com.rabindra.collection.genericsmethod;

public class GenericMethod3WithArray {
	
	public <T> void printArray(T[] arr) {
		
		for(T a : arr) {
			
			System.out.println(a);
		}
		
	}

}

package com.rabindra.collection;

public class TypeCastingWithGenerics {
	
	public static void main(String [] args) {
		
		StoreForTCWithGenerics <Integer> store = new StoreForTCWithGenerics <>(); 
		
		store.setItem(23);
		
		Integer item = store.getItem();
		
		System.out.println(item);
		
	}

}

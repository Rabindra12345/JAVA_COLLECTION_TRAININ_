package com.rabindra.collection.genericsmethod;

public class GenericsMethod {

//	public <T> void showItem(T item){
//		
//		System.out.println("The item is:"+ item);
//	}
	
	public <T> T showItem(T item){
		
		System.out.println("The item is:"+ item);
		
		return item;
	}
}

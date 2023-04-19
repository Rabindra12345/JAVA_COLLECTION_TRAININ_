package com.rabindra.collection.genericsmethod;

public class GenericMethod2Param {

	public <K, V> void showItem(K key, V value){
		
		System.out.println(key.toString());
		System.out.println(value.toString());
		
	}
}

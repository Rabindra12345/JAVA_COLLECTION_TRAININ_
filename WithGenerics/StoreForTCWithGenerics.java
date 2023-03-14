package com.rabindra.collection;


//Here we can use any alphabet T,E,V which are most commonly used with generics 
//we can use any words as well such as Item
public class StoreForTCWithGenerics <T> {

	//store for TypeCastingWithGenerics
	T item ;
	
	public T getItem() {
		
		return this.item;
	}
	
	public void setItem(T item) {
		
		this.item = item;
	}

}

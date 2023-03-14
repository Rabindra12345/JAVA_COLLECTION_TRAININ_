package com.rabindra.collection.multiplegenerics;

public class HashTable <K,V> {

	
	private K key;
	
	private V value ;
	
	public HashTable(K k, V v) {
		
		this.key=k;
		this.value= v;
	}
	
	@Override
	public String toString() {
		
		return "HashTable [Key = " +key +" , Value ="+ value +" ]";
		
	}
	
	//with formatting 
	 //public String toString() {
	        //return String.format("MyClass [field1=%d, field2='%s', field3=%b]", field1, field2, field3);
	   // }
	
	
}

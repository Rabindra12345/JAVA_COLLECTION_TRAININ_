package com.rabindra.collection.multiplegenerics;

public class MultipleGenericsType {

	
	static HashTable<Integer, Integer> mgt = new HashTable<>(3,4);
//	static HashTable ht = new HashTable(2,3);
	
	public static void main (String [] args) {
		System.out.println(mgt);
	}
}

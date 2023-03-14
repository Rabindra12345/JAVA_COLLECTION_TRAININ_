package com.rabindra.collection;

public class TypeCastingReqdWithoutGenerics {

	public static void main(String[] args) {

		StoreForTCRWG store = new StoreForTCRWG();
		
		//int item =(int) store.getItem();
		
		store.setItem(25);
		
//		Integer item =(Integer)  store.getItem();
		
		//ISSUES APREARS WHEN WE DO NOT DO AS LINE 13 AND DO AS BELOW
		int item = store.getItem();
		
				
		System.out.println(item);
	}

}

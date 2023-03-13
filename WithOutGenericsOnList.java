package com.rabindra.collection;

import java.util.ArrayList;
import java.util.List;

public class WithOutGenericsOnList {

	//CHECKING WITHOUT CASTING ...
	private static List list =null;

	public static void main(String [] args) {
		list = new ArrayList();

		list.add("hello rabindra");
		
		String name =(String) list.get(0);
		
//		String name = list.get(0);
		
		System.out.println(name);
		
	}
	
	
	
}

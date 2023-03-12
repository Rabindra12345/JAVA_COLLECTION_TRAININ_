package com.rabindra.random;

public class ObjectClass {

	public static void main(String[] args) {

//		Object x = 5;
		
//		Object x = "Rabindra";
		
//		Object x = 'R';
		
		
		//Object x1 and x2 gives the double.
		//Object x1= 2.5;
		
		//Object x2= 2.50000000;
		
//		Object x= 2.5f;
		
		//WE CAN'T DIRECTLY ASSIGN CHARS TO Object type like this
		//Object x = {'a','b','c','d'};
		//Insted you can do this,
		Object x = new char[] {'a', 'b', 'c', 'd'};
		//OR --block initialized
//		char[] alpha = {'a','b','c'};
		
//		Object x = alpha;
		
		System.out.println(x.getClass());
	}

}

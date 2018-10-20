package com.practise.collections;

import java.util.Vector;



public class VectorExample {

public static void main(String[] args) {	
	Vector vector = new Vector<>();
	//	Vector(< Java 1.2):	Same as ArrayList but Synchronized
	//	Default Capacity is 10 and Size is 0
	System.out.println("Default Vector Size:"+vector.size());
	System.out.println("Default Vector Capacity:"+vector.capacity());
	// Will throw an Exception
	//	System.out.println("\nvector.firstElement:"+vector.firstElement());
	//	System.out.println("vector.lastElement:"+vector.lastElement());
	for(int i=0;i<11;i++)
		vector.add(i);
	// Vector Size shud be less than capacity	
	//	When Size is Full capacity  Increases by Double
	System.out.println("After init Vector Size:"+vector.size());
	System.out.println("Capacity:"+vector.capacity());
	for(int i=0;i<vector.size();i++)
		System.out.print(" "+vector.get(i));
	vector.add(2,11);
/*	Inserts the specified element at the specified position and 
	Shifts the element currently at that position  
	and any subsequent elements to the right.
*/
	System.out.println("\nAfter adding Vector Size:"+vector.size());
	System.out.println("Capacity:"+vector.capacity());
	for(int i=0;i<vector.size();i++)
		System.out.print(" "+vector.get(i));
	
	System.out.println("\nvector.firstElement:"+vector.firstElement());
	System.out.println("vector.lastElement:"+vector.lastElement());

}

}

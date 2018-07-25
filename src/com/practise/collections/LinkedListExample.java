package com.practise.collections;

import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList linkedList = new LinkedList();
	System.out.println("Default linkedList Size:"+linkedList.size());
// Will throw an Exception
//	System.out.println("linkedList.getFirst:"+linkedList.getFirst());
//	System.out.println("linkedList.getLast:"+linkedList.getLast());
	for(int i=0;i<6;i++)
		linkedList.add(i);
	System.out.println("After Init linkedList Size:"+linkedList.size());
	System.out.println("linkedList.getFirst:"+linkedList.getFirst());
	System.out.println("linkedList.getLast:"+linkedList.getLast());

	
}	
}

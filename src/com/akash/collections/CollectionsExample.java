package com.akash.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsExample {
public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	for(int i=0;i<6;i++){
		arrayList.add(""+i);}
	System.out.println();
	for(String object : arrayList)
		System.out.print(" "+object);
	
	System.err.println("\n-------------Sorting----------------\n");
	Collections.sort(arrayList);
	System.out.println();
	for(String object : arrayList)
		System.out.print(" "+object);
	
	System.err.println("\n-------------Shuffling----------------\n");
	//Collections.shuffle(arrayList);
	
	System.out.println();
	for(String object : arrayList)
		System.out.print(" "+object);
	
	Collections.sort(arrayList);
	System.out.println("\nSearch"+Collections.binarySearch(arrayList,"4"));
	// List Must be sorted before hand
	// Binary Search First Checks for RandomAccess Interface
	// If yes then indexBinarySearch is called else IteratorBinarySearch

	System.err.println("\n-------------Defensive Copy ----------------\n");
	Collections.unmodifiableList(arrayList);
}
}

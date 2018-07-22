package com.akash.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
	TreeMap<String,Integer> treeMap = new TreeMap<>();
	System.out.println("Default treeMap size:"+treeMap.size());
	treeMap.put("one",1 );
	treeMap.put("two",2 );
	treeMap.put("three",3 );
	treeMap.put("four",4 );

	 Object keyArray[]=  treeMap.keySet().toArray();
	for(int i=0;i<keyArray.length;i++)
		System.out.println(treeMap.get(keyArray[i]));


}

	
}

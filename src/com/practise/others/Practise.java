package com.practise.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practise {
	
	 public static void main(String[] args) {
		ArrayList<String> arrayList = 
				new ArrayList<>();
				arrayList.add("Biju");
				arrayList.add("Akash");
				arrayList.add("Ram");
				arrayList.add("akash");
				
		Collections.sort(arrayList);		
		for(String string: arrayList)System.err.println(string);		
		Object object[] = arrayList.toArray();
		Arrays.sort(object);
		for(Object object2 : object)
			System.out.println(object2);
		
		
		
	}
}

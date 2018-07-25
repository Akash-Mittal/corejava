package com.practise.programs;


public class StringRelated {

	public static String reverse(String string){
		StringBuffer reverseString=new StringBuffer();
		for(int i=string.length()-1;i>=0;reverseString.append(string.charAt(i--)));
		return new String(reverseString);
	}
	public static void main(String[] args) {
		System.out.println(reverse("Boeing 747"));
	}
}

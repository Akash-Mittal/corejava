package com.practise.programs;

public class Prime {
	static boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	    	if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		for(int i=10;i<99;i++){
			if(isPrime(i))
			System.out.println("Prime # "+i);
		}
	}
	
	
}

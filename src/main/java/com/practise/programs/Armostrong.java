package com.practise.programs;

// sum of the cubes of its digits is equal to the number itself. 
//For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.

public class Armostrong {
	static int sum1l=0;
	static boolean flag = false;
	public static int check(int i) {
		if(i<1){
			return sum1l;
		}
		else{
		sum1l=sum1l+(i%10)*(i%10)*(i%10);
		check(i/10);
		}
		return sum1l;
	}
	
public static void main(String[] args) {
	for(int number=0;number<10;number++){
		int sum=0;
		for(int i=number;i>0;i=i/10){
			sum = sum+(i%10)*(i%10)*(i%10);
		}
	//	if(sum==number)
		//System.out.print(sum+",");
	}
	
	
	System.out.println(check(371));
}
}

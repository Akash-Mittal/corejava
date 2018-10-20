package com.practise.polymorphism;

 interface I{
	int ac=10;
	public abstract void printMe();
}

 abstract class AC {
	protected int ac1=11;
	public abstract void printMe();
	
	static abstract class AD{
	}
}
public class Inheritance extends AC implements I{
	@Override
	public void printMe() {
		System.out.println(ac+ac1);
	}
	public static void main(String[] args) {
		Inheritance inheritance = new Inheritance();
		inheritance.printMe();
		
	}
}
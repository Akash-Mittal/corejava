package com.practise.polymorphism;
public class OverLoading {
	 static int i=3;	
	void print(){
		System.out.println("Class " + getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		Y y = new Y();
		X x = (X)y;
		x.print();
		System.out.println(i);
	}
}

 class X {
	 static int i=1;
	 void print() {
		System.out.println(i+"Class " + getClass().getSimpleName());
	}
}

 class Y extends X {
	 static int i=2;
	void print() {
		System.out.println(i+"Class " + getClass().getSimpleName());
	}
//	void print() throws Exception{
//		System.out.println(i+"Class " + getClass().getSimpleName());
//	}
	
}
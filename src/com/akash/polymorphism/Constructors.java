package com.akash.polymorphism;

import java.io.InvalidClassException;


class P  {
	 P()   {
		 System.out.println("p XClass "+getClass().getSimpleName());
	}
	 
}
class Q extends P{
	Q()  {
	System.out.println("q Class "+getClass().getSimpleName());
	}

}
public class Constructors {
	public static void main(String[] args) throws Exception {
	new Q();
	}}


// Construtors// 
//Dont have a return type not even void
//Have the same name as ClassName
//IF constructors are associated with return type then they become function
//only public, protected & private are permitted
//Child Class Default constructor cannot handle exception type Exception thrown by 
//	implicit super constructor. Must define an explicit constructor


// Use of this keyword in the construtor
//Constructors use this to refer to another constructor in the same class
	//with a different parameter list.

//Use of Super keyword in the construtor
//Constructors use super to invoke the superclass's constructor.
	//If a constructor uses super, it must use it in the first line


// Exceptions
// Parent throw unchecked exeption then child can
	// 	throw any type of exception or not
// Parent throw Checked exeption then child can
	// Have to throw any of the checked exception
// Child can expand the scope of any exception

package com.practise.polymorphism;

// Classes used as return types:
 class A{
	 public A(){
	}
	  void print()  {
		System.out.println("Class "+getClass().getSimpleName());
	}}

	class B extends A  {
	public void A() {
	}

		void print () {
		System.out.println("Clazz "+ getClass().getSimpleName());}
	 }
	   

	   
public class OverRiding {
public static void main(String[] args) throws Exception {
	B a  = (B) new A();
	//a.print();
	
}
}


// Others
// In case of obtaining reference like this
// Parent parent = new Child();
// In that case if child defines some more method 
// it cannot be accessed by parent class

// Final
//Child Class and Inherited Function can be final 


// Data Members
//Doesnot Works on datamembers
// The inherited function can have more data members only final

// Return Type
//Covariant :A child class overriden method can return the same object or its child

// Static 
// Static Methods Cannot be overriden
// The Child Class Cannot change the access type to static
// Static gets memory in class area and Object in Heap

// Exception
//If parent doenot throwzs an excptn
	//The Child Class Cannot add Checked Exception on overriden method 
//If parent class throws an exception then child class
	// Can omit throw declaration
	// Can throws Exception and all child exceptions

// Access Modifiers
// Child class Cannot reduce the visibility of the inherited method
/*
Parent Class Method:Child Class Method:PSVM
public:public:
public:protected:Cannot reduce the visibility of the inherited method
public:default:Cannot reduce the visibility of the inherited method
public:private:Cannot reduce the visibility of the inherited method
::
protected:public:Can Expand the visibility of the inherited method
protected:protected:
protected:default:Cannot reduce the visibility of the inherited method
protected:private:Cannot reduce the visibility of the inherited method
::
default:public:Can Expand the visibility of the inherited method
default:protected:Can Expand the visibility of the inherited method
default:default:
default:private:Cannot reduce the visibility of the inherited method
::
::
private:public:Can Expand the visibility of the inherited method
private:protected:Can Expand the visibility of the inherited method
private:default:Can Expand the visibility of the inherited method
private:private:

*/
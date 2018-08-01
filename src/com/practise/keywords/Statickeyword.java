package com.practise.keywords;

public class Statickeyword {
    
    public static void main(String[] args) {
        MyStaticClass myStaticClass= new MyStaticClass();
        
        System.out.println(myStaticClass.foo);
        System.out.println(myStaticClass.bar);
        
    }
    
    
    static class MyStaticClass{
    public int foo = 9;
    public String bar = "Hello I am Non Static Bar in Static Class";
    
}
}


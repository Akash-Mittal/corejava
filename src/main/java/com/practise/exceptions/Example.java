package com.practise.exceptions;

public class Example {

    static class Temp {
        static int hi() throws Exception {
            try {
                return 8;
            } catch (Exception exception) {
                return 9;
            } finally {
                System.out.println("Finaally Block");
                return 10;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        System.out.println(Temp.hi());
    }

}

/*
 * Finally is useful for more than just exception handling � it allows the programmer to avoid having cleanup code
 * accidentally bypassed by a return, continue, or break. Putting cleanup code in a finally block is always a good
 * practice, even when no exceptions are anticipated.
 * 
 * Finally will only not execute when Jvm crashes System.exit is called
 */

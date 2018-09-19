package com.practise.others;

public class StringExamples {

    public static void main(String[] args) {
        String string1 = "Boeing747";
        System.out.println(string1);
        String string2 = new String("Boeing747");
        System.out.println("HashCode:" + string1.hashCode());
        System.out.println("HashCode:" + string2.hashCode());
        string1 = "Delta";
        string2 = new String("Delta");
        System.out.println("HashCode:" + string1.hashCode());
        System.out.println("HashCode:" + string2.hashCode());
        System.out.println("Equal:" + string1.equals(string2));
        final String string = "FinalString";
        // string = "";

    }
}
/*
 * java.lang.String
 * 
 * 
 * The String class represents character strings. All string literals in Java programs, such as "abc", are implemented
 * as instances of this class.
 * 
 * Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings.
 * Because String objects are immutable they can be shared. For example: String str = "abc"; is equivalent to: char
 * data[] = {'a', 'b', 'c'}; String str = new String(data);
 * 
 * The Java language provides special support for the string concatenation operator ( + ), and for conversion of other
 * objects to strings. String concatenation is implemented through the StringBuilder(or StringBuffer) class and its
 * append method. String conversions are implemented through the method toString, defined by Object and inherited by all
 * classes in Java.
 * 
 * Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a
 * NullPointerException to be thrown.
 * 
 * A String represents a string in the UTF-16 format in which supplementary characters are represented by surrogate
 * pairs (see the section Unicode Character Representations in the Character class for more information). Index values
 * refer to char code units, so a supplementary character uses two positions in a String.
 * 
 * The String class provides methods for dealing with Unicode code points (i.e., characters), in addition to those for
 * dealing with Unicode code units (i.e., char values).
 * 
 * Since: JDK1.0 Author: Lee Boynton Arthur van Hoff Martin Buchholz Ulf Zibis See Also: java.lang.Object.toString()
 * java.lang.StringBuffer java.lang.StringBuilder java.nio.charset.Charset
 */
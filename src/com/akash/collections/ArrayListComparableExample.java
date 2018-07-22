package com.akash.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListComparableExample  implements Comparable<ArrayListComparableExample>,Comparator<ArrayListExample>{
	private String bookNumber;
	private String bookName;
	public ArrayListComparableExample(String bookNumber, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
	}
	public String getBookNumber() {return bookNumber;}
	public void setBookNumber(String bookNumber) {this.bookNumber = bookNumber;}
	public String getBookName() {return bookName;}
	public void setBookName(String bookName) {this.bookName = bookName;}
	@Override
	public String toString() {
		return "ComparableExample [bookNumber=" + bookNumber + ", bookName="
				+ bookName + "]";
	}

	@Override
	public int compareTo(ArrayListComparableExample o) {
		return  Integer.parseInt(this.getBookNumber())-Integer.parseInt(o.getBookNumber()); 
	}
public static void main(String[] args) {
	List<ArrayListComparableExample> linkesList = new LinkedList<>();
	linkesList.add(new ArrayListComparableExample("1","A"));
	linkesList.add(new ArrayListComparableExample("3","B"));
	linkesList.add(new ArrayListComparableExample("2","C"));
	linkesList.add(new ArrayListComparableExample("5","V"));
	Collections.sort(linkesList);
	for(ArrayListComparableExample ex:linkesList)
	System.out.println(ex);
}
@Override
public int compare(ArrayListExample o1, ArrayListExample o2) {
	return 0;
}

}
/*
java.lang.Comparable<T>


This interface imposes a total ordering on the objects of each class 
that implements it. This ordering is referred to as the class's natural
ordering, and the class's compareTo method is referred to 
as its natural comparison method.

Lists (and arrays) of objects that implement this interface can be
sorted automatically by Collections.sort (and Arrays.sort). 
Objects that implement this interface can be used as keys 
in a sorted map or as elements in a sorted set, 
without the need to specify a comparator.

The natural ordering for a class C is said to be consistent 
with equals if and only if e1.compareTo(e2) == 0
has the same boolean value as e1.equals(e2) 
for every e1 and e2 of class C. 
Note that null is not an instance of any class, and e.compareTo(null) 
should throw a NullPointerException 
even though e.equals(null) returns false.

It is strongly recommended (though not required) 
that natural orderings be consistent with equals. 
This is so because sorted sets (and sorted maps) 
without explicit comparators behave "strangely" 
when they are used with elements (or keys)
whose natural ordering is inconsistent with equals. 
In particular, such a sorted set (or sorted map)
violates the general contract for set (or map), 
which is defined in terms of the equals method.

For example, if one adds two keys a and b such that 
(!a.equals(b) && a.compareTo(b) == 0) 
to a sorted set that does not use an explicit comparator, 

the second add operation returns false 
(and the size of the sorted set does not increase) 
because a and b are equivalent from the sorted set's perspective.

Virtually all Java core classes that implement 
Comparable have natural orderings that are consistent with equals.

One exception is java.math.BigDecimal, 
whose natural ordering equates BigDecimal 
objects with equal values and different precisions 
(such as 4.0 and 4.00).

For the mathematically inclined, the relation that defines 
the natural ordering on a given class C is:

      {(x, y) such that x.compareTo(y) <= 0}.

The quotient for this total order is: 
      {(x, y) such that x.compareTo(y) == 0}.

It follows immediately from the contract for compareTo that 
the quotient is an equivalence relation on C, 
and that the natural ordering is a total order on C. 
When we say that a class's natural ordering is consistent with equals,
 we mean that the quotient for the natural ordering is the equivalence
  relation defined by the class's equals(Object) method:
    {(x, y) such that x.equals(y)}. 
This interface is a member of the Java Collections Framework.

Parameters:
<T> the type of objects that this object may be compared to
Since:
1.2
Author:
Josh Bloch
See Also:
java.util.Comparator

*/
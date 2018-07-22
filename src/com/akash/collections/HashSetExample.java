package com.akash.collections;

import java.util.ArrayList;
import java.util.HashSet;

import com.akash.domain.Person;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("Default hashSet Size:" + hashSet.size());
        for (int i = 0; i < 6; i++)
            hashSet.add("" + i);
        System.out.println("After Init hashSet Size:" + hashSet.size());

        ArrayList<String> arrayList = new ArrayList<String>(5);
        Object[] a = arrayList.toArray();

        HashSet<Person> personHashSet = new HashSet<>();
        Person p = new Person();
        personHashSet.add(p);
        System.out.println(personHashSet);
        p.i = 5;
        personHashSet.add(p);
        System.out.println(personHashSet);
        Person p1 = new Person();
        personHashSet.add(p1);
        System.out.println(personHashSet);

    }

}

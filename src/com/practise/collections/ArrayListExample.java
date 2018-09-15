package com.practise.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>(5);
        System.out.println("Default ArrayList Size:" + arrayList.size());
        for (int i = 0; i < 6; i++)
            arrayList.add(i);
        System.out.println("After Init ArrayList Size:" + arrayList.size());
        System.out.println("aa=11".split("=")[1]);
    }

}
